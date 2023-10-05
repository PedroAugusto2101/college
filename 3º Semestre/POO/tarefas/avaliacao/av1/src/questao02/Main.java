package questao02;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Professora Mihanne", "prof.mihanne@gmail.com", "63mhp", 100.0f, 80);

        System.out.println(professor.mostraProfessor());

        Aluno aluno = new Aluno("Pedro", "pedrotiagobh@gmail.com", "pedrao123", 3, 509);

        System.out.println(aluno.mostraAluno());
    }
}
