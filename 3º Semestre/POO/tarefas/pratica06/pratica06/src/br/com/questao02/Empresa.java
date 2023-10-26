package br.com.questao02;

public class Empresa {
    private String nome;
    private String cnpj;
    private int qtdeDeFuncionario;
    private Funcionario[] funcionarios;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.qtdeDeFuncionario = 0;
        this.funcionarios = new Funcionario[100]; // Pode armazenar até 100 funcionários
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        if (qtdeDeFuncionario < 100) {
            funcionarios[qtdeDeFuncionario] = funcionario;
            qtdeDeFuncionario++;
        } else {
            System.out.println("A capacidade máxima de funcionários foi atingida.");
        }
    }
}
