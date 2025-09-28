package com.poo.lista.exercicio2.teste;

import com.poo.lista.exercicio2.dominio.Bicicleta;

public class BicicletaTeste {
    static void main() {
        Bicicleta bicicleta = new Bicicleta();

        System.out.println(bicicleta.mostrarVelocidade() + "\n " + bicicleta.isAndando());

        bicicleta.acelerar(5);

        System.out.println(bicicleta.mostrarVelocidade() + "\n " + bicicleta.isAndando());
    }
}
