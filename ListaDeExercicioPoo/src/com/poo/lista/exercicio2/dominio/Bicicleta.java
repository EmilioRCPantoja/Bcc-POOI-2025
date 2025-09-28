package com.poo.lista.exercicio2.dominio;

public class Bicicleta {
    private double velocidade;
    private boolean andando = false;


    public void acelerar(double delta){
        if(delta <= 0){
            return;
        }
        else{
            this.velocidade+=delta;

            if(andando == false){
                this.andando = true;
            }
        }
    }

    public boolean isAndando() {
        return andando;
    }

    public void setAndando(boolean andando) {
        this.andando = andando;
    }

    public void frear(double delta){
        if(delta <= 0){
            return;
        }
        else{
            this.velocidade-=delta;
            if(this.velocidade - delta == 0){
                this.andando = false;
            }
        }
    }

    public double mostrarVelocidade(){
        return this.velocidade;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
