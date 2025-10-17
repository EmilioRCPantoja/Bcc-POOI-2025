package com.poo.lista.exercicio10.dominio;

public class Retangulo extends Poligono{
    public Retangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double retornarArea() {
        double area = this.getBase() * this.getAltura();

        return area;
    }
}
