package com.mycompany.gerenciadordepatrimonio;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    Scanner scan = new Scanner(System.in);

    ArrayList<Patrimonio> patrimonios = new ArrayList<Patrimonio>();
    ArrayList<Eletronico> eletronicos = new ArrayList<Eletronico>();
    ArrayList<Movel> moveis = new ArrayList<Movel>();
    ArrayList<Computador> computadores = new ArrayList<Computador>();
    ArrayList<Mesa> mesas = new ArrayList<Mesa>();
    ArrayList<Cadeira> cadeiras = new ArrayList<Cadeira>();

    public void cadastrar(){
        System.out.println("---------------Cadastro de Patrimônio novo---------------\n");
        System.out.println("O que você deseja casdatrar?\n" +
                "1-Computador\n" +
                "2-cadeira\n" +
                "3-mesa\n" +
                "4-sair\n");
        int opcao =scan.nextInt();
        scan.next();
        if(opcao >= 1 && opcao <= 3){
            Patrimonio patrimonio = cadastrarPatrimonio();

            switch (opcao){
                case 1:{
                    Eletronico eletronico = cadastrarEletronico(patrimonio);
                    Computador computador = cadastrarComputador(eletronico);

                    patrimonios.add(computador);
                    computadores.add(computador);
                    break;

                }
                case 2:{
                    Movel movel = cadastrarMovel(patrimonio);
                    Cadeira cadeira = cadastrarCadeira(movel);

                    patrimonios.add(cadeira);
                    cadeiras.add(cadeira);

                    break;
                }
                case 3: {
                    Movel movel = cadastrarMovel(patrimonio);
                    Mesa mesa = cadastrarMesa(movel);

                    patrimonios.add(mesa);
                    mesas.add(mesa);

                    break;
                }
                default: break;
            }
        }


    }

    private Patrimonio cadastrarPatrimonio (){
        Date data = Date.from(Instant.now());

        System.out.println("Digite a cor do patrimônio:\n");
        String cor = scan.nextLine();
        scan.next();

        System.out.println("Digite o laboratório que o patrimônio ficará:");
        String lab = scan.nextLine();
        scan.next();

        return new Patrimonio(data, cor, lab);

    }

    private Dimensoes cadastrarDimensoes(){
        System.out.println("Digite a altura:\n");
        double altura = scan.nextDouble();
        scan.next();

        System.out.println("Digite a largura:\n");
        double  largura  = scan.nextDouble();
        scan.next();

        System.out.println("Digite o comprimento:\n");
        double comprimento = scan.nextDouble();
        scan.next();

        return new Dimensoes(altura, largura, comprimento);
    }

    private Movel cadastrarMovel(Patrimonio patrimonio){
        System.out.println("Digite a quantidade de pés:");
        int qntDePes = scan.nextInt();
        scan.next();

        System.out.println("Digite as dimensões:\n");
        Dimensoes dimensoes = cadastrarDimensoes();
        scan.next();

        return new Movel(patrimonio.getDataCadastro(), patrimonio.getCor(), patrimonio.getLaboratorio(),qntDePes, dimensoes);

    }

    private Eletronico cadastrarEletronico(Patrimonio patrimonio){
        System.out.println("Digite a marca do eletrônico:\n");
        String marca = scan.nextLine();
        scan.next();

        System.out.println("Digite o modelo do eletrônico:\n");
        String modelo = scan.nextLine();
        scan.next();

        return new Eletronico(marca, modelo, patrimonio.getDataCadastro(), patrimonio.getCor(), patrimonio.getLaboratorio());

    }

    private Mesa cadastrarMesa(Movel movel){
        FormatoDaMesa formato = null;

        System.out.println("Escolha um formato:\n" +
                "1-Em formato de L\n" +
                "2-Formato retangular\n");

        int opcao = scan.nextInt();
        scan.next();

        switch (opcao){
            case 1:
                formato = FormatoDaMesa.EM_L; break;
            case 2:
                formato = FormatoDaMesa.RETANGULAR;break;
            default: break;
        }

        return new Mesa(movel.getDataCadastro(), movel.getCor(), movel.getLaboratorio(), movel.getQntDePes(), movel.getDimensoes(), formato);
    }

    private Cadeira cadastrarCadeira(Movel movel){
        TipoDeCadeira tipo = null;

        System.out.println("Escolha um tipo:\n" +
                "1-Giratória\n" +
                "2-Fixa\n");
        int opcao = scan.nextInt();
        scan.next();

        switch (opcao){
            case 1:
                tipo = TipoDeCadeira.FIXA; break;
            case 2:
                tipo = TipoDeCadeira.GIRATORIA; break;
            default: break;
        }

        return new Cadeira(movel.getDataCadastro(), movel.getCor(), movel.getLaboratorio(), movel.getQntDePes(), movel.getDimensoes(), tipo);

    }

    private Computador cadastrarComputador(Eletronico eletronico){
        System.out.println("Digite o nome do computador: \n");
        String nome  = scan.nextLine();
        scan.next();

        System.out.println("Digite o processador do computador: \n");
        String processador  = scan.nextLine();
        scan.next();

        System.out.println("Digite a placa de vídeo do computador: \n");
        String placaDeVideo  = scan.nextLine();
        scan.next();

        System.out.println("Digite a ram do computador: \n");
        String ram  = scan.nextLine();
        scan.next();

        System.out.println("Digite a capacidade de armazenamento do computador: \n");
        String armazenamento  = scan.nextLine();
        scan.next();

        System.out.println("Digite a placa mãe do computador: \n");
        String placaMae  = scan.nextLine();
        scan.next();

        System.out.println("Digite a fonte do computador: \n");
        String fonte  = scan.nextLine();
        scan.next();

        return new Computador(eletronico.getDataCadastro(), eletronico.getCor(), eletronico.getLaboratorio(), eletronico.getMarca(), eletronico.getModelo(), nome, processador, placaDeVideo, ram, armazenamento, placaMae, fonte);


    }
}
