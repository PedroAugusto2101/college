import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(new Produto("Produto01", 152.0, 200, new Categoria("Categoria01", "Descrição01")));
        listaProdutos.add(new Produto("Produto02", 154.0, 250, new Categoria("Categoria02", "Descrição02")));
        listaProdutos.add(new Produto("Produto03", 205.0, 500, new Categoria("Categoria03", "Descrição03")));
        listaProdutos.add(new Produto("Produto04", 259.0, 50, new Categoria("Categoria04", "Descrição04")));
        listaProdutos.add(new Produto("Produto05", 301.0, 100, new Categoria("Categoria05", "Descrição05")));

        ArrayList<Pedido> listaPedidos = new ArrayList<>();

        Pedido pedido1 = new Pedido(1, new Date(), 1);
        Pedido pedido2 = new Pedido(2, new Date(), 1);

        PedidoItem item1Pedido1 = new PedidoItem(2, 10.0, listaProdutos.get(0));
        PedidoItem item2Pedido1 = new PedidoItem(3, 15.0, listaProdutos.get(1));
        PedidoItem item3Pedido1 = new PedidoItem(4, 20.0, new Produto("Produto06", 15.0, 280, new Categoria("Categoria06", "Descrição06")));
        PedidoItem item1Pedido2 = new PedidoItem(1, 25.0, listaProdutos.get(2));
        PedidoItem item2Pedido2 = new PedidoItem(2, 30.0, listaProdutos.get(3));

        pedido1.inserirItensPedido(item1Pedido1);
        pedido1.inserirItensPedido(item2Pedido1);
        pedido1.inserirItensPedido(item3Pedido1);
        pedido2.inserirItensPedido(item1Pedido2);
        pedido2.inserirItensPedido(item2Pedido2);

        System.out.println("Verifica se o PedidoItem existe como Produto:");
        System.out.println("Item1 Pedido01: " + (listaProdutos.contains(item1Pedido1.getProduto()) ? "Existe" : "Não existe"));
        System.out.println("Item2 Pedido02: " + (listaProdutos.contains(item2Pedido2.getProduto()) ? "Existe" : "Não existe"));

        System.out.println("\nAtualiza o estoque após a inserção de itens:");
        for (PedidoItem item : pedido1.getItensPedido()) {
            item.atualizaEstoqueItem();
            System.out.println("Estoque " + item.getProduto().getNomeProduto() + ": " + item.getProduto().getEstoqueAtual());
        }
        for (PedidoItem item : pedido2.getItensPedido()) {
            item.atualizaEstoqueItem();
            System.out.println("Estoque " + item.getProduto().getNomeProduto() + ": " + item.getProduto().getEstoqueAtual());
        }

        pedido1.alterarStatus(2);
        pedido2.alterarStatus(2);

        System.out.println("\nValor total a pagar para cada pedido:");
        System.out.println("Pedido 01: R$" + pedido1.calculaTotalPagar());
        System.out.println("Pedido 02: R$" + pedido2.calculaTotalPagar());
    }
}
