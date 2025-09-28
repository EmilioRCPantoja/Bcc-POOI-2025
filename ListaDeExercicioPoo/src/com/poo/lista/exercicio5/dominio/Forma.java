package com.poo.lista.exercicio5.dominio;

public abstract class Forma {
    private static int qntdDeObjetos;

    public Forma(){
        this.qntdDeObjetos++;
    }

    public abstract double calcularArea();

    public static void mostrarQuantidadeDeObjetos(){
        System.out.println(qntdDeObjetos);
    }
}
