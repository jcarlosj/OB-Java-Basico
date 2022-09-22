package com.github.jcarlosj;

public class Ejercicio1 {
    public static void main(String[] args) {

        // PRIMITIVOS: Numéricos
        System.out.println( "*** Primitivos ***" );
        byte numberByte = 1;
        short numberShort = 9;
        int numberInt = 127;
        long numberLong = 34567;
        float numberFloat = 23.5f;
        double numberDouble1 = 23.5;
        double numberDouble2 = 23.5d;

        System.out.println( "byte: \t" + numberByte );
        System.out.println( "short: \t" + numberShort );
        System.out.println( "int: \t" + numberInt );
        System.out.println( "long: \t" + numberLong );
        System.out.println( "float +f: \t" + numberFloat );
        System.out.println( "double: \t" + numberDouble1 );
        System.out.println( "double +d: \t" + numberDouble2 );

        // PRIMITIVOS: Caracteres
        char character1 = 'a';
        char character2 = 'A';

        System.out.println( "char: \t" + character1 );
        System.out.println( "char: \t" + character2 );

        // PRIMITIVOS: Booleanos
        boolean isOpen = true;
        boolean canClose = false;

        System.out.println( "boolean: \t" + isOpen );
        System.out.println( "boolean: \t" + canClose );

        // COMPLEJOS: String
        System.out.println( "*** Complejos ***" );
        String full_name = "Juan Carlos Jiménez Gutiérrez";

        System.out.println( "String: \t" + full_name );
    }
}
