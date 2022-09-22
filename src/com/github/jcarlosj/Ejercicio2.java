package com.github.jcarlosj;

public class Ejercicio2 {
    public static void main(String[] args) {
        float precio_eur = 34;
        float precio_iva_incluido = aplicar_iva( precio_eur );

        System.out.println( "Precio artículo: " + precio_eur + "€, \nPrecio con IVA: " + precio_iva_incluido + "€" );
    }

    public static float aplicar_iva( float valor_euros ) {
        float IVA = 0.21f;

        return valor_euros + ( valor_euros * IVA );
    }
}
