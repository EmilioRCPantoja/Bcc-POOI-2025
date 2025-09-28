package com.poo.lista.exercicio3.teste;

import com.poo.lista.exercicio3.dominio.*;

public class VeiculosTeste {
    static void main() {
        Veiculo veiculo = new Veiculo(10, 16);

        TipoDeCarro tipo = TipoDeCarro.FAMILIAR;
        TipoDeCarroceria carroceria = TipoDeCarroceria.SUV;
        Carro carro = new Carro(veiculo.getQntdCombustivel(), veiculo.getAutonomia(), 4, tipo, carroceria);

        Moto moto = new Moto(veiculo.getQntdCombustivel(), veiculo.getAutonomia(), 150, false);

        System.out.println("CARRO----------------------------------------");

        System.out.println("Autonomia: " + carro.getAutonomia() + "Km/L");
        System.out.println("Quantidade de combustível:  " + carro.getQntdCombustivel() + "L");
        System.out.println("Distancia percorrida: " + carro.mostrarDistanciaPercorrida() + "Km");

        carro.andar(16);
        carro.andar(16);

        System.out.println(carro.mostrarDistanciaPercorrida() + "Km ---------------------------------------------------------");


        System.out.println("Autonomia: " + carro.getAutonomia() + "Km/L");
        System.out.println("Quantidade de combustível:  " + carro.getQntdCombustivel() + "L");
        System.out.println("Distancia percorrida: " + carro.mostrarDistanciaPercorrida() + "Km\n\n");

        System.out.println("MOTO----------------------------------------");

        System.out.println("Autonomia: " + carro.getAutonomia() + "Km/L");
        System.out.println("Quantidade de combustível:  " + carro.getQntdCombustivel() + "L");
        System.out.println("Distancia percorrida: " + carro.mostrarDistanciaPercorrida() + "Km");

        moto.andar(16);
        moto.andar(32);

        System.out.println(moto.mostrarDistanciaPercorrida() + "Km ---------------------------------------------------------");

        System.out.println("Autonomia: " + carro.getAutonomia() + "Km/L");
        System.out.println("Quantidade de combustível:  " + carro.getQntdCombustivel() + "L");
        System.out.println("Distancia percorrida: " + carro.mostrarDistanciaPercorrida() + "Km");
    }
}


