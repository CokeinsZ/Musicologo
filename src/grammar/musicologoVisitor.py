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


    # Visit a parse tree produced by musicologoParser#incrementarVolFuncion.
    def visitIncrementarVolFuncion(self, ctx:musicologoParser.IncrementarVolFuncionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by musicologoParser#condicionalFuncion.
    def visitCondicionalFuncion(self, ctx:musicologoParser.CondicionalFuncionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by musicologoParser#dividirFuncion.
    def visitDividirFuncion(self, ctx:musicologoParser.DividirFuncionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by musicologoParser#combinarFuncion.
    def visitCombinarFuncion(self, ctx:musicologoParser.CombinarFuncionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by musicologoParser#silenciarFuncion.
    def visitSilenciarFuncion(self, ctx:musicologoParser.SilenciarFuncionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by musicologoParser#bloque.
    def visitBloque(self, ctx:musicologoParser.BloqueContext):
        return self.visitChildren(ctx)



del musicologoParser