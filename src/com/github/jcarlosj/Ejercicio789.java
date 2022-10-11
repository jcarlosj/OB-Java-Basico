package com.github.jcarlosj;

public class Ejercicio789 {
    public static void main(String[] args) {
        System.out.println( "0. " + reverse( "hola mundo!" ) );
    }

    /** Punto 0: Retorna una cadena al revés */
    public static String reverse( String texto ) {
        String stringUpsideDown = "";

        for( int i = 0; i < texto.length(); i++ )
            stringUpsideDown = texto.charAt( i ) + stringUpsideDown;

        return stringUpsideDown;
    }
}
