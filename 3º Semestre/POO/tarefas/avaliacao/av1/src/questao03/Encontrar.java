package questao03;

import javax.swing.JOptionPane;

public class Encontrar {
    public static void main(String[] args) {
        AchadoPerdido itemAchado = new AchadoPerdido("Carteira", "Carteira de couro", "Objeto pessoal", "Achado");

        itemAchado.completaDados("foto_carteira.jpg", "Sala 509", "2023-10-05 14:30");

        String tituloPesquisado = JOptionPane.showInputDialog("Digite o título a ser pesquisado:");

        String resultadoBusca = itemAchado.buscarTitulo(tituloPesquisado);

        if (!resultadoBusca.equals("Não encontrado")) {
            JOptionPane.showMessageDialog(null, resultadoBusca);
            itemAchado.visualizarDetalhes();
        } else {
            JOptionPane.showMessageDialog(null, "Item não encontrado");
        }
    }
}
