package logica.exercicios.aula07;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {

		String[] opcoes = { "Sim", "Não" };
		int opcao = JOptionPane.showOptionDialog(null, "Gostaria de iniciar a contagem?", "INICIAR CONTAGEM", 0, 3,
				null, opcoes, opcoes[0]);

		if (opcao == 0) {

			for (int i = 0; i <= 100; i += 10) {

				JOptionPane.showMessageDialog(null, i);
			}
		} else {
			
			JOptionPane.showMessageDialog(null, "ERRO", "ERROR", 2);
			
		}

	}

}
