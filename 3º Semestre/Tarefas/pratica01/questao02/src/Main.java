public class Main {
    public static void main(String[] args) {
        EmpregadoDaFaculdade professor = new EmpregadoDaFaculdade("João", 2000.0, 10);

        double gastos = professor.getGastos();
        String info = professor.getInfo();

        System.out.println("Gastos: " + gastos);
        System.out.println("Info: " + info);
    }
}
