grammar musicologo;

inicio: expresion* EOF;

expresion: COMANDO ARCHIVO_MP3 #funcion; // TO-DO poner un nombre bonito

COMANDO: 'cargar';

ARCHIVO_MP3: [a-zA-Z0-9]+ '.mp3';
DURACION: [0-9]+;