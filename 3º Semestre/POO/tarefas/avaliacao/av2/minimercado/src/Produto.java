public class Produto {
    private String nomeProduto;
    private double precoProduto;
    private int estoqueAtual;
    private Categoria categoria;

    public Produto(String nomeProduto, double precoProduto, int estoqueAtual, Categoria categoria) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.estoqueAtual = estoqueAtual;
        this.categoria = categoria;
    }


    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public int getEstoqueAtual() {
        return estoqueAtual;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public void setEstoqueAtual(int estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public static Produto inserirProduto(String nomeProduto, double precoProduto, int estoqueAtual, Categoria categoria) {
        return new Produto(nomeProduto, precoProduto, estoqueAtual, categoria);
    }

    public boolean buscarProduto(Produto produto) {
        return this.nomeProduto.equals(produto.getNomeProduto());
    }
}
