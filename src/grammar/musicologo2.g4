grammar musicologo2;

inicio: expresion* EOF;

expresion: COMANDO_CARGAR ' ' RUTA? ARCHIVO_MP3 ' ' COMANDO_ASIGNAR ' ' ID #cargarFuncion
         | COMANDO_RECORTAR ' ' TIEMPO ' ' TIEMPO ' ' ID ' ' COMANDO_ASIGNAR ' ' ID #recortarFuncion
         | COMANDO_EXPORTAR ' ' ID #exportarFuncion
         | COMANDO_INCREMENTAR_VOL ' ' ID ' ' VALOR (' ' TIEMPO ' ' TIEMPO)? #incrementarVolFuncion
         | CONDICIONAL ' ' condicion ' ' HACER ' ' bloque (' ' ELSE ' ' bloque)? #condicionalFuncion
         | COMANDO_DIVIDIR ' ' TIEMPO ' ' ID ' ' COMANDO_ASIGNAR ' ' ID #dividirFuncion
         | COMANDO_COMBINAR ' ' ID ' ' ID ' ' COMANDO_ASIGNAR ' ' ID #combinarFuncion
         | COMANDO_SILENCIAR ' ' TIEMPO ' ' TIEMPO ' ' ID #silenciarFuncion
         ;

condicion: CARACTERISTICA ID OPERADOR (TIEMPO | VALOR | ID);
bloque: '{' expresion (' && ' expresion)* '}' | expresion;

COMANDO_CARGAR: 'cargar' | 'load' | 'crg' | 'ld';
COMANDO_RECORTAR: 'recortar' | 'cut' | 'rct' | 'ct';
COMANDO_EXPORTAR: 'exportar' | 'export' | 'exp' | 'ex';
COMANDO_INCREMENTAR_VOL: 'subirVol' | 'up' | 'sb' | 'sp';
COMANDO_ASIGNAR: 'como' | 'as';
CONDICIONAL: 'si' | 'if';
HACER: 'entonces' | 'then';
ELSE: 'sino' | 'else';

CARACTERISTICA: 'duración' | 'duracion' | 'dur' | 'd' | 'volumen' | 'vol' | 'v';
COMANDO_DIVIDIR: 'dividir_en_trozos' | 'split' | 'div';
COMANDO_COMBINAR: 'combinar' | 'mix' | 'comb';
COMANDO_SILENCIAR: 'silenciar' | 'mute' | 'sil';

// Elementos para condiciones
OPERADOR: '>' | '<' | '>=' | '<=' | '==' | '!=';

// Tokens básicos
ARCHIVO_MP3: [a-zA-Z0-9]+ '.mp3';
ID: [a-zA-Z0-9]+;
RUTA: ([a-zA-Z0-9]+ '/')+;
TIEMPO: [0-9]+ ':' [0-9]+ (':' [0-9]+)?;
VALOR: [0-9]+;
WS: [ \t\r\n]+ -> skip;