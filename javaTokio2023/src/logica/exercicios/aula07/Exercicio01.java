package logica.exercicios.aula07;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		
		String[] opcoes = {"Sim", "Não"};
		int opcao = JOptionPane.showOptionDialog(null, "Gostaria de iniciar o loop?", "INICIAR LOOP", 0, 3, null, opcoes, opcoes[0]);
		
		
		for (int i = 1; opcao == 0; i++) {
			
			JOptionPane.showMessageDialog(null, "Olá, mundo");
			int opcao2 = JOptionPane.showOptionDialog(null, "Gostaria de repetir o loop?", "REPETIR LOOP", 0, 3, null, opcoes, opcoes[0]);
			
			
			
			if (opcao2 == 0) {
				continue;
			} else {	
				JOptionPane.showMessageDialog(null, "Você repetiu " + i + " vezes" + "\nFim!");
				break;
			}
			
		}
		
	}

}
