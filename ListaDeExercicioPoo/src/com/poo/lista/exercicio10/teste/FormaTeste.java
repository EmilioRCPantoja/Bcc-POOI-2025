package com.poo.lista.exercicio10.teste;

import com.poo.lista.exercicio10.dominio.Circulo;
import com.poo.lista.exercicio10.dominio.Retangulo;
import com.poo.lista.exercicio10.dominio.Triangulo;

public class FormaTeste {
    static void main() {
        Circulo circulo  = new Circulo(2.5);
        Retangulo retangulo = new Retangulo(2,4);
        Triangulo triangulo = new Triangulo(2, 4);

        System.out.println("------circulo------");
        System.out.println(circulo.retornarArea());

        System.out.println("------retângulo------");
        System.out.println(retangulo.retornarArea());

        System.out.println("------triângulo------");
        System.out.println(triangulo.retornarArea());
    }



}
