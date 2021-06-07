package com.example.demo;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    void seApresentar() {
        System.out.println("Au au au au");
    }

}
