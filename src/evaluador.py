from grammar.musicologoVisitor import musicologoVisitor
from grammar.musicologoParser import musicologoParser
from pydub import AudioSegment
import re


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
        
        # Ensure the file name ends with .mp3
        if not nombre.endswith(".mp3"):
            print("Error: Solo se soportan archivos .mp3.")
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

        print("Cargando archivo: " + nombre)
    
    def visitRecortarFuncion(self, ctx:musicologoParser.RecortarFuncionContext):      
        # Get start and end time in milliseconds
        start = self.convertir_a_milisegundos(ctx.getChild(2).getText())
        end = self.convertir_a_milisegundos(ctx.getChild(4).getText())

        # Get the ID of the original audio
        if ctx.getChild(6) is not None:
            id_original = ctx.getChild(6).getText()

        else:
            print("Error: No se proporcionó un ID.")
            return

        if ctx.getChild(6).getText() not in self.audios:
            print("Error: El ID no existe.")
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

        print("Recortando archivo " + id_original + " de " + str(start) + " a " + str(end) + " y guardando como " + id_nuevo)

        # Saves the audio file with the specified range
        self.audios[id_nuevo] = self.audios[id_original][start:end]

    def visitExportarFuncion(self, ctx:musicologoParser.ExportarFuncionContext):
        # Get the ID
        if ctx.ID() is not None:
            id = ctx.ID().getText()

        else:
            print("Error: No se proporcionó un ID.")     
            return  
        
        if ctx.ID().getText() not in self.audios:
            print("Error: El ID no existe.")
            return 

        self.audios[id].export( "archivos/" + id + ".mp3", format="mp3")
        print("Exportando archivo " + id + " a archivos/" + id + ".mp3")

    # Visit a parse tree produced by musicologoParser#incrementarVolFuncion.
    def visitIncrementarVolFuncion(self, ctx:musicologoParser.IncrementarVolFuncionContext):
        # Obtener todos los tokens del contexto
        ids = [token.getText() for token in ctx.getTokens(musicologoParser.ID)]
        tiempos = [self.convertir_a_milisegundos(token.getText()) for token in ctx.getTokens(musicologoParser.TIEMPO)]
        decibeles = int(re.sub(r'db|dB|DB|Db', '', ctx.VOLUMEN().getText()))

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
            
            if len(tiempos) < 2:
                self.audios[id_nuevo] = self.audios[id_original] + decibeles
                print("Incrementando volumen del audio "
                      + id_original + " en " + decibeles + " dB y guardando como " + id_nuevo)
                return

            self.audios[id_nuevo] = self.audios[id_original][:tiempos[0]] + self.audios[id_original][tiempos[0]:tiempos[1]].apply_gain(decibeles) + self.audios[id_original][tiempos[1]:]
            print("Incrementando volumen del audio "
                  + id_original + " en " + decibeles + " dB de " + tiempos[0] + " a " + tiempos[1] + " y guardando como " + id_nuevo)
            return
        
        else:
            if len(tiempos) < 2:
                self.audios[id_original] += decibeles
                print("Incrementando volumen del audio "
                      + id_original + " en " + decibeles + " dB")
                return

            self.audios[id_original] = self.audios[id_original][:tiempos[0]] + self.audios[id_original][tiempos[0]:tiempos[1]].apply_gain(decibeles) + self.audios[id_original][tiempos[1]:]
            print("Incrementando volumen del audio "
                  + id_original + " en " + decibeles + " dB de " + tiempos[0] + " a " + tiempos[1])

    # Visit a parse tree produced by musicologoParser#condicionalFuncion.
    def visitCondicionalFuncion(self, ctx:musicologoParser.CondicionalFuncionContext):
        # Obtener la condicion
        condicion = ctx.condicion()
        res = self.visit(condicion)

        if res:
            self.visit(ctx.bloque(0))
            print("Condición verdadera.")

        elif ctx.ELSE() is not None:
            self.visit(ctx.bloque(1))
            print("Condición falsa.")


    # Visit a parse tree produced by musicologoParser#dividirFuncion.
    def visitDividirFuncion(self, ctx:musicologoParser.DividirFuncionContext):
        # Obtener todos los tokens del contexto
        ids = [token.getText() for token in ctx.getTokens(musicologoParser.ID)]
        tiempo = self.convertir_a_milisegundos(ctx.TIEMPO().getText())

        if len(ids) < 2:
            print("Error: No se proporcionaron los ID necesarios.")
            return

        id_original = ids[0]
        id_nuevo = ids[1]

        if id_original and id_original not in self.audios:
            print("Error: El ID no existe.")
            return

        if id_nuevo and id_nuevo in self.audios:
                print("Error: El ID para el nuevo audio ya existe.")
                return

        self.audios[id_nuevo + "1"] = self.audios[id_original][:tiempo]
        self.audios[id_nuevo + "2"] = self.audios[id_original][tiempo:]
        print("Dividiendo audio " + id_original + " en " + tiempo + " y guardando como " + id_nuevo + "1 y " + id_nuevo + "2.")


    # Visit a parse tree produced by musicologoParser#combinarFuncion.
    def visitCombinarFuncion(self, ctx:musicologoParser.CombinarFuncionContext):
        # Obtener todos los tokens del contexto
        ids = [token.getText() for token in ctx.getTokens(musicologoParser.ID)]

        if len(ids) < 3:
            print("Error: No se proporcionaron los ID necesarios.")
            return

        id_original_1 = ids[0]
        id_original_2 = ids[1]
        id_nuevo = ids[2]

        if (id_original_1 or id_original_2) and (id_original_1 not in self.audios or id_original_2 not in self.audios):
            print("Error: El ID no existe.")
            return

        if id_nuevo and id_nuevo in self.audios:
            print("Error: El ID para el nuevo audio ya existe.")
            return

        self.audios[id_nuevo] = self.audios[id_original_1] + self.audios[id_original_2]
        print("Combinando audio " + id_original_1 + " y " + id_original_2 + " y guardando como " + id_nuevo)


    # Visit a parse tree produced by musicologoParser#silenciarFuncion.
    def visitSilenciarFuncion(self, ctx:musicologoParser.SilenciarFuncionContext):
        id = ctx.ID().getText()
        tiempos = [self.convertir_a_milisegundos(token.getText()) for token in ctx.getTokens(musicologoParser.TIEMPO)]

        if id not in self.audios:
            print("Error: El ID no existe.")
            return

        if len(tiempos) < 2:
            print("Error: No se proporcionaron los tiempos necesarios.")
            return
        
        self.audios[id] = self.audios[id][:tiempos[0]] + AudioSegment.silent(duration=(tiempos[1] - tiempos[0])) + self.audios[id][tiempos[1]:] #Reemplaza el segmento de tiempo con silencio   
        print("Silenciando audio " + id + " de " + tiempos[0] + " a " + tiempos[1])


    # Visit a parse tree produced by musicologoParser#bloque.
    def visitBloque(self, ctx:musicologoParser.BloqueContext):
        tareas = ctx.expresion()
        for tarea in list(tareas):
            self.visit(tarea)

    # Visit a parse tree produced by musicologoParser#condicion.
    def visitCondicion(self, ctx:musicologoParser.CondicionContext):
        caracteristica = ctx.CARACTERISTICA().getText()
        id = ctx.ID().getText()
        operador = ctx.OPERADOR().getText()
        
        t = ctx.TIEMPO()
        v = ctx.VOLUMEN()
        if t is not None:
            valor = self.convertir_a_milisegundos(t.getText())
        elif v is not None:
            valor = int(re.sub(r'db|dB|DB|Db', '', v.getText()))

        if id not in self.audios:
            print("Error: El ID no existe.")
            return
        
        # Obtener característica
        if caracteristica in ['duración', 'duracion', 'dur', 'd']:
            valor_real = int(len(self.audios[id]))
        elif caracteristica in ['volumen', 'vol', 'v']:
            valor_real = int(self.audios[id].dBFS)
            print(f"El volumen promedio del audio es: {self.audios[id].dBFS} dBFS antes del cambio. {valor_real}")

        # Evaluar la condición
        match operador:
            case '<':
                return valor_real < valor
            case '<=':
                return valor_real <= valor
            case '>':
                return valor_real > valor
            case '>=':
                return valor_real >= valor
            case '==':
                return valor_real == valor
            case '!=':
                return valor_real != valor
            

    def convertir_a_milisegundos(self, tiempo):
        minutos, segundos = map(int, tiempo.split(':'))
        return (minutos * 60 + segundos) * 1000
    
    
    def visitConcatenarFuncion(self, ctx:musicologoParser.ConcatenarFuncionContext):
        # Obtener el ID del audio original
        id_original = ctx.ID(0).getText()

        repeticiones = int(ctx.NUMERO().getText())

        # Obtener el ID del nuevo audio
        id_nuevo = ctx.ID(1).getText()

        # Verificar que el audio original exista
        if id_original not in self.audios:
            print(f"Error: El audio con ID '{id_original}' no existe.")
            return

        # Concatenar el audio
        self.audios[id_nuevo] = self.audios[id_original] * repeticiones

        print(f"Audio '{id_original}' concatenado {repeticiones} veces y guardado como '{id_nuevo}'.")
        
        
    def visitRepetirFuncion(self, ctx:musicologoParser.RepetirFuncionContext):
        repeticiones = int(ctx.NUMERO().getText())

        # Obtener el bloque de expresiones
        bloque = ctx.bloque()
        if bloque is None:
            print("Error: No se encontró un bloque de expresiones para repetir.")
            return

        # Ejecutar el bloque de expresiones el número de veces indicado
        for i in range(repeticiones):
            print(f"Ejecutando iteración {i + 1} de {repeticiones}")
        
            self.visit(bloque)



