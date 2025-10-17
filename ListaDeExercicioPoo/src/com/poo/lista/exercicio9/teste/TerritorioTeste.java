package com.poo.lista.exercicio9.teste;

import com.poo.lista.exercicio9.dominio.Cidade;
import com.poo.lista.exercicio9.dominio.Continente;
import com.poo.lista.exercicio9.dominio.Estado;
import com.poo.lista.exercicio9.dominio.Pais;

import java.util.ArrayList;

public class TerritorioTeste {
    static void main() {

        ArrayList<Cidade> listaC = new ArrayList<Cidade>();
        ArrayList<Cidade> listaC1 = new ArrayList<Cidade>();
        ArrayList<Estado> listaE = new ArrayList<Estado>();
        ArrayList<Estado> listaE1 = new ArrayList<Estado>();
        ArrayList<Pais> listaP = new ArrayList<Pais>();
        ArrayList<Pais> listaP1 = new ArrayList<Pais>();

        Continente continente = new Continente(listaP);
        Continente continente1 = new Continente(listaP1);
        Pais pais = new Pais(listaE,continente);
        Pais pais1 = new Pais(listaE1,continente);
        Estado estado = new Estado(listaC,pais);
        Estado estado1 = new Estado(listaC1,pais);
        Cidade cidade = new Cidade(30000,100000,estado);
        Cidade cidade1 = new Cidade(30000,100000,estado);
        Cidade cidade2 = new Cidade(30000,100000,estado);

        listaC.add(cidade);
        listaC.add(cidade1);
        listaC1.add(cidade2);
        listaE.add(estado);
        listaE1.add(estado1);
        listaP.add(pais);
        listaP1.add(pais1);


        System.out.println("---Cidades----------");
        System.out.println("População: " + cidade.getPopulacao());
        System.out.println("População1: " + cidade1.getPopulacao());
        System.out.println("Área: " + cidade.getArea());
        System.out.println("Área1: " + cidade1.getArea());

        estado.atualizar();
        estado1.atualizar();

        System.out.println("---Estados----------");
        System.out.println("População: " + estado.getPopulacao());
        System.out.println("População1: " + estado1.getPopulacao());
        System.out.println("Área: " + estado.getArea());
        System.out.println("Área1: " + estado1.getArea());

        pais.atualizar();
        pais1.atualizar();

        System.out.println("---País-------------");
        System.out.println("População: " + pais.getPopulacao());
        System.out.println("População1: " + pais1.getPopulacao());
        System.out.println("Área: " + pais.getArea());
        System.out.println("Área1: " + pais1.getArea());

        continente.atualizar();
        continente1.atualizar();

        System.out.println("---Continentes------");
        System.out.println("População: " + continente.getPopulacao());
        System.out.println("População1: " + continente1.getPopulacao());
        System.out.println("Área: " + continente.getArea());
        System.out.println("Área1: " + continente1.getArea());

        cidade.migrar(cidade1, 20000);

        System.out.println("---Cidades----------");
        System.out.println("População: " + cidade.getPopulacao());
        System.out.println("População1: " + cidade1.getPopulacao());
        System.out.println("Área: " + cidade.getArea());
        System.out.println("Área1: " + cidade1.getArea());

        estado.atualizar();
        estado1.atualizar();

        System.out.println("---Estados----------");
        System.out.println("População: " + estado.getPopulacao());
        System.out.println("População1: " + estado1.getPopulacao());
        System.out.println("Área: " + estado.getArea());
        System.out.println("Área1: " + estado1.getArea());

        pais.atualizar();
        pais1.atualizar();

        System.out.println("---País-------------");
        System.out.println("População: " + pais.getPopulacao());
        System.out.println("População1: " + pais1.getPopulacao());
        System.out.println("Área: " + pais.getArea());
        System.out.println("Área1: " + pais1.getArea());

        continente.atualizar();
        continente1.atualizar();

        System.out.println("---Continentes------");
        System.out.println("População: " + continente.getPopulacao());
        System.out.println("População1: " + continente1.getPopulacao());
        System.out.println("Área: " + continente.getArea());
        System.out.println("Área1: " + continente1.getArea());
    }
}
