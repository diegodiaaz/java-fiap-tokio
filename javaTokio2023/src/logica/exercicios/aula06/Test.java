package logica.exercicios.aula06;

import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog(null, "Insira seu nome:", "NOME:", 2);
		JOptionPane.showMessageDialog(null, "Olá " + nome);

		int resposta = JOptionPane.showConfirmDialog(null, "É verdade q vc é bixa? ", "TESTE GAY", 0, 2);

		// .showConfirmDialog retorna um "int";

		// 0 - Usuário clicou em "YES"
		// 1 - Usuário clicou em "NO"
		// 2 - Usuário clicou em "CANCEL"

		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Você clicou em YES!", "PARABÉNS", 2);
		} else if (resposta == 1) {
			JOptionPane.showMessageDialog(null, "Você clicou em NO!");
		} else {
			JOptionPane.showMessageDialog(null, "Você clicou em CANCEL!");
		}

	}

}
