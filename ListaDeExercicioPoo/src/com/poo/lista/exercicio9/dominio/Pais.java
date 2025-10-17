package com.poo.lista.exercicio9.dominio;

import java.util.ArrayList;

public class Pais extends Territorio{
    private ArrayList<Estado> estados;
    private Continente continente;

    public ArrayList<Estado> getEstados() {
        return estados ;
    }

    public void setEstados(ArrayList<Estado> estados) {
        this.estados = estados;
    }

    public Continente getContinente() {
        return continente;
    }

    public void setContinente(Continente continente) {
        this.continente = continente;
    }

    public Pais(ArrayList<Estado> estados, Continente continente){
        super(0, 0.0);

        this.estados = estados;
        this.continente = continente;

        if(estados != null){
            int populacaoTotal = 0;
            double areaTotal = 0.0;
            for(Estado estado: this.estados){
                populacaoTotal += estado.getPopulacao();
                areaTotal += estado.getArea();
            }
            this.setPopulacao(populacaoTotal);
            this.setArea(areaTotal);
        }
        else {
            System.out.println("Nenhum estado foi informado");
            this.setArea(0.0);
            this.setPopulacao(0);
        }
    }

    public void atualizar(){
        if(estados != null){
            int populacaoTotal = 0;
            double areaTotal = 0.0;
            for(Estado estado: this.estados){
                populacaoTotal += estado.getPopulacao();
                areaTotal += estado.getArea();
            }
            this.setPopulacao(populacaoTotal);
            this.setArea(areaTotal);
        }
        else {
            System.out.println("Nenhum estado foi informado");
            this.setArea(0.0);
            this.setPopulacao(0);
        }
    }


    public void emancipar(Pais pais){
        if(pais == null){
            System.out.println("Foi informada um país fantasma, logo não houve emancipação");
            return;
        }
        else if(pais.getArea() > this.getArea()){
            System.out.println("Não é possível dividir um país em outro maior do que ele mesmo");
            return;
        }
        else if(pais.getPopulacao() > this.getPopulacao()){
            System.out.println("Não é possível dividir um país em outro com mais habitantes do que ele mesmo");
            return;
        }
        else{
            this.setPopulacao(this.getPopulacao() - pais.getPopulacao());
            this.setArea(this.getArea() - pais.getArea());



                Continente continente1 = this.getContinente();
                Continente continente2 = pais.getContinente();

                if(continente1 != continente2){
                    continente1.setPopulacao(continente1.getPopulacao() - pais.getPopulacao());
                    continente2.setPopulacao(continente2.getPopulacao() + pais.getPopulacao());

            }
        }
    }


}
