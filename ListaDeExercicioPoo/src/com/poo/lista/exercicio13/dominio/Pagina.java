package com.poo.lista.exercicio13.dominio;

import java.util.ArrayList;

public class Pagina implements Imprimivel {
    private ArrayList<String> ListaDeParagrafos;

    public Pagina(ArrayList<String> paragrafos){
        this.ListaDeParagrafos = paragrafos;
    }


    @Override
    public String retornarTexto() {
        String texto = "";
        for(String paragrafo:this.ListaDeParagrafos){
            texto += " " + paragrafo + "\n";
        }
        return texto;
    }
}
