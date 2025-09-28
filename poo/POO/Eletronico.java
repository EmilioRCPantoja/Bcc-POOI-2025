import java.util.Date;

public class Eletronico extends Patrimonio {
    private String Marca;
    private String Modelo;

    public Eletronico(String cor, String laboratorio, Date dataCadastro, String marca,
    String modelo) {
        super(cor, laboratorio, dataCadastro);
        Marca = marca;
        Modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }
    
}

