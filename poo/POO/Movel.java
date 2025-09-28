package teste;

import java.util.Date;

public class Movel extends Patrimonio {
    private int qtd_Pes;
    private Dimensoes Dimensoes;

    public Movel(String cor, String laboratorio, Date dataCadastro, int qtd_Pes, Dimensoes Dimensoes) {
        super(cor, laboratorio, dataCadastro);
        this.qtd_Pes = qtd_Pes;
        this.Dimensoes = Dimensoes;
    }

    public int getQtd_Pes() {
        return qtd_Pes;
    }

    public void setQtd_Pes(int qtd_Pes) {
        this.qtd_Pes = qtd_Pes;
    }

    public Dimensoes getDimensoes() {
        return Dimensoes;
    }

    public void setDimensoes(Dimensoes Dimensoes) {
        this.Dimensoes = Dimensoes;
    }
}
