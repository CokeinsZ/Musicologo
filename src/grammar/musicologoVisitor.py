# Generated from musicologo.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .musicologoParser import musicologoParser
else:
    from musicologoParser import musicologoParser

# This class defines a complete generic visitor for a parse tree produced by musicologoParser.

class musicologoVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by musicologoParser#inicio.
    def visitInicio(self, ctx:musicologoParser.InicioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by musicologoParser#cargarFuncion.
    def visitCargarFuncion(self, ctx:musicologoParser.CargarFuncionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by musicologoParser#recortarFuncion.
    def visitRecortarFuncion(self, ctx:musicologoParser.RecortarFuncionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by musicologoParser#exportarFuncion.
    def visitExportarFuncion(self, ctx:musicologoParser.ExportarFuncionContext):
        return self.visitChildren(ctx)



del musicologoParser