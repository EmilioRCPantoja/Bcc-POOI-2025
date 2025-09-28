package com.poo.exercicioponto2d.dominio;

public class Ponto2D {
    private double x;
    private double y;

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()) return false;
        Ponto2D ponto = (Ponto2D) obj;

        return Double.compare(ponto.getX(), x) == 0 && Double.compare(ponto.getY(), y) == 0;
    }

    @Override
    public Ponto2D clone(){
        return new Ponto2D(this.x, this.y);
    }


    public double calcularDistancia(double x, double y){
        double diffX = x - getX();
        double diffY = y - getY();

        double d = Math.sqrt(Math.pow(diffX,2) + Math.pow(diffY,2));

        return d;
    }

    public void moverPonto(){
        this.x = 0;
        this.y = 0;
    }

    public void moverPonto(double sameCoord){
        this.x = sameCoord;
        this.y = sameCoord;
    }

    public void moverPonto(double x, double y){
        this.x = x;
        this.y = y;
    }


    public Ponto2D(){
        x = 0;
        y = 0;
    }

    public Ponto2D(double sameCoord){
        x = sameCoord;
        y = sameCoord;
    }

    public Ponto2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public void setY(double y){
        this.y = y;
    }

}
