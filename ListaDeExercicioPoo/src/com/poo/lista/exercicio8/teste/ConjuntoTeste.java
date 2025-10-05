package com.poo.lista.exercicio8.teste;

import com.poo.lista.exercicio8.dominio.Conjunto;

import java.util.ArrayList;

public class ConjuntoTeste {
    static void main(){
        ArrayList<Double> e1 = new ArrayList<>();
        e1.add(1d);
        e1.add(2.6);
        e1.add(3.8);

        ArrayList<Double> e2 = new ArrayList<>();
        e2.add(1d);
        e2.add(2.5);
        e2.add(3.9);

        Conjunto a = new Conjunto(e1);

        Conjunto b = new Conjunto(e2);

        Conjunto uniao = a.uniao(b);

        Conjunto interseccao = a.interseccao(b);

        Conjunto diferenca = a.diferenca(b);

        System.out.println("-------------------");
        System.out.println(diferenca.getElementos());

        System.out.println("-------------------");
        System.out.println(interseccao.getElementos());

        System.out.println("-------------------");
        System.out.println(uniao.getElementos());
    }
}
