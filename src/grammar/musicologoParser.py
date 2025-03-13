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
        4,1,10,39,2,0,7,0,2,1,7,1,1,0,5,0,6,8,0,10,0,12,0,9,9,0,1,0,1,0,
        1,1,1,1,1,1,3,1,16,8,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,3,1,37,8,1,1,1,0,0,2,0,2,0,0,40,
        0,7,1,0,0,0,2,36,1,0,0,0,4,6,3,2,1,0,5,4,1,0,0,0,6,9,1,0,0,0,7,5,
        1,0,0,0,7,8,1,0,0,0,8,10,1,0,0,0,9,7,1,0,0,0,10,11,5,0,0,1,11,1,
        1,0,0,0,12,13,5,2,0,0,13,15,5,1,0,0,14,16,5,8,0,0,15,14,1,0,0,0,
        15,16,1,0,0,0,16,17,1,0,0,0,17,18,5,6,0,0,18,19,5,1,0,0,19,20,5,
        5,0,0,20,21,5,1,0,0,21,37,5,7,0,0,22,23,5,3,0,0,23,24,5,1,0,0,24,
        25,5,9,0,0,25,26,5,1,0,0,26,27,5,9,0,0,27,28,5,1,0,0,28,29,5,7,0,
        0,29,30,5,1,0,0,30,31,5,5,0,0,31,32,5,1,0,0,32,37,5,7,0,0,33,34,
        5,4,0,0,34,35,5,1,0,0,35,37,5,7,0,0,36,12,1,0,0,0,36,22,1,0,0,0,
        36,33,1,0,0,0,37,3,1,0,0,0,3,7,15,36
    ]

class musicologoParser ( Parser ):

    grammarFileName = "musicologo.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "' '" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "COMANDO_CARGAR", "COMANDO_RECORTAR", 
                      "COMANDO_EXPORTAR", "COMANDO_ASIGNAR", "ARCHIVO_MP3", 
                      "ID", "RUTA", "TIEMPO", "WS" ]

    RULE_inicio = 0
    RULE_expresion = 1

    ruleNames =  [ "inicio", "expresion" ]

    EOF = Token.EOF
    T__0=1
    COMANDO_CARGAR=2
    COMANDO_RECORTAR=3
    COMANDO_EXPORTAR=4
    COMANDO_ASIGNAR=5
    ARCHIVO_MP3=6
    ID=7
    RUTA=8
    TIEMPO=9
    WS=10

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
            self.state = 7
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 28) != 0):
                self.state = 4
                self.expresion()
                self.state = 9
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 10
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



    def expresion(self):

        localctx = musicologoParser.ExpresionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_expresion)
        self._la = 0 # Token type
        try:
            self.state = 36
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [2]:
                localctx = musicologoParser.CargarFuncionContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 12
                self.match(musicologoParser.COMANDO_CARGAR)
                self.state = 13
                self.match(musicologoParser.T__0)
                self.state = 15
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==8:
                    self.state = 14
                    self.match(musicologoParser.RUTA)


                self.state = 17
                self.match(musicologoParser.ARCHIVO_MP3)
                self.state = 18
                self.match(musicologoParser.T__0)
                self.state = 19
                self.match(musicologoParser.COMANDO_ASIGNAR)
                self.state = 20
                self.match(musicologoParser.T__0)
                self.state = 21
                self.match(musicologoParser.ID)
                pass
            elif token in [3]:
                localctx = musicologoParser.RecortarFuncionContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 22
                self.match(musicologoParser.COMANDO_RECORTAR)
                self.state = 23
                self.match(musicologoParser.T__0)
                self.state = 24
                self.match(musicologoParser.TIEMPO)
                self.state = 25
                self.match(musicologoParser.T__0)
                self.state = 26
                self.match(musicologoParser.TIEMPO)
                self.state = 27
                self.match(musicologoParser.T__0)
                self.state = 28
                self.match(musicologoParser.ID)
                self.state = 29
                self.match(musicologoParser.T__0)
                self.state = 30
                self.match(musicologoParser.COMANDO_ASIGNAR)
                self.state = 31
                self.match(musicologoParser.T__0)
                self.state = 32
                self.match(musicologoParser.ID)
                pass
            elif token in [4]:
                localctx = musicologoParser.ExportarFuncionContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 33
                self.match(musicologoParser.COMANDO_EXPORTAR)
                self.state = 34
                self.match(musicologoParser.T__0)
                self.state = 35
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





