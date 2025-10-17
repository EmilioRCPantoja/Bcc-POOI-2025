package com.poo.lista.exercicio10.dominio;

public class Triangulo extends Poligono{
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double retornarArea() {
        double area = (this.getBase() * this.getAltura() / 2);

        return area;
    }
}
