public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    // Construtor sem parâmetros
    public Estoque() {
    }

    // Construtor com parâmetros
    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    // Métodos setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    // Método para dar baixa no estoque
    public void darBaixa(int qtde) {
        if (qtde >= 0 && qtdAtual - qtde >= 0) {
            qtdAtual -= qtde;
        } else {
            System.out.println("Erro: Quantidade inválida para dar baixa.");
        }
    }

    // Método para mostrar informações do estoque
    public String mostra() {
        return "Nome do Produto: " + nome + "\nQuantidade Mínima: " + qtdMinima + "\nQuantidade Atual: " + qtdAtual;
    }

    // Método para verificar se é necessário repor o estoque
    public boolean precisaRepor() {
        return qtdAtual <= qtdMinima;
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Estoque
        Estoque produto = new Estoque("Produto A", 100, 20);

        System.out.println("Informações Iniciais:");
        System.out.println(produto.mostra());

        produto.darBaixa(30);

        System.out.println("\nApós dar baixa de 30 unidades:");
        System.out.println(produto.mostra());

        if (produto.precisaRepor()) {
            System.out.println("\nÉ necessário repor o estoque.");
        } else {
            System.out.println("\nNão é necessário repor o estoque.");
        }
    }
}
