from grammar.musicologoVisitor import musicologoVisitor
from grammar.musicologoParser import musicologoParser
from pydub import AudioSegment

class Evaluador(musicologoVisitor):
    # Visit a parse tree produced by musicologoParser#inicio.
    def visitInicio(self, ctx:musicologoParser.InicioContext):
        for hijo in list(ctx.getChildren()):
            self.visit(hijo)

    # Visit a parse tree produced by musicologoParser#funcion.
    def visitFuncion(self, ctx:musicologoParser.FuncionContext):
        nombre = ctx.getChild(2).getText() + ctx.getChild(3).getText(); #Obtiene la ruta y el nombre del archivo
        
        print(nombre)

        return AudioSegment.from_file(nombre, format="mp3") #Retorna el archivo de audio