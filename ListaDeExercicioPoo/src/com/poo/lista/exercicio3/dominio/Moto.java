package com.poo.lista.exercicio3.dominio;

public class Moto extends Veiculo {
    private int cilindradas;
    private boolean carenagem;

    public Moto(double qntdCombustivel, double autonomia, int cilindradas, boolean carenagem) {
        super(qntdCombustivel, autonomia);
        this.carenagem = carenagem;
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public boolean isCarenagem() {
        return carenagem;
    }

    public void setCarenagem(boolean carenagem) {
        this.carenagem = carenagem;
    }
}
