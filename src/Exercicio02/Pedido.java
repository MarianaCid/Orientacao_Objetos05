package Exercicio02;

public class Pedido {
    int numPedido;
    String data;
    ItemPedido[] itensPedido;
    int index;

    public Pedido(int numPedido, String data, int tamanho) {
        this.numPedido = numPedido;
        this.data = data;
        this.itensPedido = new ItemPedido[tamanho];
    }

    public void adicionarItem(ItemPedido item, int j){
        itensPedido[index++] = item;
    }

    public double  calcularTotal(){
        double total = 0;
        for (int i=0; i<itensPedido.length; i++){
            if (itensPedido[i] != null){
                total += itensPedido[i].calcularSubtotal();
            }
        }
        return total;
    }

    public int calcularQtdItem(){
        int totalItens = 0;
        for (int i = 0; i < itensPedido.length; i++) {
            if (itensPedido[i] != null){
                totalItens += itensPedido[i].qtdComprada;
            }
        }
        return totalItens;
    }

    public ItemPedido valorMaior(){
        ItemPedido maior = null;
        for (int i = 0; i < itensPedido.length; i++) {
            if (itensPedido[i] != null){
                if (maior == null || itensPedido[i].precoUni > maior.precoUni){
                    maior = itensPedido[i];
                }
            }
        }
        return maior;
    }




}
