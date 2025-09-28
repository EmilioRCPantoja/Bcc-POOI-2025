package com.mycompany.gerenciadordepatrimonio;

import java.util.Date;

public class Computador extends Eletronico{
    private String nome;
    private String processador;
    private String placaDeVideo;
    private String ram;
    private String armazenamento;
    private String placaMae;
    private String fonte;

    public Computador(Date data, String cor,String laboratorio, String marca, String modelo, String nome, String processador,
                      String placaDeVideo, String ram, String armazenamento,  String  placaMae, String fonte){
        super(marca, modelo, data, cor, laboratorio);
        this.nome = nome;
        this.processador = processador;
        this.placaDeVideo = placaDeVideo;
        this.ram = ram;
        this.armazenamento = armazenamento;
        this.placaMae = placaMae;
        this.fonte = fonte;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(String placaMae) {
        this.placaMae = placaMae;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }
}
