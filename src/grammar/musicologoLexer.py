# Generated from musicologo.g4 by ANTLR 4.13.2
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


def serializedATN():
    return [
        4,0,5,52,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,1,0,1,0,1,
        1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,4,2,22,8,2,11,2,12,2,23,1,2,1,2,1,
        2,1,2,1,2,1,3,4,3,32,8,3,11,3,12,3,33,1,3,1,3,4,3,38,8,3,11,3,12,
        3,39,1,3,5,3,43,8,3,10,3,12,3,46,9,3,1,4,4,4,49,8,4,11,4,12,4,50,
        0,0,5,1,1,3,2,5,3,7,4,9,5,1,0,2,3,0,48,57,65,90,97,122,1,0,48,57,
        56,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,1,
        11,1,0,0,0,3,13,1,0,0,0,5,21,1,0,0,0,7,31,1,0,0,0,9,48,1,0,0,0,11,
        12,5,32,0,0,12,2,1,0,0,0,13,14,5,99,0,0,14,15,5,97,0,0,15,16,5,114,
        0,0,16,17,5,103,0,0,17,18,5,97,0,0,18,19,5,114,0,0,19,4,1,0,0,0,
        20,22,7,0,0,0,21,20,1,0,0,0,22,23,1,0,0,0,23,21,1,0,0,0,23,24,1,
        0,0,0,24,25,1,0,0,0,25,26,5,46,0,0,26,27,5,109,0,0,27,28,5,112,0,
        0,28,29,5,51,0,0,29,6,1,0,0,0,30,32,7,0,0,0,31,30,1,0,0,0,32,33,
        1,0,0,0,33,31,1,0,0,0,33,34,1,0,0,0,34,35,1,0,0,0,35,44,5,47,0,0,
        36,38,7,0,0,0,37,36,1,0,0,0,38,39,1,0,0,0,39,37,1,0,0,0,39,40,1,
        0,0,0,40,41,1,0,0,0,41,43,5,47,0,0,42,37,1,0,0,0,43,46,1,0,0,0,44,
        42,1,0,0,0,44,45,1,0,0,0,45,8,1,0,0,0,46,44,1,0,0,0,47,49,7,1,0,
        0,48,47,1,0,0,0,49,50,1,0,0,0,50,48,1,0,0,0,50,51,1,0,0,0,51,10,
        1,0,0,0,6,0,23,33,39,44,50,0
    ]

class musicologoLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    COMANDO = 2
    ARCHIVO_MP3 = 3
    RUTA = 4
    DURACION = 5

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "' '", "'cargar'" ]

    symbolicNames = [ "<INVALID>",
            "COMANDO", "ARCHIVO_MP3", "RUTA", "DURACION" ]

    ruleNames = [ "T__0", "COMANDO", "ARCHIVO_MP3", "RUTA", "DURACION" ]

    grammarFileName = "musicologo.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


