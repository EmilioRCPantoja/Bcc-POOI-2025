package com.poo.lista.exercicio11.dominio;

public class Calculadora {
    static void main() {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

        System.out.println("Soma--------------");
        System.out.println(soma.calcular(4,2));

        System.out.println("Subtração---------");
        System.out.println(subtracao.calcular(4,2));

        System.out.println("Multiplicação-----");
        System.out.println(multiplicacao.calcular(4,2));

        System.out.println("Divisão-----------");
        System.out.println(divisao.calcular(4,2));


    }




}
