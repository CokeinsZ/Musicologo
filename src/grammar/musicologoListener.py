# Generated from musicologo.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .musicologoParser import musicologoParser
else:
    from musicologoParser import musicologoParser

# This class defines a complete listener for a parse tree produced by musicologoParser.
class musicologoListener(ParseTreeListener):

    # Enter a parse tree produced by musicologoParser#inicio.
    def enterInicio(self, ctx:musicologoParser.InicioContext):
        pass

    # Exit a parse tree produced by musicologoParser#inicio.
    def exitInicio(self, ctx:musicologoParser.InicioContext):
        pass


    # Enter a parse tree produced by musicologoParser#cargarFuncion.
    def enterCargarFuncion(self, ctx:musicologoParser.CargarFuncionContext):
        pass

    # Exit a parse tree produced by musicologoParser#cargarFuncion.
    def exitCargarFuncion(self, ctx:musicologoParser.CargarFuncionContext):
        pass


    # Enter a parse tree produced by musicologoParser#recortarFuncion.
    def enterRecortarFuncion(self, ctx:musicologoParser.RecortarFuncionContext):
        pass

    # Exit a parse tree produced by musicologoParser#recortarFuncion.
    def exitRecortarFuncion(self, ctx:musicologoParser.RecortarFuncionContext):
        pass


    # Enter a parse tree produced by musicologoParser#exportarFuncion.
    def enterExportarFuncion(self, ctx:musicologoParser.ExportarFuncionContext):
        pass

    # Exit a parse tree produced by musicologoParser#exportarFuncion.
    def exitExportarFuncion(self, ctx:musicologoParser.ExportarFuncionContext):
        pass



del musicologoParser