package questao01;

public class Pix extends Pagamento {
    private boolean comprovanteTransacaoPix;

    public Pix(String dataHoraPagamento, int numeroPagamento, double valorPago,
               boolean comprovanteTransacaoPix) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    public boolean isComprovanteTransacaoPix() {
        return comprovanteTransacaoPix;
    }

    public void setComprovanteTransacaoPix(boolean comprovanteTransacaoPix) {
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    @Override
    public String imprimirCupomFiscal() {
        return "\n**** Cupom fiscal do pagamento via Pix ****" +
                "\nData/Hora: " + getDataHoraPagamento() +
                "\nNúmero: " + getNumeroPagamento() +
                "\nValor: " + getValorPago() +
                "\nComprovante de Transação Pix: " + comprovanteTransacaoPix;
    }
}
