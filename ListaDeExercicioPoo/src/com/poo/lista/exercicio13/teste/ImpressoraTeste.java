package com.poo.lista.exercicio13.teste;

import com.poo.lista.exercicio13.dominio.*;

import java.util.ArrayList;
import java.util.List;

public class ImpressoraTeste {
    static void main() {
        Impressora impressora = new Impressora();

        // 1. Cria e Imprime um objeto Mensagem
        Mensagem saudacao = new Mensagem("Olá mundo! Implementando interfaces e polimorfismo.");
        impressora.imprimir(saudacao);


        Livro lendaUrbana = new Livro();

        // Cria Páginas
        Pagina pag1 = new Pagina( new ArrayList<> (List.of(
                "Era uma vez uma interface chamada Imprimivel.",
                "Ela tinha um poder mágico: garantir que quem a implementasse soubesse 'retornarTexto'."
        )));

        Pagina pag2 = new Pagina(new ArrayList<> (List.of(
                "Um dia, uma Mensagem e um Livro a implementaram.",
                "A impressora, sem saber o tipo real, conseguia imprimir os dois!",
                "E assim, o mundo da OO ficou mais feliz."
        )));

        lendaUrbana.adicionarPagina(pag1);
        lendaUrbana.adicionarPagina(pag2);

        impressora.imprimir(lendaUrbana);
    }
}

