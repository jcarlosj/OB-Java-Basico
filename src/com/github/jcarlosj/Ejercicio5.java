package com.github.jcarlosj;

import com.github.jcarlosj.coche.CocheCRUD;

public class Ejercicio5 {

    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUD();
        System.out.println( cocheCrud.save() );
        System.out.println( cocheCrud.findAll() );
        System.out.println( cocheCrud.delete() );
    }

}
