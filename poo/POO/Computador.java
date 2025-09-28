package teste;

import java.util.Date;

public class Computador extends Eletronico{
    private String nome;
    private String placaMae;
    private String processador;
    private String memoriaRam;
    private String armazenamento;
    private String fonte;

    
    
    public Computador(String nome, String cor, String laboratorio, Date dataCadastro, String marca, String modelo,
            String placaMae, String processador, String memoriaRam, String armazenamento, String fonte) {
        super(cor, laboratorio, dataCadastro, marca, modelo);
        this.nome = nome;
        this.placaMae = placaMae;
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
        this.fonte = fonte;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getPlacaMae() {
        return placaMae;
    }
    public void setPlacaMae(String placaMae) {
        this.placaMae = placaMae;
    }
    public String getProcessador() {
        return processador;
    }
    public void setProcessador(String processador) {
        this.processador = processador;
    }
    public String getMemoriaRam() {
        return memoriaRam;
    }
    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
    public String getarmazento() {
        return armazenamento;
    }
    public void sethD(String armazenamento) {
        this.armazenamento = armazenamento;
    }
    public String getArmazenamento() {
        return armazenamento;
    }
    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }
    public String getFonte() {
        return fonte;
    }
    public void setFonte(String fonte) {
        this.fonte = fonte;
    }
    
}
