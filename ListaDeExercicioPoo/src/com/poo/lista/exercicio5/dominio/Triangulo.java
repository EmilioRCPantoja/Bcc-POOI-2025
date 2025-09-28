package com.poo.lista.exercicio5.dominio;

public class Triangulo extends Forma {
    private double lado;
    private double altura;


    @Override
    public double calcularArea() {
        double res = (getAltura()*getLado())/2;
        return res;
    }

    public Triangulo(double lado, double altura){
        super();
        if(lado <= 0 || altura <= 0){
            throw new IllegalArgumentException("ambos, lado e altura, devem ser um valor positivo");
        }
        else{
            this.lado = lado;
            this.altura = altura;
        }
    }

    public void setLado(double lado){
        if(lado <= 0){
            throw new IllegalArgumentException("o lado deve ser um valor positivo");
        }
        else{
            this.lado = lado;
        }
    }

    public double getLado(){
        return this.lado;
    }

    public void setAltura(double altura){
        if(altura <= 0){
            throw new IllegalArgumentException("a altura deve ser um valor positivo");
        }
        else{
            this.altura = altura;
        }
    }

    public double getAltura(){
        return this.altura;
    }
}
