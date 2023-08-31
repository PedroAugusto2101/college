import java.util.Date;

public class Transacao {
    private Carro carro;
    private Cliente cliente;
    private Date data;
    private double valor;

    // Construtor
    public Transacao(Carro carro, Cliente cliente, Date data, double valor) {
        this.carro = carro;
        this.cliente = cliente;
        this.data = data;
        this.valor = valor;
    }

    // Getters e setters
    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
