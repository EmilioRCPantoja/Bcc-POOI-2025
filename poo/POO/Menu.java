package teste;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import teste.Computador;

public abstract class Menu {

    public void menuPrincipal() {

    }

    public void cadastrar() {
        System.out.println("--------------------Cadastro de Patrimônio------------------------");
        System.out.println(
                "O que vc quer cadastrar\n" +
                        "1-Computador\n" +
                        "2-Mesa\n" +
                        "3-Cadeira\n" +
                        "4-Monitor(indisponível)"
        );

        Scanner sc = new Scanner(System.in);

        Patrimonio patrimonio = cadastrarPatrimonio();

        switch (sc.nextInt()) {
            case 1: {
                Eletronico eletronico = cadastrarEletronico(patrimonio);
                Computador computador = cadastrarComputador(eletronico);
                break;
            }
            case 2: {

                break;
            }
        }
    }

    public void atualizar() {

        ler();

        System.out.println("--------------------------------------------");

        System.out.println("Atualizando");
        System.out.println("O que você quer atualizar? ");


    }

    public void ler() {

        System.out.println(
                "O que vc quer ler" +
                        "\n1-Mesas" +
                        "\n2-Computadores\n" +
                        "3-Cadeiras\n" +
                        "4-Monitores(indisponível)\n" +
                        "5-Tudo"
        );

        Scanner sc = new Scanner((System.in));
        switch (sc.nextInt()) {

            case 1:
                System.out.println("Leu as mesas do banco de dados");

        }

    }

    public void deletar() {

    }

    private Computador cadastrarComputador(Eletronico eletronico) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira os dados do computador: ");

        System.out.print("Nome do computador");
        String nome = sc.nextLine();
        sc.next();

        System.out.print("Placa Mãe:");
        String placaMae = sc.nextLine();
        sc.next();

        System.out.print("Processador:");
        String processador = sc.nextLine();
        sc.next();

        System.out.print("Mémoria RAM: ");
        String ram = sc.nextLine();
        sc.next();

        System.out.print("Armazenamento(HD ou SSD)");
        String armazenamento = sc.nextLine();
        sc.next();

        System.out.print("Fonte: ");
        String fonte = sc.nextLine();
        sc.next();


        return new Computador(
                nome,
                eletronico.getCor(),
                eletronico.getLaboratorio(),
                eletronico.getDataCadastro(),
                eletronico.getMarca(),
                eletronico.getModelo(),
                placaMae,
                processador,
                ram,
                armazenamento,
                fonte
        );
    }

    private Patrimonio cadastrarPatrimonio() {
        Scanner sc = new Scanner(System.in);


        System.out.print("Cor: ");
        String corPatrimonio = sc.nextLine();
        sc.next();

        System.out.print("Laboratório do patrimônio: ");
        String labPatrimonio = sc.nextLine();
        sc.next();

        Date dataCadastroPatrimonio = Date.from(Instant.now());

        return new Patrimonio(corPatrimonio, labPatrimonio, dataCadastroPatrimonio);
    }

    private Eletronico cadastrarEletronico(Patrimonio patrimonio) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Marca: ");
        String marca = sc.nextLine();
        sc.next();

        System.out.print("Modelo: ");
        String modelo = sc.nextLine();
        sc.next();

        return new Eletronico(
                patrimonio.getCor(),
                patrimonio.getLaboratorio(),
                patrimonio.getDataCadastro(),
                marca, modelo);
    }

    private Movel cadastrarMovel(Patrimonio patrimonio) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Quantidade de pés do móvel: ");
        int qtdPes = sc.nextInt();
        sc.next();

        System.out.print("Escreva as dimensoes: ");
        Dimensoes dimensoes = cadastrarDimensoes();
        sc.next();

        return new Movel(
                patrimonio.getCor(),
                patrimonio.getLaboratorio(),
                patrimonio.getDataCadastro(),
                qtdPes,
                dimensoes
        );
    }

    private Dimensoes cadastrarDimensoes() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva a altura: ");
        Double altura = sc.nextDouble();
        sc.next();

        System.out.print("Escreva a largura: ");
        Double largura = sc.nextDouble();
        sc.next();

        System.out.print("Escreva o comprimento: ");
        Double comprimento = sc.nextDouble();
        sc.next();

        return new Dimensoes(largura, altura, comprimento);
    }

    private Mesa cadastrarMesa(Movel movel) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Escolha o formato\n" +
                "1 - EM L\n" +
                "2 - RETANGULAR");
        int opcao = sc.nextInt();

        return new Mesa(
                movel.getCor(),
                movel.getLaboratorio(),
                movel.getDataCadastro(),
                movel.getQtd_Pes(),
                movel.getDimensoes(),
                opcao == 1 ? FormatoMesa.EM_L : FormatoMesa.RETANGULAR
            );
    }
}
