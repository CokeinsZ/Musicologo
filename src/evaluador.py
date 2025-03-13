from grammar.musicologoVisitor import musicologoVisitor
from grammar.musicologoParser import musicologoParser
from pydub import AudioSegment

class Evaluador(musicologoVisitor):
    def __init__(self):
        self.audios = {}

    # Visit a parse tree produced by musicologoParser#inicio.
    def visitInicio(self, ctx:musicologoParser.InicioContext):
        for hijo in list(ctx.getChildren()):
            self.visit(hijo)

    # Visit a parse tree produced by musicologoParser#funcion.
    def visitCargarFuncion(self, ctx:musicologoParser.CargarFuncionContext):
        # Get the audio file
        if (ctx.RUTA() is not None) and (ctx.ARCHIVO_MP3() is not None):
            nombre = ctx.RUTA().getText() + ctx.ARCHIVO_MP3().getText() # Concatenate the path and the file name

        elif ctx.ARCHIVO_MP3():
            nombre = ctx.ARCHIVO_MP3().getText()

        else:
            print("Error: No se proporcionó un archivo de audio.")
            return None
        
        # Get the ID
        if ctx.ID() is not None:
            id = ctx.ID().getText()

        elif ctx.ID() in self.audios:
            print("Error: El ID ya existe.")

        else:
            print("Error: No se proporcionó un ID.")        

        self.audios[id] = AudioSegment.from_file(nombre, format="mp3")

        #debug
        print("Cargando archivo: " + nombre)
        print(self.audios)
    
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
