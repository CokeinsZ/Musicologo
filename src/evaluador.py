from grammar.musicologoVisitor import musicologoVisitor
from grammar.musicologoParser import musicologoParser
from pydub import AudioSegment

class Evaluador(musicologoVisitor):
    def __init__(self):
        self.audio = None
        self.audio_modificado = None

    # Visit a parse tree produced by musicologoParser#inicio.
    def visitInicio(self, ctx:musicologoParser.InicioContext):
        for hijo in list(ctx.getChildren()):
            self.visit(hijo)

    # Visit a parse tree produced by musicologoParser#funcion.
    def visitCargarFuncion(self, ctx:musicologoParser.CargarFuncionContext):
        # Check if there is a third child node in the parse tree
        if ctx.getChild(3) is not None:
            # If there is, the name will be the path plus the name
            nombre = ctx.getChild(2).getText() + ctx.getChild(3).getText()
        else:
            # Otherwise, the name will just be the text of the second child node
            nombre = ctx.getChild(2).getText()
        
        #debug
        print("Cargando archivo: " + nombre)

        # Return the audio file
        self.audio = AudioSegment.from_file(nombre, format="mp3")
    
    def visitRecortarFuncion(self, ctx:musicologoParser.RecortarFuncionContext):
        # Get the audio file
        print(self.audio)        
        # Convert start time to milliseconds
        start_time = ctx.getChild(2).getText()
        start_minutes, start_seconds = map(int, start_time.split(':'))
        start = (start_minutes * 60 + start_seconds) * 1000

        # Convert end time to milliseconds
        end_time = ctx.getChild(4).getText()
        end_minutes, end_seconds = map(int, end_time.split(':'))
        end = (end_minutes * 60 + end_seconds) * 1000

        #debug
        print("Recortando archivo de " + str(start) + " a " + str(end))


        # Return the audio file with the specified range
        self.audio_modificado = self.audio[start:end]

    def visitExportarFuncion(self, ctx:musicologoParser.ExportarFuncionContext):
        self.audio_modificado.export("audio_editado.mp3", format="mp3")
