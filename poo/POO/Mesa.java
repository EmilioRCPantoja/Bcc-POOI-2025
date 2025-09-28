package teste;

import java.util.Date;

public class Mesa extends Movel {
    private FormatoMesa formatoMesa;

    

    public Mesa(String cor, String laboratorio, Date dataCadastro, int qtd_Pes, Dimensoes Dimensoes,
            FormatoMesa formatoMesa) {
        super(cor, laboratorio, dataCadastro, qtd_Pes, Dimensoes);
        this.formatoMesa = formatoMesa;
    }

    public FormatoMesa getFormatoMesa() {
        return formatoMesa;
    }

    public void setFormatoMesa(FormatoMesa formatoMesa) {
        this.formatoMesa = formatoMesa;
    }

}
