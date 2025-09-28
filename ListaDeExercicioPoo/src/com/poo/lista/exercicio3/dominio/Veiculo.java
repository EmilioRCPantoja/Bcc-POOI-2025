package com.poo.lista.exercicio3.dominio;

public class Veiculo {
    private double qntdCombustivel;
    private double autonomia;
    private double distanciaPercorrida = 0.0;

    public void andar(double distanciaEmKm){
        if(qntdCombustivel <= 0 || distanciaEmKm == 0 || this.qntdCombustivel < (distanciaEmKm / autonomia) ){
            return;
        }
        else{
            this.qntdCombustivel -= (distanciaEmKm / this.autonomia);
            this.distanciaPercorrida += distanciaEmKm;
        }
    }

    public void mostrarAutonomia(){
        System.out.println(this.autonomia);
    }

    public double mostrarDistanciaPercorrida(){
        return this.distanciaPercorrida;
    }

    public Veiculo(double qntdCombustivel, double autonomia){
        this.qntdCombustivel = qntdCombustivel;
        this.autonomia = autonomia;
    }

    public double getQntdCombustivel() {
        return qntdCombustivel;
    }

    public void setQntdCombustivel(double qntdCombustivel) {
        this.qntdCombustivel = qntdCombustivel;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }



}
