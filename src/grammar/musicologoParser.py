# Generated from musicologo.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,26,151,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,1,0,5,0,10,8,0,10,0,12,
        0,13,9,0,1,0,1,0,1,1,1,1,1,1,3,1,20,8,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,1,1,1,1,1,1,1,3,1,50,8,1,1,1,1,1,1,1,1,1,3,1,56,8,1,1,
        1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,3,1,69,8,1,1,1,1,1,1,1,
        1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,1,1,1,1,1,1,1,3,1,112,8,1,1,2,1,2,5,2,116,8,2,10,2,12,
        2,119,9,2,1,2,1,2,1,2,5,2,124,8,2,10,2,12,2,127,9,2,1,2,5,2,130,
        8,2,10,2,12,2,133,9,2,1,2,1,2,1,2,3,2,138,8,2,1,3,1,3,1,3,1,3,1,
        3,1,3,1,3,1,3,1,3,3,3,149,8,3,1,3,0,0,4,0,2,4,6,0,0,165,0,11,1,0,
        0,0,2,111,1,0,0,0,4,137,1,0,0,0,6,139,1,0,0,0,8,10,3,2,1,0,9,8,1,
        0,0,0,10,13,1,0,0,0,11,9,1,0,0,0,11,12,1,0,0,0,12,14,1,0,0,0,13,
        11,1,0,0,0,14,15,5,0,0,1,15,1,1,0,0,0,16,17,5,5,0,0,17,19,5,1,0,
        0,18,20,5,23,0,0,19,18,1,0,0,0,19,20,1,0,0,0,20,21,1,0,0,0,21,22,
        5,21,0,0,22,23,5,1,0,0,23,24,5,9,0,0,24,25,5,1,0,0,25,112,5,22,0,
        0,26,27,5,6,0,0,27,28,5,1,0,0,28,29,5,24,0,0,29,30,5,1,0,0,30,31,
        5,24,0,0,31,32,5,1,0,0,32,33,5,22,0,0,33,34,5,1,0,0,34,35,5,9,0,
        0,35,36,5,1,0,0,36,112,5,22,0,0,37,38,5,7,0,0,38,39,5,1,0,0,39,112,
        5,22,0,0,40,41,5,8,0,0,41,42,5,1,0,0,42,43,5,22,0,0,43,44,5,1,0,
        0,44,49,5,20,0,0,45,46,5,1,0,0,46,47,5,24,0,0,47,48,5,1,0,0,48,50,
        5,24,0,0,49,45,1,0,0,0,49,50,1,0,0,0,50,55,1,0,0,0,51,52,5,1,0,0,
        52,53,5,9,0,0,53,54,5,1,0,0,54,56,5,22,0,0,55,51,1,0,0,0,55,56,1,
        0,0,0,56,112,1,0,0,0,57,58,5,15,0,0,58,59,5,1,0,0,59,60,3,6,3,0,
        60,61,5,1,0,0,61,62,5,16,0,0,62,63,5,1,0,0,63,68,3,4,2,0,64,65,5,
        1,0,0,65,66,5,17,0,0,66,67,5,1,0,0,67,69,3,4,2,0,68,64,1,0,0,0,68,
        69,1,0,0,0,69,112,1,0,0,0,70,71,5,10,0,0,71,72,5,1,0,0,72,73,5,24,
        0,0,73,74,5,1,0,0,74,75,5,22,0,0,75,76,5,1,0,0,76,77,5,9,0,0,77,
        78,5,1,0,0,78,112,5,22,0,0,79,80,5,11,0,0,80,81,5,1,0,0,81,82,5,
        22,0,0,82,83,5,1,0,0,83,84,5,22,0,0,84,85,5,1,0,0,85,86,5,9,0,0,
        86,87,5,1,0,0,87,112,5,22,0,0,88,89,5,12,0,0,89,90,5,1,0,0,90,91,
        5,24,0,0,91,92,5,1,0,0,92,93,5,24,0,0,93,94,5,1,0,0,94,112,5,22,
        0,0,95,96,5,14,0,0,96,97,5,1,0,0,97,98,5,22,0,0,98,99,5,1,0,0,99,
        100,5,25,0,0,100,101,5,1,0,0,101,102,5,9,0,0,102,103,5,1,0,0,103,
        112,5,22,0,0,104,105,5,13,0,0,105,106,5,1,0,0,106,107,5,25,0,0,107,
        108,5,1,0,0,108,109,5,16,0,0,109,110,5,1,0,0,110,112,3,4,2,0,111,
        16,1,0,0,0,111,26,1,0,0,0,111,37,1,0,0,0,111,40,1,0,0,0,111,57,1,
        0,0,0,111,70,1,0,0,0,111,79,1,0,0,0,111,88,1,0,0,0,111,95,1,0,0,
        0,111,104,1,0,0,0,112,3,1,0,0,0,113,117,5,2,0,0,114,116,5,1,0,0,
        115,114,1,0,0,0,116,119,1,0,0,0,117,115,1,0,0,0,117,118,1,0,0,0,
        118,120,1,0,0,0,119,117,1,0,0,0,120,125,3,2,1,0,121,122,5,3,0,0,
        122,124,3,2,1,0,123,121,1,0,0,0,124,127,1,0,0,0,125,123,1,0,0,0,
        125,126,1,0,0,0,126,131,1,0,0,0,127,125,1,0,0,0,128,130,5,1,0,0,
        129,128,1,0,0,0,130,133,1,0,0,0,131,129,1,0,0,0,131,132,1,0,0,0,
        132,134,1,0,0,0,133,131,1,0,0,0,134,135,5,4,0,0,135,138,1,0,0,0,
        136,138,3,2,1,0,137,113,1,0,0,0,137,136,1,0,0,0,138,5,1,0,0,0,139,
        140,5,19,0,0,140,141,5,1,0,0,141,142,5,22,0,0,142,143,5,1,0,0,143,
        148,5,18,0,0,144,145,5,1,0,0,145,149,5,24,0,0,146,147,5,1,0,0,147,
        149,5,20,0,0,148,144,1,0,0,0,148,146,1,0,0,0,149,7,1,0,0,0,11,11,
        19,49,55,68,111,117,125,131,137,148
    ]

