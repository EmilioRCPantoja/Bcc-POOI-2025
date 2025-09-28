package com.poo.lista.exercicio5.teste;

import com.poo.lista.exercicio5.dominio.Circulo;
import com.poo.lista.exercicio5.dominio.Forma;
import com.poo.lista.exercicio5.dominio.Quadrado;
import com.poo.lista.exercicio5.dominio.Triangulo;

public class FormaTeste {
    static void main(String[] args) {

        Forma quadrado = new Quadrado(2, 5);
        Forma circulo = new Circulo(4);
        Forma triangulo = new Triangulo(2,7);

        System.out.println("Area Quadrado-------------------------------------------------");
        System.out.println(quadrado.calcularArea());

        System.out.println("Area Circulo--------------------------------------------------");
        System.out.println(circulo.calcularArea());

        System.out.println("Area Triangulo------------------------------------------------");
        System.out.println(triangulo.calcularArea()+"\n");

        System.out.println("Quantidade de Objetos-------------------------------------------------");
        Forma.mostrarQuantidadeDeObjetos();
    }
}
