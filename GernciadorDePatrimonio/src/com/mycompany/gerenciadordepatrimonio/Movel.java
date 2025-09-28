package com.mycompany.gerenciadordepatrimonio;

import java.util.Date;

public class Movel extends Patrimonio{
    private int qntDePes;
    private Dimensoes dimensoes;

    public Movel(Date data, String cor, String laboratorio, int quantidadeDePes, Dimensoes dimensoes){
        super(data, cor, laboratorio);
        this.qntDePes = quantidadeDePes;
        this.dimensoes = dimensoes;
    }

    public int getQntDePes() {
        return qntDePes;
    }

    public void setQntDePes(int qntDePes) {
        this.qntDePes = qntDePes;
    }

    public Dimensoes getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(Dimensoes dimensoes) {
        this.dimensoes = dimensoes;
    }
}
