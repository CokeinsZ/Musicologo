grammar musicologo;

inicio: expresion* EOF;

expresion: COMANDO_CARGAR ' ' RUTA? ARCHIVO_MP3 ' ' COMANDO_ASIGNAR ' ' ID #cargarFuncion
         | COMANDO_RECORTAR ' ' TIEMPO ' ' TIEMPO ' ' ID ' ' COMANDO_ASIGNAR ' ' ID #recortarFuncion
         | COMANDO_EXPORTAR ' ' ID #exportarFuncion
         | COMANDO_INCREMENTAR_VOL ' ' ID ' ' VOLUMEN (' ' TIEMPO ' ' TIEMPO)? (' ' COMANDO_ASIGNAR ' ' ID)? #incrementarVolFuncion
         | CONDICIONAL ' ' condicion ' ' HACER ' ' bloque (' ' ELSE ' ' bloque)? #condicionalFuncion
         | COMANDO_DIVIDIR ' ' TIEMPO ' ' ID ' ' COMANDO_ASIGNAR ' ' ID #dividirFuncion
         | COMANDO_COMBINAR ' ' ID ' ' ID ' ' COMANDO_ASIGNAR ' ' ID #combinarFuncion
         | COMANDO_SILENCIAR ' ' TIEMPO ' ' TIEMPO ' ' ID #silenciarFuncion
         | COMANDO_CONCATENAR ' ' ID ' ' NUMERO ' ' COMANDO_ASIGNAR ' ' ID #concatenarFuncion
         | COMANDO_REPETIR ' ' NUMERO ' ' HACER ' ' bloque #repetirFuncion
         ;

bloque: '{' ' '* expresion (' && ' expresion)* ' '* '}' | expresion;
condicion: CARACTERISTICA ' ' ID ' ' OPERADOR (' ' TIEMPO | ' ' VOLUMEN);

// Funciones principales
COMANDO_CARGAR: 'cargar' | 'load' | 'crg' | 'ld';
COMANDO_RECORTAR: 'recortar' | 'cut' | 'rct' | 'ct';
COMANDO_EXPORTAR: 'exportar' | 'export' | 'exp' | 'ex';
COMANDO_INCREMENTAR_VOL: 'subirVol';
COMANDO_ASIGNAR: 'como' | 'as';
COMANDO_DIVIDIR: 'dividir' | 'split' | 'div';
COMANDO_COMBINAR: 'combinar' | 'mix' | 'comb';
COMANDO_SILENCIAR: 'silenciar' | 'mute' | 'sil';
COMANDO_REPETIR: 'repetir' | 'repeat';
COMANDO_CONCATENAR: 'concatenar' | 'concat';

// Elementos para condiciones
CONDICIONAL: 'si' | 'if';
HACER: 'entonces' | 'then';
ELSE: 'sino' | 'else';
OPERADOR: '>' | '<' | '>=' | '<=' | '==' | '!=';
CARACTERISTICA: 'duración' | 'duracion' | 'dur' | 'd' | 'volumen' | 'vol' | 'v';

VOLUMEN: ('-')?[0-9]+ ('dB' | 'db' | 'DB' | 'Db');
ARCHIVO_MP3: [a-zA-Z0-9]+ '.' ('mp3' | [a-zA-Z0-9]+);
ID: [a-zA-Z][a-zA-Z0-9]*; // Empieza con una letra y puede contener números
RUTA: ([a-zA-Z0-9]+ '/')+;
TIEMPO: [0-9]+ ':' [0-9]+ (':' [0-9]+)?;
NUMERO: [0-9]+;
WS: [ \t\r\n]+ -> skip;
