from evaluador import Evaluador
from antlr4 import *
from grammar.musicologoLexer import musicologoLexer
from grammar.musicologoParser import musicologoParser

def evaluar_expresion(expresion):
    input_stream = InputStream(expresion)
    lexer = musicologoLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = musicologoParser(token_stream)
    tree = parser.inicio()

    evaluador = Evaluador()
    evaluador.visit(tree)

def main():
    print("Bienvenido a Musicologo. Ingrese los comandos que desee.")
    entrada = input("\n\t>>> ")
    evaluar_expresion(entrada)

if __name__ == '__main__':
    main()



