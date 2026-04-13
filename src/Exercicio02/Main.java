package Exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome, data, descricao;
        long cpf;
        int qtdPedidos, numPedido, qtdItens = 0, qtd;
        double preco;

        System.out.println("----------- DADOS DO CLIENTE ----------");
        System.out.print("Nome do cliente ------> ");
        nome = entrada.next();
        System.out.print("Cpf cliente ------> ");
        cpf = entrada.nextLong();
        System.out.print("Quantidade de pedidos -------> ");
        qtdPedidos = entrada.nextInt();
        System.out.println("");

        Cliente cliente = new Cliente(nome, cpf, qtdPedidos);

        for (int i = 0; i < qtdPedidos; i++) {
            System.out.println("---------- DADOS DO PEDIDO ----------");
            System.out.print("Número do pedido ------> ");
            numPedido = entrada.nextInt();
            System.out.print("Data ------> ");
            data = entrada.next();
            System.out.print("Quantidade de itens ------> ");
            qtdItens = entrada.nextInt();
            System.out.println("");

            Pedido pedido = new Pedido(numPedido, data, qtdItens);

            for (int j = 0; j < qtdItens; j++) {
                System.out.println("---------- DADOS DOS ITENS ------------");
                System.out.print("Descrição ------> ");
                descricao = entrada.next();
                System.out.print("Preco ------> ");
                preco = entrada.nextDouble();
                System.out.print("Quantidade ------> ");
                qtd = entrada.nextInt();
                System.out.println("");

                ItemPedido item = new ItemPedido(descricao, preco, qtd);
                pedido.adicionarItem(item,j);
            }
            cliente.adicionarPedido(pedido);
        }

        System.out.println("************ RELATÓRIO *************");
        System.out.println("Total gasto: " + cliente.calcularTotalGasto());

        Pedido maior = cliente.pedidoMaiorValor();

        if(maior != null){
            System.out.println("Maior pedido numero: " + maior.numPedido);
            System.out.println("Valor do pedido: " + maior.calcularTotal());

            ItemPedido itemMaior = maior.valorMaior();

            if(itemMaior != null){
                System.out.println("Item mais caro:");
                System.out.println("Descricao: " + itemMaior.descricaoProduto);
                System.out.println("Preco: " + itemMaior.precoUni);
            }
        }




    }
}
