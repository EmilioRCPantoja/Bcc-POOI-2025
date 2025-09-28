
import java.util.Date;

public class Cadeira extends Patrimonio {
     private TipoCadeira tipoCadeira;

     public Cadeira(String cor, String laboratorio, Date dataCadastro, int qtd_Pes, Dimensoes Dimensoes,
            TipoCadeira tipoCadeira) {
        super(cor, laboratorio, dataCadastro, qtd_Pes, Dimensoes);
        this.tipoCadeira = tipoCadeira;
     }

     public TipoCadeira getTipoCadeira() {
         return tipoCadeira;
     }

     public void setTipoCadeira(TipoCadeira tipoCadeira) {
         this.tipoCadeira = tipoCadeira;
     }
     
}
