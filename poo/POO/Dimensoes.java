package teste;

public class Dimensoes {
    private Double largura;
    private Double altura;
    private Double comprimento;

    public Dimensoes(Double largura, Double altura, Double comprimento) {
        this.largura = largura;
        this.altura = altura;
        this.comprimento = comprimento;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    
}
