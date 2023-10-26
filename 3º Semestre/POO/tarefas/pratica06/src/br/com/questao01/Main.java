package br.com.questao01;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Solicitar os dados para criar uma Rede Social
        String dataCriacao = JOptionPane.showInputDialog("Informe a data de criação da Rede Social:");
        String nomeUsuario = JOptionPane.showInputDialog("Informe o nome de usuário:");
        String dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento:");
        String senha = JOptionPane.showInputDialog("Informe a senha:");

        // Criar a rede social
        RedeSocial minhaRedeSocial = new RedeSocial(dataCriacao, nomeUsuario, dataNascimento, senha);

        // Criar objetos do tipo Publicacao e inserir na rede social
        String data1 = JOptionPane.showInputDialog("Informe a data da primeira publicação:");
        String texto1 = JOptionPane.showInputDialog("Informe o texto da primeira publicação:");
        String linkMidia1 = JOptionPane.showInputDialog("Informe o link de mídia da primeira publicação:");

        Publicacao publicacao1 = new Publicacao(data1, texto1, linkMidia1);
        minhaRedeSocial.inserePublicacao(publicacao1);

        String data2 = JOptionPane.showInputDialog("Informe a data da segunda publicação:");
        String texto2 = JOptionPane.showInputDialog("Informe o texto da segunda publicação:");
        String linkMidia2 = JOptionPane.showInputDialog("Informe o link de mídia da segunda publicação:");

        Publicacao publicacao2 = new Publicacao(data2, texto2, linkMidia2);
        minhaRedeSocial.inserePublicacao(publicacao2);

        // Chamar o método imprimePublicacoes
        minhaRedeSocial.imprimePublicacoes();
    }
}
