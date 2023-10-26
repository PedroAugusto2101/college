package br.com.questao02;

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[5];

        funcionarios[0] = new Funcionario("João", "joao@email.com", "123-4567", "TI", 5000.0, "01/01/2020", "12345");
        funcionarios[1] = new Funcionario("Maria", "maria@email.com", "987-6543", "Vendas", 4000.0, "01/02/2021", "67890");
        funcionarios[2] = new Funcionario("Carlos", "carlos@email.com", "111-1111", "Financeiro", 5500.0, "01/03/2019", "54321");
        funcionarios[3] = new Funcionario("Ana", "ana@email.com", "222-2222", "RH", 4800.0, "01/04/2020", "98765");
        funcionarios[4] = new Funcionario("Pedro", "pedro@email.com", "333-3333", "Marketing", 6000.0, "01/05/2021", "13579");

        for (Funcionario funcionario : funcionarios) {
            funcionario.mostrarDados();
        }

        Empresa minhaEmpresa = new Empresa("Minha Empresa", "1234567890");

        for (Funcionario funcionario : funcionarios) {
            minhaEmpresa.adicionarFuncionario(funcionario);
        }
    }
}
