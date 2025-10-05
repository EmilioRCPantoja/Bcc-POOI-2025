package com.poo.lista.exercicio7.dominio;

public class Contador {
    private int iteracao = 0;

    public void zerar(){
        this.iteracao = 0;
    }

    public void incrementar(){
        this.iteracao++;
    }

    public void incrementar(int qntDeVezes){
        this.iteracao+=qntDeVezes;
    }

    public void decrementar(){
        this.iteracao--;
    }

    public void decrementar(int qntDeVezes){
        this.iteracao-=qntDeVezes;
    }

    public Contador(){
        this.iteracao=0;
    }

    public Contador(int iteracao){
        this.iteracao= iteracao;
    }

    public int getIteracao(){
        return this.iteracao;
    }

    public  void setIteracao(int iteracao){
        this.iteracao = iteracao;
    }

}
