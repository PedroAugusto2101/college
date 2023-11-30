public class PedidoItem {
    private int quantidade;
    private double valorUnitario;
    private Produto produto;

    public PedidoItem(int quantidade, double valorUnitario, Produto produto) {
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.produto = produto;
    }


    public int getQuantidade() {
        return quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void atualizaEstoqueItem() {
        if (produto != null) {
            int estoqueAtual = produto.getEstoqueAtual();
            estoqueAtual -= quantidade;
            produto.setEstoqueAtual(estoqueAtual);
        }
    }
}
