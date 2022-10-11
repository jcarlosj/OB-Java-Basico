package com.github.jcarlosj;

public class Ejercicio789 {
    public static void main(String[] args) {
        System.out.println( "\t" + reverse( "hola mundo!" ) );
        punto1();
    }

    /** Punto 0: Retorna una cadena al revés */
    public static String reverse( String texto ) {
        String stringUpsideDown = "";

        System.out.println( "0. Escribe el código que devuelva una cadena al revés." );

        for( int i = 0; i < texto.length(); i++ )
            stringUpsideDown = texto.charAt( i ) + stringUpsideDown;

        return stringUpsideDown;
    }

    /** 1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores. */
    public static void punto1() {
        String names [] = { "Janeth", "Juan", "Eva", "Carlos", "Sofia" };

        System.out.println( "1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores." );

        System.out.print( "\t" );
        for( String name : names )
            System.out.print( name + ", " );
    }
}
