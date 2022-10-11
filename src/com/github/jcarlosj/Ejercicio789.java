package com.github.jcarlosj;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Ejercicio789 {
    public static void main(String[] args) {
        System.out.println( "\t" + reverse( "hola mundo!" ) );
        punto1();
        punto2();
        punto3();
        punto5();
        punto6();
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

        System.out.println( "" );
    }

    /** 2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones. */
    public static void punto2() {
        int numbers[][] = new int[][]{
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };

        System.out.println( "2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones." );

        for( int i = 0; i < numbers.length; i++ ) {
            System.out.print( "\t" );

            for( int j = 0; j < numbers[ i ].length; j++ ) {
                System.out.print( "(" + i + "," + j + "): " + numbers[ i ][ j ] + ", " );
            }

            System.out.println( "" );
        }

    }

    /** 3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final. */
    public static void punto3() {
        Vector<String> languages = new Vector<String>();

        System.out.println( "3. Crea un \"Vector\" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final." );

        languages.add( "Español" );
        languages.add( "Inglés" );
        languages.add( "Portugues" );
        languages.add( "Francés" );
        languages.add( "Alemán" );

        languages.remove( 2 );
        languages.remove( 3 );

        System.out.print( "\t" );
        for( String value : languages )
            System.out.print( value + ", " );

    }

    /** 4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo. */

    /** 5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento. */
    public static void punto5() {
        ArrayList<String> alLanguages = new ArrayList<String>();

        System.out.println( "5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento." );

        alLanguages.add( "Español" );
        alLanguages.add( "Inglés" );
        alLanguages.add( "Portugues" );
        alLanguages.add( "Francés" );

        LinkedList<String> llLanguages = new LinkedList<String>( alLanguages );

        System.out.print( "\t(ArrayList): " );
        for( String lang : alLanguages )
            System.out.print( lang + ", " );
        System.out.println( "" );

        System.out.print( "\t(LinkedList): " );
        for( String lang : llLanguages )
            System.out.print( lang + ", " );
        System.out.println( "" );

    }

    /** 6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno. */
    public static void punto6() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        System.out.println( "6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer \"for\" de relleno." );

        for( int i = 1; i <= 10; i++ )
            numbers.add( i );

        System.out.print( "\t" + numbers );

        for( int i = 1; i < numbers.size(); i++ )
            if( numbers.get( i ) % 2 == 0 )
                numbers.remove( i );

        System.out.print( "\n\t" );
        for( int number : numbers )
            System.out.print( number + ", " );

    }
}
