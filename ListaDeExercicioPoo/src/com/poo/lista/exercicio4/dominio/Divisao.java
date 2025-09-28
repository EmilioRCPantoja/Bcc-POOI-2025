package com.poo.lista.exercicio4.dominio;

public class Divisao extends OperacaoMatematica{
    public Divisao(double numero1, double numero2){
        super(numero1, numero2);
    }

    @Override
    public void calcular(){
        double res = getNumero1() / getNumero2();
        setResultado(res);
    }
}
