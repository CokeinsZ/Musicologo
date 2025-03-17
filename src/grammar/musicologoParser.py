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
        4,1,24,110,2,0,7,0,2,1,7,1,2,2,7,2,1,0,5,0,8,8,0,10,0,12,0,11,9,
        0,1,0,1,0,1,1,1,1,1,1,3,1,18,8,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,1,1,1,3,1,48,8,1,1,1,1,1,1,1,1,1,3,1,54,8,1,1,1,1,1,1,
        1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,3,1,67,8,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,1,1,1,3,1,94,8,1,1,2,1,2,1,2,1,2,5,2,100,8,2,10,2,12,2,
        103,9,2,1,2,1,2,1,2,3,2,108,8,2,1,2,0,0,3,0,2,4,0,0,120,0,9,1,0,
        0,0,2,93,1,0,0,0,4,107,1,0,0,0,6,8,3,2,1,0,7,6,1,0,0,0,8,11,1,0,
        0,0,9,7,1,0,0,0,9,10,1,0,0,0,10,12,1,0,0,0,11,9,1,0,0,0,12,13,5,
        0,0,1,13,1,1,0,0,0,14,15,5,5,0,0,15,17,5,1,0,0,16,18,5,22,0,0,17,
        16,1,0,0,0,17,18,1,0,0,0,18,19,1,0,0,0,19,20,5,20,0,0,20,21,5,1,
        0,0,21,22,5,9,0,0,22,23,5,1,0,0,23,94,5,21,0,0,24,25,5,6,0,0,25,
        26,5,1,0,0,26,27,5,23,0,0,27,28,5,1,0,0,28,29,5,23,0,0,29,30,5,1,
        0,0,30,31,5,21,0,0,31,32,5,1,0,0,32,33,5,9,0,0,33,34,5,1,0,0,34,
        94,5,21,0,0,35,36,5,7,0,0,36,37,5,1,0,0,37,94,5,21,0,0,38,39,5,8,
        0,0,39,40,5,1,0,0,40,41,5,21,0,0,41,42,5,1,0,0,42,47,5,19,0,0,43,
        44,5,1,0,0,44,45,5,23,0,0,45,46,5,1,0,0,46,48,5,23,0,0,47,43,1,0,
        0,0,47,48,1,0,0,0,48,53,1,0,0,0,49,50,5,1,0,0,50,51,5,9,0,0,51,52,
        5,1,0,0,52,54,5,21,0,0,53,49,1,0,0,0,53,54,1,0,0,0,54,94,1,0,0,0,
        55,56,5,13,0,0,56,57,5,1,0,0,57,58,5,14,0,0,58,59,5,1,0,0,59,60,
        5,15,0,0,60,61,5,1,0,0,61,66,3,4,2,0,62,63,5,1,0,0,63,64,5,16,0,
        0,64,65,5,1,0,0,65,67,3,4,2,0,66,62,1,0,0,0,66,67,1,0,0,0,67,94,
        1,0,0,0,68,69,5,10,0,0,69,70,5,1,0,0,70,71,5,23,0,0,71,72,5,1,0,
        0,72,73,5,21,0,0,73,74,5,1,0,0,74,75,5,9,0,0,75,76,5,1,0,0,76,94,
        5,21,0,0,77,78,5,11,0,0,78,79,5,1,0,0,79,80,5,21,0,0,80,81,5,1,0,
        0,81,82,5,21,0,0,82,83,5,1,0,0,83,84,5,9,0,0,84,85,5,1,0,0,85,94,
        5,21,0,0,86,87,5,12,0,0,87,88,5,1,0,0,88,89,5,23,0,0,89,90,5,1,0,
        0,90,91,5,23,0,0,91,92,5,1,0,0,92,94,5,21,0,0,93,14,1,0,0,0,93,24,
        1,0,0,0,93,35,1,0,0,0,93,38,1,0,0,0,93,55,1,0,0,0,93,68,1,0,0,0,
        93,77,1,0,0,0,93,86,1,0,0,0,94,3,1,0,0,0,95,96,5,2,0,0,96,101,3,
        2,1,0,97,98,5,3,0,0,98,100,3,2,1,0,99,97,1,0,0,0,100,103,1,0,0,0,
        101,99,1,0,0,0,101,102,1,0,0,0,102,104,1,0,0,0,103,101,1,0,0,0,104,
        105,5,4,0,0,105,108,1,0,0,0,106,108,3,2,1,0,107,95,1,0,0,0,107,106,
        1,0,0,0,108,5,1,0,0,0,8,9,17,47,53,66,93,101,107
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
                      "CONDICIONAL", "CONDICION", "HACER", "ELSE", "OPERADOR", 
                      "CARACTERISTICA", "VALOR", "ARCHIVO_MP3", "ID", "RUTA", 
                      "TIEMPO", "WS" ]

    RULE_inicio = 0
    RULE_expresion = 1
    RULE_bloque = 2

    ruleNames =  [ "inicio", "expresion", "bloque" ]

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
    CONDICIONAL=13
    CONDICION=14
    HACER=15
    ELSE=16
    OPERADOR=17
    CARACTERISTICA=18
    VALOR=19
    ARCHIVO_MP3=20
    ID=21
    RUTA=22
    TIEMPO=23
    WS=24

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
            self.state = 9
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 15840) != 0):
                self.state = 6
                self.expresion()
                self.state = 11
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 12
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
        def VALOR(self):
            return self.getToken(musicologoParser.VALOR, 0)
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
        def CONDICION(self):
            return self.getToken(musicologoParser.CONDICION, 0)
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
            self.state = 93
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [5]:
                localctx = musicologoParser.CargarFuncionContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 14
                self.match(musicologoParser.COMANDO_CARGAR)
                self.state = 15
                self.match(musicologoParser.T__0)
                self.state = 17
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==22:
                    self.state = 16
                    self.match(musicologoParser.RUTA)


                self.state = 19
                self.match(musicologoParser.ARCHIVO_MP3)
                self.state = 20
                self.match(musicologoParser.T__0)
                self.state = 21
                self.match(musicologoParser.COMANDO_ASIGNAR)
                self.state = 22
                self.match(musicologoParser.T__0)
                self.state = 23
                self.match(musicologoParser.ID)
                pass
            elif token in [6]:
                localctx = musicologoParser.RecortarFuncionContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 24
                self.match(musicologoParser.COMANDO_RECORTAR)
                self.state = 25
                self.match(musicologoParser.T__0)
                self.state = 26
                self.match(musicologoParser.TIEMPO)
                self.state = 27
                self.match(musicologoParser.T__0)
                self.state = 28
                self.match(musicologoParser.TIEMPO)
                self.state = 29
                self.match(musicologoParser.T__0)
                self.state = 30
                self.match(musicologoParser.ID)
                self.state = 31
                self.match(musicologoParser.T__0)
                self.state = 32
                self.match(musicologoParser.COMANDO_ASIGNAR)
                self.state = 33
                self.match(musicologoParser.T__0)
                self.state = 34
                self.match(musicologoParser.ID)
                pass
            elif token in [7]:
                localctx = musicologoParser.ExportarFuncionContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 35
                self.match(musicologoParser.COMANDO_EXPORTAR)
                self.state = 36
                self.match(musicologoParser.T__0)
                self.state = 37
                self.match(musicologoParser.ID)
                pass
            elif token in [8]:
                localctx = musicologoParser.IncrementarVolFuncionContext(self, localctx)
                self.enterOuterAlt(localctx, 4)
                self.state = 38
                self.match(musicologoParser.COMANDO_INCREMENTAR_VOL)
                self.state = 39
                self.match(musicologoParser.T__0)
                self.state = 40
                self.match(musicologoParser.ID)
                self.state = 41
                self.match(musicologoParser.T__0)
                self.state = 42
                self.match(musicologoParser.VALOR)
                self.state = 47
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
                if la_ == 1:
                    self.state = 43
                    self.match(musicologoParser.T__0)
                    self.state = 44
                    self.match(musicologoParser.TIEMPO)
                    self.state = 45
                    self.match(musicologoParser.T__0)
                    self.state = 46
                    self.match(musicologoParser.TIEMPO)


                self.state = 53
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,3,self._ctx)
                if la_ == 1:
                    self.state = 49
                    self.match(musicologoParser.T__0)
                    self.state = 50
                    self.match(musicologoParser.COMANDO_ASIGNAR)
                    self.state = 51
                    self.match(musicologoParser.T__0)
                    self.state = 52
                    self.match(musicologoParser.ID)


                pass
            elif token in [13]:
                localctx = musicologoParser.CondicionalFuncionContext(self, localctx)
                self.enterOuterAlt(localctx, 5)
                self.state = 55
                self.match(musicologoParser.CONDICIONAL)
                self.state = 56
                self.match(musicologoParser.T__0)
                self.state = 57
                self.match(musicologoParser.CONDICION)
                self.state = 58
                self.match(musicologoParser.T__0)
                self.state = 59
                self.match(musicologoParser.HACER)
                self.state = 60
                self.match(musicologoParser.T__0)
                self.state = 61
                self.bloque()
                self.state = 66
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,4,self._ctx)
                if la_ == 1:
                    self.state = 62
                    self.match(musicologoParser.T__0)
                    self.state = 63
                    self.match(musicologoParser.ELSE)
                    self.state = 64
                    self.match(musicologoParser.T__0)
                    self.state = 65
                    self.bloque()


                pass
            elif token in [10]:
                localctx = musicologoParser.DividirFuncionContext(self, localctx)
                self.enterOuterAlt(localctx, 6)
                self.state = 68
                self.match(musicologoParser.COMANDO_DIVIDIR)
                self.state = 69
                self.match(musicologoParser.T__0)
                self.state = 70
                self.match(musicologoParser.TIEMPO)
                self.state = 71
                self.match(musicologoParser.T__0)
                self.state = 72
                self.match(musicologoParser.ID)
                self.state = 73
                self.match(musicologoParser.T__0)
                self.state = 74
                self.match(musicologoParser.COMANDO_ASIGNAR)
                self.state = 75
                self.match(musicologoParser.T__0)
                self.state = 76
                self.match(musicologoParser.ID)
                pass
            elif token in [11]:
                localctx = musicologoParser.CombinarFuncionContext(self, localctx)
                self.enterOuterAlt(localctx, 7)
                self.state = 77
                self.match(musicologoParser.COMANDO_COMBINAR)
                self.state = 78
                self.match(musicologoParser.T__0)
                self.state = 79
                self.match(musicologoParser.ID)
                self.state = 80
                self.match(musicologoParser.T__0)
                self.state = 81
                self.match(musicologoParser.ID)
                self.state = 82
                self.match(musicologoParser.T__0)
                self.state = 83
                self.match(musicologoParser.COMANDO_ASIGNAR)
                self.state = 84
                self.match(musicologoParser.T__0)
                self.state = 85
                self.match(musicologoParser.ID)
                pass
            elif token in [12]:
                localctx = musicologoParser.SilenciarFuncionContext(self, localctx)
                self.enterOuterAlt(localctx, 8)
                self.state = 86
                self.match(musicologoParser.COMANDO_SILENCIAR)
                self.state = 87
                self.match(musicologoParser.T__0)
                self.state = 88
                self.match(musicologoParser.TIEMPO)
                self.state = 89
                self.match(musicologoParser.T__0)
                self.state = 90
                self.match(musicologoParser.TIEMPO)
                self.state = 91
                self.match(musicologoParser.T__0)
                self.state = 92
                self.match(musicologoParser.ID)
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
            self.state = 107
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [2]:
                self.enterOuterAlt(localctx, 1)
                self.state = 95
                self.match(musicologoParser.T__1)
                self.state = 96
                self.expresion()
                self.state = 101
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==3:
                    self.state = 97
                    self.match(musicologoParser.T__2)
                    self.state = 98
                    self.expresion()
                    self.state = 103
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 104
                self.match(musicologoParser.T__3)
                pass
            elif token in [5, 6, 7, 8, 10, 11, 12, 13]:
                self.enterOuterAlt(localctx, 2)
                self.state = 106
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





