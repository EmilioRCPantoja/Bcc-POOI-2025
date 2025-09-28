package com.poo.exercicioponto2d.teste;

import com.poo.exercicioponto2d.dominio.Ponto2D;

public class Ponto2DTeste {
    static void main(String[] args) {
        Ponto2D p1 = new Ponto2D(2, 4);
        Ponto2D p2 = p1.clone();

        System.out.println("P1------------------------");
        System.out.println("X = " + p1.getX() + "Y = " + p1.getY());

        System.out.println("P2------------------------");
        System.out.println("X = " + p2.getX() + "Y = " + p2.getY());

        System.out.println("Distância------------------------");
        System.out.println(p1.calcularDistancia(p2.getX(), p2.getY()) + "\n\n");

        p2.moverPonto(7);

        System.out.println("P1------------------------");
        System.out.println("X = " + p1.getX() + "Y = " + p1.getY());

        System.out.println("P2------------------------");
        System.out.println("X = " + p2.getX() + "Y = " + p2.getY());

        System.out.println("Distância------------------------");
        System.out.println(p1.calcularDistancia(p2.getX(), p2.getY()));
    }
}
