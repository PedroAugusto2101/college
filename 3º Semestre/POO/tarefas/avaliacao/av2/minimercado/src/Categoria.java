public class Categoria {
    private String nomeCategoria;
    private String descricaoCategoria;

    // Construtor com o mesmo nome da classe
    public Categoria(String nomeCategoria, String descricaoCategoria) {
        this.nomeCategoria = nomeCategoria;
        this.descricaoCategoria = descricaoCategoria;
    }


    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public String getDescricaoCategoria() {
        return descricaoCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public void setDescricaoCategoria(String descricaoCategoria) {
        this.descricaoCategoria = descricaoCategoria;
    }
}
