package com.poo.lista.exercicio13.dominio;

import java.util.ArrayList;

public class Livro implements Imprimivel {
    public ArrayList<Pagina> listaDePaginas;


    public Livro(){
        this.listaDePaginas = new ArrayList<>();
    };

    public Livro(ArrayList<Pagina> paginas){
        this.listaDePaginas = paginas;
    }

    public void adicionarPagina(Pagina pagina) {
        this.listaDePaginas.add(pagina);
    }

    @Override
    public String retornarTexto() {
        String texto = "";

        for(int i = 0; i < listaDePaginas.size();i++){
            Pagina pagina = listaDePaginas.get(i);
            texto = texto + "\nPágina" + (1+i) + "\n";
            texto = texto + pagina.retornarTexto();

            if(i < listaDePaginas.size() - 1){
                texto += "\n";
            }
        }
        return texto;
    }
}
