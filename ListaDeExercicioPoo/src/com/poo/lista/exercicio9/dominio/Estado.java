package com.poo.lista.exercicio9.dominio;

import java.util.ArrayList;

public class Estado extends Territorio{
    private ArrayList<Cidade> cidades;
    private Pais pais;

    public ArrayList<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(ArrayList<Cidade> cidades) {
        this.cidades = cidades;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Estado(){
        super(0,0.0);
    }


    public Estado(ArrayList<Cidade> cidades, Pais pais){
        super(0, 0.0);

        this.cidades = cidades;
        this.pais = pais;

        if(cidades != null) {
            int populacaoTotal = 0;
            double areaTotal = 0.0;
            for (Cidade cidade : this.cidades) {
                populacaoTotal += cidade.getPopulacao();
                areaTotal += cidade.getArea();
            }
            this.setPopulacao(populacaoTotal);
            this.setArea(areaTotal);

        }
        else{
            System.out.println("Nenhuma cidade foi informada");
            this.setArea(0.0);
            this.setPopulacao(0);
        }

    }

    public void atualizar(){
        if(cidades != null) {
            int populacaoTotal = 0;
            double areaTotal = 0.0;
            for (Cidade cidade : this.cidades) {
                populacaoTotal += cidade.getPopulacao();
                areaTotal += cidade.getArea();
            }
            this.setPopulacao(populacaoTotal);
            this.setArea(areaTotal);

        }
        else{
            System.out.println("Nenhuma cidade foi informada");
            this.setArea(0.0);
            this.setPopulacao(0);
        }
    }

    public void emancipar(Estado estado){
        if(estado == null){
            System.out.println("Foi informada um estado fantasma, logo não houve emancipação");
            return;
        }
        else if(estado.getArea() > this.getArea()){
            System.out.println("Não é possível dividir um estado em outro maior do que ele mesmo");
            return;
        }
        else if(estado.getPopulacao() > this.getPopulacao()){
            System.out.println("Não é possível dividir um estado em outro com mais habitantes do que ele mesmo");
            return;
        }
        else{
            this.setPopulacao(this.getPopulacao() - estado.getPopulacao());
            this.setArea(this.getArea() - estado.getArea());

            Pais pais1 = this.getPais();
            Pais pais2 = estado.getPais();
            if(pais1 != pais2){
                pais1.setPopulacao(pais1.getPopulacao() - estado.getPopulacao());
                pais2.setPopulacao(pais2.getPopulacao() + estado.getPopulacao());

                Continente continente1 = pais1.getContinente();
                Continente continente2 = pais2.getContinente();

                if(continente1 != continente2){
                    continente1.setPopulacao(continente1.getPopulacao() - estado.getPopulacao());
                    continente2.setPopulacao(continente2.getPopulacao() + estado.getPopulacao());
                }
            }
        }
    }

}

