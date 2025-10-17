package com.poo.lista.exercicio9.dominio;

import java.util.ArrayList;

public class Continente extends Territorio{
   private ArrayList<Pais> paises;

    public ArrayList<Pais> getPaises() {
        return paises;
    }

    public void setPaises(ArrayList<Pais> paises) {
        this.paises = paises;
    }

    public Continente(ArrayList<Pais> paises){
        super(0,0.0);
        this.paises = paises;

        if(paises != null){

            int populacaoTotal = 0 ;
            double areaTotal = 0.0;
            for(Pais pais:this.paises){
                populacaoTotal += pais.getPopulacao();
                areaTotal += pais.getArea();
            }
            this.setPopulacao(populacaoTotal);
            this.setArea(areaTotal);
        }
        else{
            System.out.println("Nenhum país foi informado");
            this.setArea(0.0);
            this.setPopulacao(0);
        }

    }

    public void atualizar(){
        if(paises != null){

            int populacaoTotal = 0 ;
            double areaTotal = 0.0;
            for(Pais pais:this.paises){
                populacaoTotal += pais.getPopulacao();
                areaTotal += pais.getArea();
            }
            this.setPopulacao(populacaoTotal);
            this.setArea(areaTotal);
        }
        else{
            System.out.println("Nenhum país foi informado");
            this.setArea(0.0);
            this.setPopulacao(0);
        }
    }


}
