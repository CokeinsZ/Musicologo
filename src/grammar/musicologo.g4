grammar musicologo;

inicio: expresion* EOF;

expresion: COMANDO_CARGAR ' ' RUTA? ARCHIVO_MP3 ' ' COMANDO_ASIGNAR ' ' ID #cargarFuncion
         | COMANDO_RECORTAR ' ' TIEMPO ' ' TIEMPO ' ' ID (' ' ID)? #recortarFuncion
         | COMANDO_EXPORTAR #exportarFuncion;


COMANDO_CARGAR: 'cargar' | 'load' | 'crg' | 'ld';
COMANDO_RECORTAR: 'recortar' | 'cut' | 'rct' | 'ct';
COMANDO_EXPORTAR: 'exportar' | 'export' | 'exp' | 'ex';
COMANDO_ASIGNAR: 'como' | 'as';

ARCHIVO_MP3: [a-zA-Z0-9]+ '.mp3';
ID: [a-zA-Z0-9]+;
RUTA: [a-zA-Z0-9]+ '/' ([a-zA-Z0-9]+ '/')*;
TIEMPO: [0-9]+ ':' [0-9]+ (':' [0-9]+)?;
WS: [ \t\r\n]+ -> skip;