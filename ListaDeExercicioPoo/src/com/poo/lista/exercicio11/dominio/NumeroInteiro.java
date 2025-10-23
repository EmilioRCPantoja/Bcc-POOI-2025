package com.poo.lista.exercicio11.dominio;

import org.jetbrains.annotations.NotNull;

public class NumeroInteiro implements Comparavel {
    private int num;

    public NumeroInteiro(int numero){
        this.num = numero;
    }

    public int compararCom(@NotNull Comparavel c){

        NumeroInteiro outroN = (NumeroInteiro) c;
        if(this.num < outroN.num){
            return -1;
        }
        else if(this.num > outroN.num){
            return 1;
        }
        else{
            return 0;
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
