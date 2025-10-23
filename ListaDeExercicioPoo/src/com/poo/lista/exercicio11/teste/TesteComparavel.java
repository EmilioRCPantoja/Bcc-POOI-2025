package com.poo.lista.exercicio11.teste;

import com.poo.lista.exercicio11.dominio.NumeroInteiro;

import java.util.ArrayList;

public class TesteComparavel {
    static void main() {
        NumeroInteiro n1 = new NumeroInteiro(1);
        NumeroInteiro n2 = new NumeroInteiro(2);
        NumeroInteiro n3 = new NumeroInteiro(3);
        NumeroInteiro n4 = new NumeroInteiro(4);

        int troca = 1;

        NumeroInteiro[] lista = {n1, n3, n2, n4};

        System.out.println("-----------Lista Desordenada----------");
        for(int j = 0; j < lista.length; j++){

            System.out.println(lista[j].getNum());

        }
        System.out.println("-----------Lista Desordenada----------");

        while(troca == 1){
            troca = 0;
            for(int i = 1; i < lista.length; i++){
                int n = lista[i-1].compararCom(lista[i]);
                if(n == 1){
                    int aux = lista[i-1].getNum();
                    lista[i-1].setNum(lista[i].getNum());
                    lista[i].setNum(aux);
                    troca = 1;
                }


            }


        }

        System.out.println("-----------Lista Ordenada----------");
        for(int j = 0; j < lista.length; j++){

            System.out.println(lista[j].getNum());

        }
        System.out.println("-----------Lista Ordenada----------");

    }
}
