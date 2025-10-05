package com.poo.lista.exercicio7.teste;

import com.poo.lista.exercicio7.dominio.Contador;

public class ContadorTeste {
    static void main() {
        Contador c = new Contador();
        Contador c1 = new Contador(10);

        System.out.println("c1---------------");
        System.out.println(c1.getIteracao());

        c.incrementar(6);

        System.out.println("c----------------");
        System.out.println(c.getIteracao());

        c.incrementar();

        System.out.println("c----------------");
        System.out.println(c.getIteracao());

        c.decrementar(2);

        System.out.println("c----------------");
        System.out.println(c.getIteracao());

        c.decrementar();

        System.out.println("c----------------");
        System.out.println(c.getIteracao());

        c.zerar();
        System.out.println("c----------------");
        System.out.println(c.getIteracao());
    }


}
