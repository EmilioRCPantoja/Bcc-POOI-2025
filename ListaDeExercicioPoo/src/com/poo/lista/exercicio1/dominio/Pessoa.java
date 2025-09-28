package com.poo.lista.exercicio1.dominio;

public class Pessoa {
    private String nome;
    private double peso;
    private double altura;

    public double calcularIMC(){

        double peso = this.peso;
        double altura = this.altura;

        double imc = peso / (altura * altura);

        return imc;
    }

    public Pessoa(String nome, double peso, double altura){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}


