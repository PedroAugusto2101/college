class EmpregadoDaFaculdade {
    private String nome;
    private double salario;
    private int horasAula;

    public EmpregadoDaFaculdade(String nome, double salario, int horasAula) {
        this.nome = nome;
        this.salario = salario;
        this.horasAula = horasAula;
    }

    double getGastos() {
        double bonus = horasAula * 40; // Bônus de R$ 40 por hora/aula
        return this.salario + bonus;
    }

    String getInfo() {
        double totalReceber = this.salario + (horasAula * 40); // Salário + bônus
        return "Nome: " + this.nome + ", com salário: " + totalReceber;
    }
}

