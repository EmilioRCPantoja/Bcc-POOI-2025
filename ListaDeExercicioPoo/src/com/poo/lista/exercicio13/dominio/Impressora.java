package com.poo.lista.exercicio13.dominio;

public class Impressora {
    public void imprimir(Imprimivel conteudo){
        System.out.println("__________________________________________");
        System.out.printf(conteudo.retornarTexto());
        System.out.println("__________________________________________");
    }
}
