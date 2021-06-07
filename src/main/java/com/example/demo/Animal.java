package com.example.demo;

import java.time.LocalDate;

public class Animal {

    private String nome;
    private LocalDate nascimento;
    private int quantidadeBraços;
    private int quantidadePernas;
    private double altura;
    private double peso;

    Animal() {
        nascimento = LocalDate.now();
        altura = 1;
        peso = 1;
    }

    Animal(String nome) {
        nascimento = LocalDate.now();
        altura = 1;
        peso = 1;
        this.nome = nome;
    }

    void seApresentar() {
        System.out.println("Olá mundo, eu sou " + nome);
    }

    void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Altura negativa não pode");
        }
    }

    double getAltura() {
        return altura;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public int getQuantidadeBraços() {
        return quantidadeBraços;
    }

    public void setQuantidadeBraços(int quantidadeBraços) {
        this.quantidadeBraços = quantidadeBraços;
    }

    public int getQuantidadePernas() {
        return quantidadePernas;
    }

    public void setQuantidadePernas(int quantidadePernas) {
        this.quantidadePernas = quantidadePernas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}


