import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int numeroPedido;
    private Date dataHoraPedido;
    private int statusPedido;
    private ArrayList<PedidoItem> itensPedido;

    public Pedido(int numeroPedido, Date dataHoraPedido, int statusPedido) {
        this.numeroPedido = numeroPedido;
        this.dataHoraPedido = dataHoraPedido;
        this.statusPedido = statusPedido;
        this.itensPedido = new ArrayList<>();
    }


    public int getNumeroPedido() {
        return numeroPedido;
    }

    public Date getDataHoraPedido() {
        return dataHoraPedido;
    }

    public int getStatusPedido() {
        return statusPedido;
    }

    public ArrayList<PedidoItem> getItensPedido() {
        return itensPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public void setDataHoraPedido(Date dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public void setStatusPedido(int statusPedido) {
        this.statusPedido = statusPedido;
    }

    public void setItensPedido(ArrayList<PedidoItem> itensPedido) {
        this.itensPedido = itensPedido;
    }

    public void alterarStatus(int statusPedido) {
        this.statusPedido = statusPedido;
    }

    public boolean consultarPedido(Pedido pedido) {
        return this.numeroPedido == pedido.getNumeroPedido();
    }

    public void inserirItensPedido(PedidoItem pedidoItem) {
        if (itensPedido == null) {
            itensPedido = new ArrayList<>();
        }
        this.itensPedido.add(pedidoItem);
    }

    public void excluirItensPedido(PedidoItem pedidoItem) {
        this.itensPedido.remove(pedidoItem);
    }

    public double calculaTotalPagar() {
        double total = 0.0;
        for (PedidoItem item : itensPedido) {
            total += item.getQuantidade() * item.getValorUnitario();
        }
        return total;
    }
}
