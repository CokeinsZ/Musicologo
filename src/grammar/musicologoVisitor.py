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


    # Visit a parse tree produced by musicologoParser#funcion.
    def visitFuncion(self, ctx:musicologoParser.FuncionContext):
        return self.visitChildren(ctx)



del musicologoParser