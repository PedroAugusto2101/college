package br.com.questao02;

public class Funcionario extends Pessoa {
    private String departamento;
    private double salario;
    private String dataEntrada;
    private String RG;
    private boolean estaNaEmpresa;

    public Funcionario(String nome, String email, String telefone, String departamento, double salario, String dataEntrada, String RG) {
        super(nome, email, telefone);
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.RG = RG;
        this.estaNaEmpresa = true;
    }

    public void bonificar(double valor) {
        salario += valor;
    }

    public void demitir() {
        estaNaEmpresa = false;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salário: " + salario);
        System.out.println("Data de Entrada: " + dataEntrada);
        System.out.println("RG: " + RG);
        System.out.println("Está na Empresa: " + (estaNaEmpresa ? "Sim" : "Não"));
        System.out.println("----------------------------");
    }
}
