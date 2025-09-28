import java.util.Date;

public class Patrimonio{
    private Long ID_Etiqueta;
    private String cor;
    private String laboratorio;
    private Date dataCadastro;


    private Long id = 0L;

    public Patrimonios(String cor, String laboratorio, Date dataCadastro) {
        ID_Etiqueta = id++;
        this.cor = cor;
        this.laboratorio = laboratorio;
        this.dataCadastro = dataCadastro;
    }

    public Long getID_Etiqueta() {
        return ID_Etiqueta;
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

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}