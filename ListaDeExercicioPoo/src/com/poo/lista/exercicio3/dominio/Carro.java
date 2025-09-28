package com.poo.lista.exercicio3.dominio;

public class Carro extends Veiculo {
    private int qntDePortas ;
    private TipoDeCarro tipo;
    private TipoDeCarroceria carroceria;

    public TipoDeCarro getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeCarro tipo) {
        this.tipo = tipo;
    }

    public TipoDeCarroceria getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(TipoDeCarroceria carroceria) {
        this.carroceria = carroceria;
    }

    public int getQntDePortas() {
        return qntDePortas;
    }

    public void setQntDePortas(int qntDePortas) {
        this.qntDePortas = qntDePortas;
    }

    public Carro(double qntdCombustivel, double autonomia, int qntdDePortas, TipoDeCarro tipo, TipoDeCarroceria carroceria) {
        super(qntdCombustivel, autonomia);
        this.qntDePortas = qntdDePortas;
        this.tipo = tipo;
        this.carroceria = carroceria;
    }

}
