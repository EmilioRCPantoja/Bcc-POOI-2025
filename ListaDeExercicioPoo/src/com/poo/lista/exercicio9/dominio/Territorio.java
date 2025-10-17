package com.poo.lista.exercicio9.dominio;

import java.util.ArrayList;

public class Territorio {
    private int populacao;
    private double area;

    public void migrar(){}

    public void emancipar(){}

    public Territorio(int populacao, double area){
        this.populacao = populacao;
        this.area = area;

    }

    public  int getPopulacao(){
        return this.populacao;
    }

    public double getArea(){
        return this.area;
    }

    public void setPopulacao(int populacao){
        this.populacao=populacao;

    }

    public void setArea(double area){
        this.area = area;
    }

    public void atualizar(){}




}
