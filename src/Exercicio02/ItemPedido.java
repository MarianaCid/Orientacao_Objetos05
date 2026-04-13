package Exercicio02;

public class ItemPedido {
   String descricaoProduto;
    double precoUni;
    int qtdComprada;

    public ItemPedido(String descricaoProduto, double precoUni, int qtdComprada) {
        this.descricaoProduto = descricaoProduto;
        this.precoUni = precoUni;
        this.qtdComprada = qtdComprada;
    }

    public double calcularSubtotal(){
        return  precoUni * qtdComprada;
    }

}
