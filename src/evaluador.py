from grammar.musicologoVisitor import musicologoVisitor
from grammar.musicologoParser import musicologoParser
from pydub import AudioSegment

class Evaluador(musicologoVisitor):
    def __init__(self):
        self.audios = {}

    # Visit a parse tree produced by musicologoParser#inicio.
    def visitInicio(self, ctx:musicologoParser.InicioContext):
        for hijo in list(ctx.getChildren()):
            self.visit(hijo)

    # Visit a parse tree produced by musicologoParser#funcion.
    def visitCargarFuncion(self, ctx:musicologoParser.CargarFuncionContext):
        # Get the audio file
        if (ctx.RUTA() is not None) and (ctx.ARCHIVO_MP3() is not None):
            nombre = ctx.RUTA().getText() + ctx.ARCHIVO_MP3().getText() # Concatenate the path and the file name

        elif ctx.ARCHIVO_MP3():
            nombre = ctx.ARCHIVO_MP3().getText()

        else:
            print("Error: No se proporcionó un archivo de audio.")
            return
        
        # Get the ID
        if ctx.ID() is not None:
            id = ctx.ID().getText()

        elif ctx.ID() in self.audios:
            print("Error: El ID ya existe.")
            return

        else:
            print("Error: No se proporcionó un ID.")     
            return   

        self.audios[id] = AudioSegment.from_file(nombre, format="mp3")

        #debug
        print("Cargando archivo: " + nombre)
        print(self.audios)
    
    def visitRecortarFuncion(self, ctx:musicologoParser.RecortarFuncionContext):      
        # Get start time in milliseconds
        start_time = ctx.getChild(2).getText()
        start = self.convertir_a_milisegundos(start_time)

        # Get end time in milliseconds
        end_time = ctx.getChild(4).getText()
        end = self.convertir_a_milisegundos(end_time)

        # Get the ID of the original audio
        if ctx.getChild(6) is not None:
            id_original = ctx.getChild(6).getText()

        elif ctx.getChild(6) not in self.audios:
            print("Error: El ID no existe.")
            return

        else:
            print("Error: No se proporcionó un ID.")
            return

        # Get the ID for the new audio
        if ctx.getChild(10) is not None:
            id_nuevo = ctx.getChild(10).getText()  # Cambiado de ctx.getChild(6) a ctx.getChild(10)

        elif ctx.getChild(10) in self.audios:
            print("Error: El ID para el nuevo audio recortado ya existe.")
            return

        else:
            print("Error: No se proporcionó un ID para el nuevo audio recortado.")
            return

        print("Recortando archivo " + id_original + " de " + str(start) + " a " + str(end))

        # Saves the audio file with the specified range
        self.audios[id_nuevo] = self.audios[id_original][start:end]

    def visitExportarFuncion(self, ctx:musicologoParser.ExportarFuncionContext):
        # Get the ID
        if ctx.ID() is not None:
            id = ctx.ID().getText()

        elif ctx.ID() not in self.audios:
            print("Error: El ID no existe.")
            return

        else:
            print("Error: No se proporcionó un ID.")     
            return   

        self.audios[id].export( "archivos/" + id + ".mp3", format="mp3")

    # Visit a parse tree produced by musicologoParser#incrementarVolFuncion.
    def visitIncrementarVolFuncion(self, ctx:musicologoParser.IncrementarVolFuncionContext):
        #TODO: Implementar la función de incrementar volumen en los segmentos de tiempo especificados

        # Obtener todos los tokens del contexto
        ids = [token.getText() for token in ctx.getTokens(musicologoParser.ID)]
        tiempos = [token.getText() for token in ctx.getTokens(musicologoParser.TIEMPO)]
        decibeles = int(ctx.VALOR().getText().replace("dB", ""))

        if len(ids) < 1:
            print("Error: No se proporcionó un ID.")
            return

        id_original = ids[0]  # El primer ID es el original
        id_nuevo = ids[1] if len(ids) > 1 else None  # El segundo ID (si existe) es el nuevo

        if id_original not in self.audios:
            print("Error: El ID no existe.")
            return

        if id_nuevo:
            if id_nuevo in self.audios:
                print("Error: El ID para el nuevo audio ya existe.")
                return
            
            self.audios[id_nuevo] = self.audios[id_original] + decibeles
                
        self.audios[id_original] += decibeles

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

    
    def convertir_a_milisegundos(self, tiempo):
        minutos, segundos = map(int, tiempo.split(':'))
        return (minutos * 60 + segundos) * 1000
