package Exercicio03;

import java.util.Scanner;

public class Main {

    static BilheteUnico[] bilhete = new BilheteUnico[10];
    static Scanner sc = new Scanner(System.in);
    static int index =0;

    public static void main(String[] args) {

        int opcao;

        do {
            System.out.println("1. Cadastrar Bilhete");
            System.out.println("2. Carregar Bilhete");
            System.out.println("3. Passar na Catraca");
            System.out.println("4. Finalizar");
            opcao = sc.nextInt();

            switch (opcao){
                case 1 -> cadastrarBilhete();
                case 2 -> carregarBilhete();
                case 3 -> passarNaCatraca();
                case 4 -> System.out.println("Obrigado por usar nosso App");
                default -> System.out.println("Opção inválida. Tente escolher outra");
            }
            System.out.println("\n ------------------------------------------------------------- \n");

        }while(opcao != 4);
    }

    private static void cadastrarBilhete() {
        String nome;
        long cpf;
        String tipoTarifa;

        if (index < bilhete.length){
            System.out.print("Nome do usuário ----->");
            nome = sc.next();
            System.out.print("CPF do usuário ----->");
            cpf = sc.nextLong();
            System.out.print("Tipo de tarifa (estudante | professor | comum) ----->");
            tipoTarifa = sc.next();

            //Usuario usuario = new Usuario(nome, cpf, tipoTarifa);
            //bilhete[index] = new BilheteUnico(usuario);
            bilhete[index] = new BilheteUnico(new Usuario(nome, cpf, tipoTarifa));
            index++;
        }
        else{
            System.out.println("Erro ao gerar o bilhete! Procure um posto de atendimento");
        }
    }

    public static void carregarBilhete() {
        double valor;
        BilheteUnico bilheteEncontrado = pesquisar();
        if(bilheteEncontrado != null){
            System.out.print("Qual o valor da recarga? ");
            valor = sc.nextDouble();
            bilheteEncontrado.carregar(valor);
        }
    }

    private static void passarNaCatraca() {
        BilheteUnico bilheteUnico = pesquisar();
        if (bilheteUnico != null){
            if (!bilheteUnico.passarNaCatraca()){
                System.out.println("Saldo Insuficiente!");
            }
            System.out.println("Saldo atual R$ " + bilheteUnico.saldo);
        }

    }

    public static BilheteUnico pesquisar(){
        long cpf;
        System.out.print("Qual o cpf para pesquisa? ");
        cpf = sc.nextLong();

        for (int i = 0; i < index; i++) {
            if(bilhete[i].usuario.cpf == cpf){
                return bilhete[i];
            }
        }
        System.out.println("*** CPF não encontrado! ***");
        return null;
    }
}
