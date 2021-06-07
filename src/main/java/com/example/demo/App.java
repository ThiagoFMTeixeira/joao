package com.example.demo;

public class App {

    public static void main(String[] args) {
        Animal animal = new Cachorro("Animal");
        Pessoa thiago = new Pessoa("Thiago");
        Cachorro fofinho = new Cachorro("Fofinho");

        thiago.seApresentar();
        fofinho.seApresentar();
        animal.seApresentar();
    }

}
