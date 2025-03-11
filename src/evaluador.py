from grammar.musicologoVisitor import musicologoVisitor
from grammar.musicologoParser import musicologoParser
from pydub import AudioSegment


class Evaluador(musicologoVisitor):
    # Visit a parse tree produced by musicologoParser#inicio.
    def visitInicio(self, ctx:musicologoParser.InicioContext):
        for hijo in list(ctx.getChildren()):
            self.visit(hijo)


    # Visit a parse tree produced by musicologoParser#cargarMp3.
    def visitFuncion(self, ctx:musicologoParser.FuncionContext):
        nombre = self.visit(ctx.getChild(1))
        
        print(nombre)

        AudioSegment.from_file(nombre, format="mp3").export("audio_editado.mp3", format="mp3")