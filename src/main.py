from evaluador import Evaluador
from antlr4 import *
from grammar.musicologoLexer import musicologoLexer
from grammar.musicologoParser import musicologoParser

global evaluador
def evaluar_expresion(expresion):
    input_stream = InputStream(expresion)
    lexer = musicologoLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = musicologoParser(token_stream)
    tree = parser.inicio()

    # Imprime el árbol de análisis sintáctico
    print("Árbol de análisis sintáctico:")
    print(tree.toStringTree(recog=parser))

    evaluador.visit(tree)


def main():
    print("Bienvenido a Musicologo. Ingrese los comandos que desee.")
    salir = False
    while not salir:
        entrada = input("\n\t>>> ")
        if entrada == "salir":
            salir = True
            break


        evaluar_expresion(entrada)
        

if __name__ == '__main__':
    evaluador = Evaluador()
    main()



