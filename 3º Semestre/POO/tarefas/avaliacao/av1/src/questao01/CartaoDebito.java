package questao01;

public class CartaoDebito extends Pagamento {
    private String numCartao;
    private String titularCartao;

    public CartaoDebito(String dataHoraPagamento, int numeroPagamento, double valorPago,
                        String numCartao, String titularCartao) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numCartao = numCartao;
        this.titularCartao = titularCartao;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }

    @Override
    public String imprimirCupomFiscal() {
        return "\n**** Cupom fiscal do pagamento com cartão de débito ****" +
                "\nData/Hora: " + getDataHoraPagamento() +
                "\nNúmero: " + getNumeroPagamento() +
                "\nValor: " + getValorPago() +
                "\nNúmero do Cartão: " + numCartao +
                "\nTitular do Cartão: " + titularCartao;
    }
}
