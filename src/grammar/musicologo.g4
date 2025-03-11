grammar musicologo;

inicio: expresion* EOF;

expresion: cargarExpresion #cargarFuncion
         | recortarExpresion #recortarFuncion;

cargarExpresion: COMANDO_CARGAR ' ' RUTA? ARCHIVO_MP3;
recortarExpresion: COMANDO_RECORTAR ' ' ARCHIVO_MP3;

COMANDO_CARGAR: 'cargar' | 'load' | 'crg' | 'ld';
COMANDO_RECORTAR: 'recortar' | 'cut' | 'rct' | 'ct';

ARCHIVO_MP3: [a-zA-Z0-9]+ '.mp3';
RUTA: [a-zA-Z0-9]+ '/' ([a-zA-Z0-9]+ '/')*;
DURACION: [0-9]+;
WS: [ \t\r\n]+ -> skip;