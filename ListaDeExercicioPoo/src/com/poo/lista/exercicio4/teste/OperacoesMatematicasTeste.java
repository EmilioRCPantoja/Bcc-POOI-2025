package com.poo.lista.exercicio4.teste;

import com.poo.lista.exercicio4.dominio.Divisao;
import com.poo.lista.exercicio4.dominio.Multiplicacao;
import com.poo.lista.exercicio4.dominio.Soma;
import com.poo.lista.exercicio4.dominio.Subtracao;

public class OperacoesMatematicasTeste {
    public static void main(String[] Args){
        Soma soma = new Soma(1,2);
        Subtracao subtracao = new Subtracao(4,3);
        Multiplicacao multiplicacao = new Multiplicacao(2,2);
        Divisao divisao = new Divisao(10,2);

        System.out.println("SOMA------------------------------");
        soma.calcular();
        System.out.println(soma.getResultado()+"\n");
        System.out.println("SUBTRACAO-------------------------");
        subtracao.calcular();
        System.out.println(subtracao.getResultado()+"\n");
        System.out.println("MULTIPLICAÇÃO---------------------");
        multiplicacao.calcular();
        System.out.println(multiplicacao.getResultado()+"\n");
        System.out.println("DIVISÃO---------------------------");
        divisao.calcular();
        System.out.println(divisao.getResultado());
    }
}
