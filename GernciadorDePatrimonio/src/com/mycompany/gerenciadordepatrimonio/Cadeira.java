package com.mycompany.gerenciadordepatrimonio;

import java.util.Date;

public class Cadeira extends Movel{
    private TipoDeCadeira tipo;

    public  Cadeira(Date data, String cor, String laboratorio, int quantidadeDePes, Dimensoes dimensoes, TipoDeCadeira tipo){
        super(data, cor, laboratorio,quantidadeDePes, dimensoes);
        this.tipo = tipo;
    }
}