class musicologoParser ( Parser ):

    grammarFileName = "musicologo.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "' '", "'{'", "' && '", "'}'", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "'subirVol'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "COMANDO_CARGAR", "COMANDO_RECORTAR", 
                      "COMANDO_EXPORTAR", "COMANDO_INCREMENTAR_VOL", "COMANDO_ASIGNAR", 
                      "COMANDO_DIVIDIR", "COMANDO_COMBINAR", "COMANDO_SILENCIAR", 
                      "COMANDO_REPETIR", "COMANDO_CONCATENAR", "CONDICIONAL", 
                      "HACER", "ELSE", "OPERADOR", "CARACTERISTICA", "VOLUMEN", 
                      "ARCHIVO_MP3", "ID", "RUTA", "TIEMPO", "NUMERO", "WS" ]

    RULE_inicio = 0
    RULE_expresion = 1
    RULE_bloque = 2
    RULE_condicion = 3

    ruleNames =  [ "inicio", "expresion", "bloque", "condicion" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    COMANDO_CARGAR=5
    COMANDO_RECORTAR=6
    COMANDO_EXPORTAR=7
    COMANDO_INCREMENTAR_VOL=8
    COMANDO_ASIGNAR=9
    COMANDO_DIVIDIR=10
    COMANDO_COMBINAR=11
    COMANDO_SILENCIAR=12
    COMANDO_REPETIR=13
    COMANDO_CONCATENAR=14
    CONDICIONAL=15
    HACER=16
    ELSE=17
    OPERADOR=18
    CARACTERISTICA=19
    VOLUMEN=20
    ARCHIVO_MP3=21
    ID=22
    RUTA=23
    TIEMPO=24
    NUMERO=25
    WS=26

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class InicioContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(musicologoParser.EOF, 0)

        def expresion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(musicologoParser.ExpresionContext)
            else:
                return self.getTypedRuleContext(musicologoParser.ExpresionContext,i)


        def getRuleIndex(self):
            return musicologoParser.RULE_inicio

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInicio" ):
                listener.enterInicio(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInicio" ):
                listener.exitInicio(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInicio" ):
                return visitor.visitInicio(self)
            else:
                return visitor.visitChildren(self)




    def inicio(self):

        localctx = musicologoParser.InicioContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_inicio)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 11
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 64992) != 0):
                self.state = 8
                self.expresion()
                self.state = 13
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 14
            self.match(musicologoParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpresionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return musicologoParser.RULE_expresion

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class RecortarFuncionContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a musicologoParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def COMANDO_RECORTAR(self):
            return self.getToken(musicologoParser.COMANDO_RECORTAR, 0)
        def TIEMPO(self, i:int=None):
            if i is None:
                return self.getTokens(musicologoParser.TIEMPO)
            else:
                return self.getToken(musicologoParser.TIEMPO, i)
        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(musicologoParser.ID)
            else:
                return self.getToken(musicologoParser.ID, i)
        def COMANDO_ASIGNAR(self):
            return self.getToken(musicologoParser.COMANDO_ASIGNAR, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRecortarFuncion" ):
                listener.enterRecortarFuncion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRecortarFuncion" ):
                listener.exitRecortarFuncion(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitRecortarFuncion" ):
                return visitor.visitRecortarFuncion(self)
            else:
                return visitor.visitChildren(self)


    class DividirFuncionContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a musicologoParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def COMANDO_DIVIDIR(self):
            return self.getToken(musicologoParser.COMANDO_DIVIDIR, 0)
        def TIEMPO(self):
            return self.getToken(musicologoParser.TIEMPO, 0)
        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(musicologoParser.ID)
            else:
                return self.getToken(musicologoParser.ID, i)
        def COMANDO_ASIGNAR(self):
            return self.getToken(musicologoParser.COMANDO_ASIGNAR, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDividirFuncion" ):
                listener.enterDividirFuncion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDividirFuncion" ):
                listener.exitDividirFuncion(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDividirFuncion" ):
                return visitor.visitDividirFuncion(self)
            else:
                return visitor.visitChildren(self)


    class ConcatenarFuncionContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a musicologoParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def COMANDO_CONCATENAR(self):
            return self.getToken(musicologoParser.COMANDO_CONCATENAR, 0)
        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(musicologoParser.ID)
            else:
                return self.getToken(musicologoParser.ID, i)
        def NUMERO(self):
            return self.getToken(musicologoParser.NUMERO, 0)
        def COMANDO_ASIGNAR(self):
            return self.getToken(musicologoParser.COMANDO_ASIGNAR, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterConcatenarFuncion" ):
                listener.enterConcatenarFuncion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitConcatenarFuncion" ):
                listener.exitConcatenarFuncion(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitConcatenarFuncion" ):
                return visitor.visitConcatenarFuncion(self)
            else:
                return visitor.visitChildren(self)


    class RepetirFuncionContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a musicologoParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def COMANDO_REPETIR(self):
            return self.getToken(musicologoParser.COMANDO_REPETIR, 0)
        def NUMERO(self):
            return self.getToken(musicologoParser.NUMERO, 0)
        def HACER(self):
            return self.getToken(musicologoParser.HACER, 0)
        def bloque(self):
            return self.getTypedRuleContext(musicologoParser.BloqueContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRepetirFuncion" ):
                listener.enterRepetirFuncion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRepetirFuncion" ):
                listener.exitRepetirFuncion(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitRepetirFuncion" ):
                return visitor.visitRepetirFuncion(self)
            else:
                return visitor.visitChildren(self)


    class ExportarFuncionContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a musicologoParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def COMANDO_EXPORTAR(self):
            return self.getToken(musicologoParser.COMANDO_EXPORTAR, 0)
        def ID(self):
            return self.getToken(musicologoParser.ID, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExportarFuncion" ):
                listener.enterExportarFuncion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExportarFuncion" ):
                listener.exitExportarFuncion(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExportarFuncion" ):
                return visitor.visitExportarFuncion(self)
            else:
                return visitor.visitChildren(self)


    class IncrementarVolFuncionContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a musicologoParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def COMANDO_INCREMENTAR_VOL(self):
            return self.getToken(musicologoParser.COMANDO_INCREMENTAR_VOL, 0)
        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(musicologoParser.ID)
            else:
                return self.getToken(musicologoParser.ID, i)
        def VOLUMEN(self):
            return self.getToken(musicologoParser.VOLUMEN, 0)
        def TIEMPO(self, i:int=None):
            if i is None:
                return self.getTokens(musicologoParser.TIEMPO)
            else:
                return self.getToken(musicologoParser.TIEMPO, i)
        def COMANDO_ASIGNAR(self):
            return self.getToken(musicologoParser.COMANDO_ASIGNAR, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIncrementarVolFuncion" ):
                listener.enterIncrementarVolFuncion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIncrementarVolFuncion" ):
                listener.exitIncrementarVolFuncion(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIncrementarVolFuncion" ):
                return visitor.visitIncrementarVolFuncion(self)
            else:
                return visitor.visitChildren(self)


    class SilenciarFuncionContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a musicologoParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def COMANDO_SILENCIAR(self):
            return self.getToken(musicologoParser.COMANDO_SILENCIAR, 0)
        def TIEMPO(self, i:int=None):
            if i is None:
                return self.getTokens(musicologoParser.TIEMPO)
            else:
                return self.getToken(musicologoParser.TIEMPO, i)
        def ID(self):
            return self.getToken(musicologoParser.ID, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSilenciarFuncion" ):
                listener.enterSilenciarFuncion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSilenciarFuncion" ):
                listener.exitSilenciarFuncion(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSilenciarFuncion" ):
                return visitor.visitSilenciarFuncion(self)
            else:
                return visitor.visitChildren(self)


    class CombinarFuncionContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a musicologoParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def COMANDO_COMBINAR(self):
            return self.getToken(musicologoParser.COMANDO_COMBINAR, 0)
        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(musicologoParser.ID)
            else:
                return self.getToken(musicologoParser.ID, i)
        def COMANDO_ASIGNAR(self):
            return self.getToken(musicologoParser.COMANDO_ASIGNAR, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCombinarFuncion" ):
                listener.enterCombinarFuncion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCombinarFuncion" ):
                listener.exitCombinarFuncion(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCombinarFuncion" ):
                return visitor.visitCombinarFuncion(self)
            else:
                return visitor.visitChildren(self)


    class CargarFuncionContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a musicologoParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def COMANDO_CARGAR(self):
            return self.getToken(musicologoParser.COMANDO_CARGAR, 0)
        def ARCHIVO_MP3(self):
            return self.getToken(musicologoParser.ARCHIVO_MP3, 0)
        def COMANDO_ASIGNAR(self):
            return self.getToken(musicologoParser.COMANDO_ASIGNAR, 0)
        def ID(self):
            return self.getToken(musicologoParser.ID, 0)
        def RUTA(self):
            return self.getToken(musicologoParser.RUTA, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCargarFuncion" ):
                listener.enterCargarFuncion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCargarFuncion" ):
                listener.exitCargarFuncion(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCargarFuncion" ):
                return visitor.visitCargarFuncion(self)
            else:
                return visitor.visitChildren(self)


    class CondicionalFuncionContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a musicologoParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def CONDICIONAL(self):
            return self.getToken(musicologoParser.CONDICIONAL, 0)
        def condicion(self):
            return self.getTypedRuleContext(musicologoParser.CondicionContext,0)

        def HACER(self):
            return self.getToken(musicologoParser.HACER, 0)
        def bloque(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(musicologoParser.BloqueContext)
            else:
                return self.getTypedRuleContext(musicologoParser.BloqueContext,i)

        def ELSE(self):
            return self.getToken(musicologoParser.ELSE, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCondicionalFuncion" ):
                listener.enterCondicionalFuncion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCondicionalFuncion" ):
                listener.exitCondicionalFuncion(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCondicionalFuncion" ):
                return visitor.visitCondicionalFuncion(self)
            else:
                return visitor.visitChildren(self)



    def expresion(self):

        localctx = musicologoParser.ExpresionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_expresion)
        self._la = 0 # Token type
        try:
            self.state = 111
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [5]:
                localctx = musicologoParser.CargarFuncionContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 16
                self.match(musicologoParser.COMANDO_CARGAR)
                self.state = 17
                self.match(musicologoParser.T__0)
                self.state = 19
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==23:
                    self.state = 18
                    self.match(musicologoParser.RUTA)


                self.state = 21
                self.match(musicologoParser.ARCHIVO_MP3)
                self.state = 22
                self.match(musicologoParser.T__0)
                self.state = 23
                self.match(musicologoParser.COMANDO_ASIGNAR)
                self.state = 24
                self.match(musicologoParser.T__0)
                self.state = 25
                self.match(musicologoParser.ID)
                pass
            elif token in [6]:
                localctx = musicologoParser.RecortarFuncionContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 26
                self.match(musicologoParser.COMANDO_RECORTAR)
                self.state = 27
                self.match(musicologoParser.T__0)
                self.state = 28
                self.match(musicologoParser.TIEMPO)
                self.state = 29
                self.match(musicologoParser.T__0)
                self.state = 30
                self.match(musicologoParser.TIEMPO)
                self.state = 31
                self.match(musicologoParser.T__0)
                self.state = 32
                self.match(musicologoParser.ID)
                self.state = 33
                self.match(musicologoParser.T__0)
                self.state = 34
                self.match(musicologoParser.COMANDO_ASIGNAR)
                self.state = 35
                self.match(musicologoParser.T__0)
                self.state = 36
                self.match(musicologoParser.ID)
                pass
            elif token in [7]:
                localctx = musicologoParser.ExportarFuncionContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 37
                self.match(musicologoParser.COMANDO_EXPORTAR)
                self.state = 38
                self.match(musicologoParser.T__0)
                self.state = 39
                self.match(musicologoParser.ID)
                pass
            elif token in [8]:
                localctx = musicologoParser.IncrementarVolFuncionContext(self, localctx)
                self.enterOuterAlt(localctx, 4)
                self.state = 40
                self.match(musicologoParser.COMANDO_INCREMENTAR_VOL)
                self.state = 41
                self.match(musicologoParser.T__0)
                self.state = 42
                self.match(musicologoParser.ID)
                self.state = 43
                self.match(musicologoParser.T__0)
                self.state = 44
                self.match(musicologoParser.VOLUMEN)
                self.state = 49
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
                if la_ == 1:
                    self.state = 45
                    self.match(musicologoParser.T__0)
                    self.state = 46
                    self.match(musicologoParser.TIEMPO)
                    self.state = 47
                    self.match(musicologoParser.T__0)
                    self.state = 48
                    self.match(musicologoParser.TIEMPO)


                self.state = 55
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,3,self._ctx)
                if la_ == 1:
                    self.state = 51
                    self.match(musicologoParser.T__0)
                    self.state = 52
                    self.match(musicologoParser.COMANDO_ASIGNAR)
                    self.state = 53
                    self.match(musicologoParser.T__0)
                    self.state = 54
                    self.match(musicologoParser.ID)


                pass
            elif token in [15]:
                localctx = musicologoParser.CondicionalFuncionContext(self, localctx)
                self.enterOuterAlt(localctx, 5)
                self.state = 57
                self.match(musicologoParser.CONDICIONAL)
                self.state = 58
                self.match(musicologoParser.T__0)
                self.state = 59
                self.condicion()
                self.state = 60
                self.match(musicologoParser.T__0)
                self.state = 61
                self.match(musicologoParser.HACER)
                self.state = 62
                self.match(musicologoParser.T__0)
                self.state = 63
                self.bloque()
                self.state = 68
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,4,self._ctx)
                if la_ == 1:
                    self.state = 64
                    self.match(musicologoParser.T__0)
                    self.state = 65
                    self.match(musicologoParser.ELSE)
                    self.state = 66
                    self.match(musicologoParser.T__0)
                    self.state = 67
                    self.bloque()


                pass
            elif token in [10]:
                localctx = musicologoParser.DividirFuncionContext(self, localctx)
                self.enterOuterAlt(localctx, 6)
                self.state = 70
                self.match(musicologoParser.COMANDO_DIVIDIR)
                self.state = 71
                self.match(musicologoParser.T__0)
                self.state = 72
                self.match(musicologoParser.TIEMPO)
                self.state = 73
                self.match(musicologoParser.T__0)
                self.state = 74
                self.match(musicologoParser.ID)
                self.state = 75
                self.match(musicologoParser.T__0)
                self.state = 76
                self.match(musicologoParser.COMANDO_ASIGNAR)
                self.state = 77
                self.match(musicologoParser.T__0)
                self.state = 78
                self.match(musicologoParser.ID)
                pass
            elif token in [11]:
                localctx = musicologoParser.CombinarFuncionContext(self, localctx)
                self.enterOuterAlt(localctx, 7)
                self.state = 79
                self.match(musicologoParser.COMANDO_COMBINAR)
                self.state = 80
                self.match(musicologoParser.T__0)
                self.state = 81
                self.match(musicologoParser.ID)
                self.state = 82
                self.match(musicologoParser.T__0)
                self.state = 83
                self.match(musicologoParser.ID)
                self.state = 84
                self.match(musicologoParser.T__0)
                self.state = 85
                self.match(musicologoParser.COMANDO_ASIGNAR)
                self.state = 86
                self.match(musicologoParser.T__0)
                self.state = 87
                self.match(musicologoParser.ID)
                pass
            elif token in [12]:
                localctx = musicologoParser.SilenciarFuncionContext(self, localctx)
                self.enterOuterAlt(localctx, 8)
                self.state = 88
                self.match(musicologoParser.COMANDO_SILENCIAR)
                self.state = 89
                self.match(musicologoParser.T__0)
                self.state = 90
                self.match(musicologoParser.TIEMPO)
                self.state = 91
                self.match(musicologoParser.T__0)
                self.state = 92
                self.match(musicologoParser.TIEMPO)
                self.state = 93
                self.match(musicologoParser.T__0)
                self.state = 94
                self.match(musicologoParser.ID)
                pass
            elif token in [14]:
                localctx = musicologoParser.ConcatenarFuncionContext(self, localctx)
                self.enterOuterAlt(localctx, 9)
                self.state = 95
                self.match(musicologoParser.COMANDO_CONCATENAR)
                self.state = 96
                self.match(musicologoParser.T__0)
                self.state = 97
                self.match(musicologoParser.ID)
                self.state = 98
                self.match(musicologoParser.T__0)
                self.state = 99
                self.match(musicologoParser.NUMERO)
                self.state = 100
                self.match(musicologoParser.T__0)
                self.state = 101
                self.match(musicologoParser.COMANDO_ASIGNAR)
                self.state = 102
                self.match(musicologoParser.T__0)
                self.state = 103
                self.match(musicologoParser.ID)
                pass
            elif token in [13]:
                localctx = musicologoParser.RepetirFuncionContext(self, localctx)
                self.enterOuterAlt(localctx, 10)
                self.state = 104
                self.match(musicologoParser.COMANDO_REPETIR)
                self.state = 105
                self.match(musicologoParser.T__0)
                self.state = 106
                self.match(musicologoParser.NUMERO)
                self.state = 107
                self.match(musicologoParser.T__0)
                self.state = 108
                self.match(musicologoParser.HACER)
                self.state = 109
                self.match(musicologoParser.T__0)
                self.state = 110
                self.bloque()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BloqueContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expresion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(musicologoParser.ExpresionContext)
            else:
                return self.getTypedRuleContext(musicologoParser.ExpresionContext,i)


        def getRuleIndex(self):
            return musicologoParser.RULE_bloque

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBloque" ):
                listener.enterBloque(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBloque" ):
                listener.exitBloque(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBloque" ):
                return visitor.visitBloque(self)
            else:
                return visitor.visitChildren(self)




    def bloque(self):

        localctx = musicologoParser.BloqueContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_bloque)
        self._la = 0 # Token type
        try:
            self.state = 137
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [2]:
                self.enterOuterAlt(localctx, 1)
                self.state = 113
                self.match(musicologoParser.T__1)
                self.state = 117
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==1:
                    self.state = 114
                    self.match(musicologoParser.T__0)
                    self.state = 119
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 120
                self.expresion()
                self.state = 125
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==3:
                    self.state = 121
                    self.match(musicologoParser.T__2)
                    self.state = 122
                    self.expresion()
                    self.state = 127
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 131
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==1:
                    self.state = 128
                    self.match(musicologoParser.T__0)
                    self.state = 133
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 134
                self.match(musicologoParser.T__3)
                pass
            elif token in [5, 6, 7, 8, 10, 11, 12, 13, 14, 15]:
                self.enterOuterAlt(localctx, 2)
                self.state = 136
                self.expresion()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CondicionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CARACTERISTICA(self):
            return self.getToken(musicologoParser.CARACTERISTICA, 0)

        def ID(self):
            return self.getToken(musicologoParser.ID, 0)

        def OPERADOR(self):
            return self.getToken(musicologoParser.OPERADOR, 0)

        def TIEMPO(self):
            return self.getToken(musicologoParser.TIEMPO, 0)

        def VOLUMEN(self):
            return self.getToken(musicologoParser.VOLUMEN, 0)

        def getRuleIndex(self):
            return musicologoParser.RULE_condicion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCondicion" ):
                listener.enterCondicion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCondicion" ):
                listener.exitCondicion(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCondicion" ):
                return visitor.visitCondicion(self)
            else:
                return visitor.visitChildren(self)




    def condicion(self):

        localctx = musicologoParser.CondicionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_condicion)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 139
            self.match(musicologoParser.CARACTERISTICA)
            self.state = 140
            self.match(musicologoParser.T__0)
            self.state = 141
            self.match(musicologoParser.ID)
            self.state = 142
            self.match(musicologoParser.T__0)
            self.state = 143
            self.match(musicologoParser.OPERADOR)
            self.state = 148
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,10,self._ctx)
            if la_ == 1:
                self.state = 144
                self.match(musicologoParser.T__0)
                self.state = 145
                self.match(musicologoParser.TIEMPO)
                pass

            elif la_ == 2:
                self.state = 146
                self.match(musicologoParser.T__0)
                self.state = 147
                self.match(musicologoParser.VOLUMEN)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





