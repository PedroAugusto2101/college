import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020, 25000.0);
        Cliente cliente1 = new Cliente("João", "123456789", "Rua A", "123-456-7890");
        Transacao transacao1 = new Transacao(carro1, cliente1, new Date(), 30000.0);

        System.out.println("Carro: " + carro1.getMarca() + " " + carro1.getModelo());
        System.out.println("Cliente: " + cliente1.getNome());
        System.out.println("Transação Valor: " + transacao1.getValor());
    }
}
