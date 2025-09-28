package com.poo.lista.exercicio1.teste;

import com.poo.lista.exercicio1.dominio.Pessoa;

public class PessoaTeste {
    public static void main(String[] Args) {
        Pessoa pessoa = new Pessoa("Fulano", 60, 1.75);

        System.out.printf("%.2f", pessoa.calcularIMC());
    }
}
