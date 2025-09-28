package com.mycompany.gerenciadordepatrimonio;

import java.util.Date;

public class Eletronico extends Patrimonio {
    private String marca;
    private String modelo;

    public Eletronico(String marca, String modelo, Date data, String cor, String laboratorio)
    {
        super(data, cor, laboratorio);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;

    }

    public void setMarca(String marca){
        this.marca = marca;
    }
}
