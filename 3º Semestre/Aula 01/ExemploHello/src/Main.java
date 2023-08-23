public class Main {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(); // Cria o objeto chamado c1 do tipo ContaCorrente
        c1.cadastrar(123, "Ana", 789); // Dados mocados
        c1.depositar(1000);
        System.out.println("Saldo:" + c1.ConsultarSaldo());
        c1.sacar(2000);

    }
}