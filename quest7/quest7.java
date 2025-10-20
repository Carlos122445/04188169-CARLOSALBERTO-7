import java.util.ArrayList;

class ItemPedido {
    String nomeProduto;
    int quantidade;
    double precoUnitario;

    double subtotal() {
        return quantidade * precoUnitario;
    }
}

class Pedido {
    ArrayList<ItemPedido> itens = new ArrayList<>();

    void adicionarItem(String nome, int qtd, double preco) {
        ItemPedido item = new ItemPedido();
        item.nomeProduto = nome;
        item.quantidade = qtd;
        item.precoUnitario = preco;
        itens.add(item);
    }

    double valorTotal() {
        double total = 0;
        for (ItemPedido item : itens)
            total += item.subtotal();
        return total;
    }
}

public class quest7 {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.adicionarItem("Teclado", 2, 150);
        pedido.adicionarItem("Mouse", 1, 80);

        System.out.println("Valor total: " + pedido.valorTotal());
    }
}
