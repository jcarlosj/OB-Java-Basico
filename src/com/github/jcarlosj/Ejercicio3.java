package com.github.jcarlosj;

public class Ejercicio3 {
    public static void main(String[] args) {
        String names[] = { "Juan", "Ana", "Elisa", "Luisa", "Juliana", "Manuela", "Carlos" };
        String concatenatedStrings = "";

        for( String name : names ) {
            concatenatedStrings += name + " ";
        }

        System.out.println( concatenatedStrings );
    }
}
