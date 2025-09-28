package com.mycompany.gerenciadordepatrimonio;

import java.util.Date;

public class Patrimonio {
    private long idEtiqueta = 0l;
    private Date dataCadastro;
    private String cor;
    private String laboratorio;


    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public long getIdEtiqueta() {
        return idEtiqueta;
    }

    public Patrimonio(Date data, String cor, String laboratorio){
        this.idEtiqueta++;
        this.dataCadastro = data;
        this.cor = cor;
        this.laboratorio = laboratorio;
    }

}
