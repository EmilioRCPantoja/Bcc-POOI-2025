package com.poo.lista.exercicio8.dominio;

import java.util.ArrayList;

public class Conjunto {

    private ArrayList<Double> elementos;

    public Conjunto uniao(Conjunto conjunto){
        Conjunto uniao = new Conjunto();

        for(Double elemento:this.elementos){
            if(!uniao.elementos.contains(elemento)){
                uniao.elementos.add(elemento);
            }
        }

        for(Double elemento:conjunto.elementos){
            if(!uniao.elementos.contains(elemento)){
                uniao.elementos.add(elemento);
            }
        }

        return new Conjunto(uniao.elementos);
    }

    public Conjunto interseccao(Conjunto conjunto){
        Conjunto interseccao = new Conjunto();

        for(Double elemento:this.elementos){
            if(conjunto.elementos.contains(elemento) && !interseccao.elementos.contains(elemento)){
                interseccao.elementos.add(elemento);
            }
        }

        return new Conjunto(interseccao.elementos);
    }

    public Conjunto diferenca(Conjunto conjunto){
        Conjunto diferenca = new Conjunto();

        for(Double elemento:this.elementos){
            if(!conjunto.elementos.contains(elemento) && !diferenca.elementos.contains(elemento)){
                diferenca.elementos.add(elemento);
            }
        }

        return new Conjunto(diferenca.elementos);
    }

    public Conjunto(){
        this.elementos = new ArrayList<Double>();
    }

    public Conjunto(ArrayList<Double> elementos){
        this.elementos = elementos;
    }

    public void setElementos(ArrayList<Double> elementos){
        this.elementos = elementos;
    }

    public ArrayList<Double> getElementos(){
        return new ArrayList<>(this.elementos);
    }

    public void setElemento(double elemento){
        this.elementos.add(elemento);
    }

    public double getElemento(int index){
        return this.elementos.get(index);
    }
}
