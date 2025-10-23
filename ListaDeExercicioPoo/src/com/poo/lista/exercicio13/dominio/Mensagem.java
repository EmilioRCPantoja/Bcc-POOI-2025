package com.poo.lista.exercicio13.dominio;

public class Mensagem implements Imprimivel {
    private String mensagem;

    public Mensagem(String texto){
        this.mensagem = texto;
    }

    @Override
    public String retornarTexto() {
        return this.mensagem;
    }
}
