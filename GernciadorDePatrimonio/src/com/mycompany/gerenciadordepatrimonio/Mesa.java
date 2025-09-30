package com.mycompany.gerenciadordepatrimonio;

import java.util.Date;

public class Mesa extends Movel{
    private FormatoDaMesa formato;

    public Mesa(Date data, String cor, String laboratorio, int quantidadeDePes, Dimensoes dimensoes, FormatoDaMesa formato){
        super(data, cor, laboratorio, quantidadeDePes, dimensoes);
        this.formato = formato;
    }

    public void setFormato(FormatoDaMesa formato){
        this.formato = formato;
    }

    public FormatoDaMesa getFormato(){
        return this.formato;

    }
}
