package com.poo.lista.exercicio12;

public class Divisao implements OperacaoBasica {

    @Override
    public double calcular(int n1, int n2) {
        double res =  n1 / n2;

        return res;
    }
}
