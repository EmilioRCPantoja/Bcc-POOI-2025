package com.poo.lista.exercicio10.dominio;

public class Circulo implements AreaCalculavel {
    private double raio;

    @Override
    public double retornarArea() {
        double area = raio * raio * 3.14;

        return area;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
