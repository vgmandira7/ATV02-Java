/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.atv2;
import javax.swing.JOptionPane;
/**
 *
 * @author Jessi
 */
public class Exibir {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o nome completo do aluno:");

        Aluno aluno = new Aluno(nome);

        // Cadastro das três notas
        for (int i = 0; i < 3; i++) {
            double nota = Double.parseDouble(
                JOptionPane.showInputDialog("Digite a nota TP" + (i + 1) + ":")
            );
            aluno.setNota(i, nota);
        }

        double media = aluno.calcularMedia();
        String desempenho = aluno.avaliarDesempenho();

        String mensagem = "Aluno: " + aluno.getNome()
                + "\nMédia Geral: " + String.format("%.2f", media)
                + "\nStatus: " + desempenho;

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
