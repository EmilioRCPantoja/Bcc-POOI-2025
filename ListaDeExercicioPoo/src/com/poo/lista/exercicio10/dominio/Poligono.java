package com.poo.lista.exercicio10.dominio;

public abstract class Poligono implements AreaCalculavel{
    private double base;
    private double altura;

    @Override
    public double retornarArea() {
        double area = 0.0;
        return area;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Poligono(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }




}
