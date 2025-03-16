grammar musicologo;

inicio: expresion* EOF;

expresion: COMANDO_CARGAR ' ' RUTA? ARCHIVO_MP3 ' ' COMANDO_ASIGNAR ' ' ID #cargarFuncion
         | COMANDO_RECORTAR ' ' TIEMPO ' ' TIEMPO ' ' ID ' ' COMANDO_ASIGNAR ' ' ID #recortarFuncion
         | COMANDO_EXPORTAR ' ' ID #exportarFuncion
         | COMANDO_INCREMENTAR_VOL ' ' ID ' ' VALOR (' ' TIEMPO ' ' TIEMPO)? (' ' COMANDO_ASIGNAR ' ' ID)? #incrementarVolFuncion
         | CONDICIONAL ' ' CONDICION ' ' HACER ' ' bloque (' ' ELSE ' ' bloque)? #condicionalFuncion
         | COMANDO_DIVIDIR ' ' TIEMPO ' ' ID ' ' COMANDO_ASIGNAR ' ' ID #dividirFuncion
         | COMANDO_COMBINAR ' ' ID ' ' ID ' ' COMANDO_ASIGNAR ' ' ID #combinarFuncion
         | COMANDO_SILENCIAR ' ' TIEMPO ' ' TIEMPO ' ' ID #silenciarFuncion
         ;

bloque: '{' expresion (' && ' expresion)* '}' | expresion;

COMANDO_CARGAR: 'cargar' | 'load' | 'crg' | 'ld';
COMANDO_RECORTAR: 'recortar' | 'cut' | 'rct' | 'ct';
COMANDO_EXPORTAR: 'exportar' | 'export' | 'exp' | 'ex';
COMANDO_INCREMENTAR_VOL: 'subirVol' | 'up' | 'sb' | 'sp';
COMANDO_ASIGNAR: 'como' | 'as';
COMANDO_DIVIDIR: 'dividir_en_trozos' | 'split' | 'div';
COMANDO_COMBINAR: 'combinar' | 'mix' | 'comb';
COMANDO_SILENCIAR: 'silenciar' | 'mute' | 'sil';

// Elementos para condiciones
CONDICIONAL: 'si' | 'if';
CONDICION: CARACTERISTICA ID OPERADOR (TIEMPO | VALOR | ID);
HACER: 'entonces' | 'then';
ELSE: 'sino' | 'else';
OPERADOR: '>' | '<' | '>=' | '<=' | '==' | '!=';
CARACTERISTICA: 'duración' | 'duracion' | 'dur' | 'd' | 'volumen' | 'vol' | 'v';

VALOR: [0-9]+ 'dB';
ARCHIVO_MP3: [a-zA-Z0-9]+ '.mp3';
ID: [a-zA-Z0-9]+;
RUTA: ([a-zA-Z0-9]+ '/')+;
TIEMPO: [0-9]+ ':' [0-9]+ (':' [0-9]+)?;
WS: [ \t\r\n]+ -> skip;