from grammar.musicologoVisitor import musicologoVisitor
from grammar.musicologoParser import musicologoParser
from pydub import AudioSegment

class Evaluador(musicologoVisitor):
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
        return AudioSegment.from_file(nombre, format="mp3")