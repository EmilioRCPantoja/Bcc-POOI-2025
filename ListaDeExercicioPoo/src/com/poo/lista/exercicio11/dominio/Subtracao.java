package com.poo.lista.exercicio11.dominio;

public class Subtracao implements OperacaoBasica{

    @Override
    public double calcular(int n1, int n2) {
        double res = n1 - n2;

        return res;
    }
}
