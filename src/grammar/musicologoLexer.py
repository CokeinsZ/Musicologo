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
        4,0,4,33,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,1,0,1,0,1,1,1,1,1,
        1,1,1,1,1,1,1,1,1,1,2,4,2,20,8,2,11,2,12,2,21,1,2,1,2,1,2,1,2,1,
        2,1,3,4,3,30,8,3,11,3,12,3,31,0,0,4,1,1,3,2,5,3,7,4,1,0,2,3,0,48,
        57,65,90,97,122,1,0,48,57,34,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,
        0,7,1,0,0,0,1,9,1,0,0,0,3,11,1,0,0,0,5,19,1,0,0,0,7,29,1,0,0,0,9,
        10,5,32,0,0,10,2,1,0,0,0,11,12,5,99,0,0,12,13,5,97,0,0,13,14,5,114,
        0,0,14,15,5,103,0,0,15,16,5,97,0,0,16,17,5,114,0,0,17,4,1,0,0,0,
        18,20,7,0,0,0,19,18,1,0,0,0,20,21,1,0,0,0,21,19,1,0,0,0,21,22,1,
        0,0,0,22,23,1,0,0,0,23,24,5,46,0,0,24,25,5,109,0,0,25,26,5,112,0,
        0,26,27,5,51,0,0,27,6,1,0,0,0,28,30,7,1,0,0,29,28,1,0,0,0,30,31,
        1,0,0,0,31,29,1,0,0,0,31,32,1,0,0,0,32,8,1,0,0,0,3,0,21,31,0
    ]

class musicologoLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    COMANDO = 2
    ARCHIVO_MP3 = 3
    DURACION = 4

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "' '", "'cargar'" ]

    symbolicNames = [ "<INVALID>",
            "COMANDO", "ARCHIVO_MP3", "DURACION" ]

    ruleNames = [ "T__0", "COMANDO", "ARCHIVO_MP3", "DURACION" ]

    grammarFileName = "musicologo.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


