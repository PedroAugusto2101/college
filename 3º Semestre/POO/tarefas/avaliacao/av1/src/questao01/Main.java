package questao01;

public class Main {
    public static void main(String[] args) {
        CartaoCredito cartaoCredito = new CartaoCredito("2023-10-05 14:30", 1, 50.0,
                "1234-5678-9012-3456", "Visa", "Pedro");

        Pix pix = new Pix("2023-10-05 14:45", 2, 75.0, true);

        CartaoDebito cartaoDebito = new CartaoDebito("2023-10-05 15:00", 3, 30.0,
                "9876-5432-1098-7654", "Augusto");

        System.out.println(cartaoCredito.imprimirCupomFiscal());
        System.out.println(pix.imprimirCupomFiscal());
        System.out.println(cartaoDebito.imprimirCupomFiscal());
    }
}
