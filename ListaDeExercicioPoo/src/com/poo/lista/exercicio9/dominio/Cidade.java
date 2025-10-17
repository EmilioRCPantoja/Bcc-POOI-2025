package com.poo.lista.exercicio9.dominio;

public class Cidade extends Territorio{
    private Estado estado;

    public void emancipar(Cidade cidade){
        if(cidade == null){
            System.out.println("Foi informada uma cidade fantasma, logo não houve emancipação");
            return;
        }
        else if(cidade.getArea() > this.getArea()){
            System.out.println("Não é possível dividir uma cidade em outra maior do que ela mesma");
            return;
        }
        else if(cidade.getPopulacao() > this.getPopulacao()){
            System.out.println("Não é possível dividir uma cidade em outra com mais habitantes do que ela mesma");
            return;
        }
        else{
            this.setPopulacao(this.getPopulacao() - cidade.getPopulacao());
            this.setArea(this.getArea() - cidade.getArea());

            if(this.estado!=cidade.estado){
                this.estado.setPopulacao(this.estado.getPopulacao() - cidade.getPopulacao());
                cidade.estado.setPopulacao(cidade.estado.getPopulacao() + cidade.getPopulacao());

                Pais pais1 = this.estado.getPais();
                Pais pais2 = cidade.estado.getPais();
                if(pais1 != pais2){
                    pais1.setPopulacao(pais1.getPopulacao() - cidade.getPopulacao());
                    pais2.setPopulacao(pais2.getPopulacao() + cidade.getPopulacao());

                    Continente continente1 = pais1.getContinente();
                    Continente continente2 = pais2.getContinente();

                    if(continente1 != continente2){
                        continente1.setPopulacao(continente1.getPopulacao() - cidade.getPopulacao());
                        continente2.setPopulacao(continente2.getPopulacao() + cidade.getPopulacao());
                    }
                }
            }
        }

    }

    public void migrar(Cidade cidade){
        this.migrar(cidade,1);
    }

    public void migrar(Cidade cidade, int pessoas){
        if(pessoas <= 0){
            System.out.println("Número de pessoas a migrar é inválido");
        }
        else{
            this.setPopulacao(this.getPopulacao() - pessoas);
            cidade.setPopulacao(cidade.getPopulacao() + pessoas);

            if(this.estado!=cidade.estado){
                this.estado.setPopulacao(this.estado.getPopulacao() - pessoas);
                cidade.estado.setPopulacao(cidade.estado.getPopulacao() + pessoas);

                Pais pais1 = this.estado.getPais();
                Pais pais2 = cidade.estado.getPais();
                if(pais1 != pais2){
                    pais1.setPopulacao(pais1.getPopulacao() - pessoas);
                    pais2.setPopulacao(pais2.getPopulacao() + pessoas);

                    Continente continente1 = pais1.getContinente();
                    Continente continente2 = pais2.getContinente();

                    if(continente1 != continente2){
                        continente1.setPopulacao(continente1.getPopulacao() - pessoas);
                        continente2.setPopulacao(continente2.getPopulacao() + pessoas);
                    }
                }
            }


        }

    }

    public Cidade(int populacao, double area, Estado estado) {
        super(populacao, area);
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Cidade(){super(0,0.0);}

}
