package com.github.jcarlosj.coche;

public class CocheCRUD implements CocheCRUDImpl {

    @Override
    public String save() {
        return "Save!";
    }

    @Override
    public String findAll() {
        return "Find All";
    }

    @Override
    public String delete() {
        return "Delete!";
    }
}
