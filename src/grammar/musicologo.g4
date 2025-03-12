grammar musicologo;

inicio: expresion* EOF;

expresion: COMANDO_CARGAR ' ' RUTA? ARCHIVO_MP3 #cargarFuncion
         | COMANDO_RECORTAR ' ' TIEMPO TIEMPO ARCHIVO_MP3 #recortarFuncion;


COMANDO_CARGAR: 'cargar' | 'load' | 'crg' | 'ld';
COMANDO_RECORTAR: 'recortar' | 'cut' | 'rct' | 'ct';

ARCHIVO_MP3: [a-zA-Z0-9]+ '.mp3';
RUTA: [a-zA-Z0-9]+ '/' ([a-zA-Z0-9]+ '/')*;
TIEMPO: [0-9]+ ':' [0-9]+ (':' [0-9]+)?;
WS: [ \t\r\n]+ -> skip;