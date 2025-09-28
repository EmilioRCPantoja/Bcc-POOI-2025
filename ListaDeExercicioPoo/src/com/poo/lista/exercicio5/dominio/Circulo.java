package com.poo.lista.exercicio5.dominio;

public class Circulo extends Forma{
    private double diametro;
    private double raio;

    public double calcularArea() {
        double res = getRaio() * getRaio() * 3.14;
        return res;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        if(diametro <= 0){
            throw new IllegalArgumentException("o diametro deve ser um valor positivo");
        }
        else{
            this.diametro = diametro;
        }
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if(raio <= 0){
            throw new IllegalArgumentException("o raio deve ser um valor positivo");
        }
        else{
            this.raio = raio;
        }
    }


    public Circulo(double diametro) {
        super();
        if(diametro <= 0){
            throw new IllegalArgumentException("o diametro deve ser um valor positivo");
        }
        else{
            this.diametro = diametro;
            this.raio = diametro/2;
        }
    }

}
