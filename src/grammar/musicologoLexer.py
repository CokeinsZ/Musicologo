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
        4,0,10,145,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,
        2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,3,1,39,8,1,1,2,1,2,1,2,1,2,1,
        2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,3,2,57,8,2,1,3,1,3,
        1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,
        1,3,3,3,78,8,3,1,4,1,4,1,4,1,4,1,4,1,4,3,4,86,8,4,1,5,4,5,89,8,5,
        11,5,12,5,90,1,5,1,5,1,5,1,5,1,5,1,6,4,6,99,8,6,11,6,12,6,100,1,
        7,4,7,104,8,7,11,7,12,7,105,1,7,1,7,4,7,110,8,7,11,7,12,7,111,1,
        7,5,7,115,8,7,10,7,12,7,118,9,7,1,8,4,8,121,8,8,11,8,12,8,122,1,
        8,1,8,4,8,127,8,8,11,8,12,8,128,1,8,1,8,4,8,133,8,8,11,8,12,8,134,
        3,8,137,8,8,1,9,4,9,140,8,9,11,9,12,9,141,1,9,1,9,0,0,10,1,1,3,2,
        5,3,7,4,9,5,11,6,13,7,15,8,17,9,19,10,1,0,3,3,0,48,57,65,90,97,122,
        1,0,48,57,3,0,9,10,13,13,32,32,164,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,
        0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,1,0,0,0,0,13,1,0,0,0,0,15,1,0,
        0,0,0,17,1,0,0,0,0,19,1,0,0,0,1,21,1,0,0,0,3,38,1,0,0,0,5,56,1,0,
        0,0,7,77,1,0,0,0,9,85,1,0,0,0,11,88,1,0,0,0,13,98,1,0,0,0,15,103,
        1,0,0,0,17,120,1,0,0,0,19,139,1,0,0,0,21,22,5,32,0,0,22,2,1,0,0,
        0,23,24,5,99,0,0,24,25,5,97,0,0,25,26,5,114,0,0,26,27,5,103,0,0,
        27,28,5,97,0,0,28,39,5,114,0,0,29,30,5,108,0,0,30,31,5,111,0,0,31,
        32,5,97,0,0,32,39,5,100,0,0,33,34,5,99,0,0,34,35,5,114,0,0,35,39,
        5,103,0,0,36,37,5,108,0,0,37,39,5,100,0,0,38,23,1,0,0,0,38,29,1,
        0,0,0,38,33,1,0,0,0,38,36,1,0,0,0,39,4,1,0,0,0,40,41,5,114,0,0,41,
        42,5,101,0,0,42,43,5,99,0,0,43,44,5,111,0,0,44,45,5,114,0,0,45,46,
        5,116,0,0,46,47,5,97,0,0,47,57,5,114,0,0,48,49,5,99,0,0,49,50,5,
        117,0,0,50,57,5,116,0,0,51,52,5,114,0,0,52,53,5,99,0,0,53,57,5,116,
        0,0,54,55,5,99,0,0,55,57,5,116,0,0,56,40,1,0,0,0,56,48,1,0,0,0,56,
        51,1,0,0,0,56,54,1,0,0,0,57,6,1,0,0,0,58,59,5,101,0,0,59,60,5,120,
        0,0,60,61,5,112,0,0,61,62,5,111,0,0,62,63,5,114,0,0,63,64,5,116,
        0,0,64,65,5,97,0,0,65,78,5,114,0,0,66,67,5,101,0,0,67,68,5,120,0,
        0,68,69,5,112,0,0,69,70,5,111,0,0,70,71,5,114,0,0,71,78,5,116,0,
        0,72,73,5,101,0,0,73,74,5,120,0,0,74,78,5,112,0,0,75,76,5,101,0,
        0,76,78,5,120,0,0,77,58,1,0,0,0,77,66,1,0,0,0,77,72,1,0,0,0,77,75,
        1,0,0,0,78,8,1,0,0,0,79,80,5,99,0,0,80,81,5,111,0,0,81,82,5,109,
        0,0,82,86,5,111,0,0,83,84,5,97,0,0,84,86,5,115,0,0,85,79,1,0,0,0,
        85,83,1,0,0,0,86,10,1,0,0,0,87,89,7,0,0,0,88,87,1,0,0,0,89,90,1,
        0,0,0,90,88,1,0,0,0,90,91,1,0,0,0,91,92,1,0,0,0,92,93,5,46,0,0,93,
        94,5,109,0,0,94,95,5,112,0,0,95,96,5,51,0,0,96,12,1,0,0,0,97,99,
        7,0,0,0,98,97,1,0,0,0,99,100,1,0,0,0,100,98,1,0,0,0,100,101,1,0,
        0,0,101,14,1,0,0,0,102,104,7,0,0,0,103,102,1,0,0,0,104,105,1,0,0,
        0,105,103,1,0,0,0,105,106,1,0,0,0,106,107,1,0,0,0,107,116,5,47,0,
        0,108,110,7,0,0,0,109,108,1,0,0,0,110,111,1,0,0,0,111,109,1,0,0,
        0,111,112,1,0,0,0,112,113,1,0,0,0,113,115,5,47,0,0,114,109,1,0,0,
        0,115,118,1,0,0,0,116,114,1,0,0,0,116,117,1,0,0,0,117,16,1,0,0,0,
        118,116,1,0,0,0,119,121,7,1,0,0,120,119,1,0,0,0,121,122,1,0,0,0,
        122,120,1,0,0,0,122,123,1,0,0,0,123,124,1,0,0,0,124,126,5,58,0,0,
        125,127,7,1,0,0,126,125,1,0,0,0,127,128,1,0,0,0,128,126,1,0,0,0,
        128,129,1,0,0,0,129,136,1,0,0,0,130,132,5,58,0,0,131,133,7,1,0,0,
        132,131,1,0,0,0,133,134,1,0,0,0,134,132,1,0,0,0,134,135,1,0,0,0,
        135,137,1,0,0,0,136,130,1,0,0,0,136,137,1,0,0,0,137,18,1,0,0,0,138,
        140,7,2,0,0,139,138,1,0,0,0,140,141,1,0,0,0,141,139,1,0,0,0,141,
        142,1,0,0,0,142,143,1,0,0,0,143,144,6,9,0,0,144,20,1,0,0,0,15,0,
        38,56,77,85,90,100,105,111,116,122,128,134,136,141,1,6,0,0
    ]

class musicologoLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    COMANDO_CARGAR = 2
    COMANDO_RECORTAR = 3
    COMANDO_EXPORTAR = 4
    COMANDO_ASIGNAR = 5
    ARCHIVO_MP3 = 6
    ID = 7
    RUTA = 8
    TIEMPO = 9
    WS = 10

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "' '" ]

    symbolicNames = [ "<INVALID>",
            "COMANDO_CARGAR", "COMANDO_RECORTAR", "COMANDO_EXPORTAR", "COMANDO_ASIGNAR", 
            "ARCHIVO_MP3", "ID", "RUTA", "TIEMPO", "WS" ]

    ruleNames = [ "T__0", "COMANDO_CARGAR", "COMANDO_RECORTAR", "COMANDO_EXPORTAR", 
                  "COMANDO_ASIGNAR", "ARCHIVO_MP3", "ID", "RUTA", "TIEMPO", 
                  "WS" ]

    grammarFileName = "musicologo.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


