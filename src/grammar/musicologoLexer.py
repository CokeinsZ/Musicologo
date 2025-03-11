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
        4,0,3,29,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,1,0,1,0,1,0,1,0,1,0,1,0,1,
        0,1,1,4,1,16,8,1,11,1,12,1,17,1,1,1,1,1,1,1,1,1,1,1,2,4,2,26,8,2,
        11,2,12,2,27,0,0,3,1,1,3,2,5,3,1,0,2,3,0,48,57,65,90,97,122,1,0,
        48,57,30,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,1,7,1,0,0,0,3,15,1,
        0,0,0,5,25,1,0,0,0,7,8,5,99,0,0,8,9,5,97,0,0,9,10,5,114,0,0,10,11,
        5,103,0,0,11,12,5,97,0,0,12,13,5,114,0,0,13,2,1,0,0,0,14,16,7,0,
        0,0,15,14,1,0,0,0,16,17,1,0,0,0,17,15,1,0,0,0,17,18,1,0,0,0,18,19,
        1,0,0,0,19,20,5,46,0,0,20,21,5,109,0,0,21,22,5,112,0,0,22,23,5,51,
        0,0,23,4,1,0,0,0,24,26,7,1,0,0,25,24,1,0,0,0,26,27,1,0,0,0,27,25,
        1,0,0,0,27,28,1,0,0,0,28,6,1,0,0,0,3,0,17,27,0
    ]

class musicologoLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    COMANDO = 1
    ARCHIVO_MP3 = 2
    DURACION = 3

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'cargar'" ]

    symbolicNames = [ "<INVALID>",
            "COMANDO", "ARCHIVO_MP3", "DURACION" ]

    ruleNames = [ "COMANDO", "ARCHIVO_MP3", "DURACION" ]

    grammarFileName = "musicologo.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


