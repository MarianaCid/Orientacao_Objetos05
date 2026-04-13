package Exercicio02;

public class Cliente {
    String nome;
    long cpf;
    Pedido[] pedido;
    int index;

    public Cliente(String nome, long cpf, int tamanho) {
        this.nome = nome;
        this.cpf = cpf;
        this.pedido = new Pedido[tamanho];
    }

    public void adicionarPedido(Pedido pedidos){
        if (index < pedido.length){
            pedido[index++] = pedidos;
        }
    }

    public double calcularTotalGasto(){
        double totalGasto = 0;
        for (int i = 0; i < pedido.length; i++) {
            if (pedido[i] != null) {
                totalGasto += pedido[i].calcularTotal();
            }
        }
      return totalGasto;
    }

    public Pedido pedidoMaiorValor(){
        Pedido maior = null;
        for (int i = 0; i < pedido.length; i++) {
            if (pedido[i] != null){
                if (maior==null || pedido[i].calcularTotal() > maior.calcularTotal()){
                    maior = pedido[i];
                }
            }
        }
        return maior;
    }

}
