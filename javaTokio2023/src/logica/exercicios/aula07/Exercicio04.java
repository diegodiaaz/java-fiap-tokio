package logica.exercicios.aula07;

import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		
		double num;
		double soma = 0;
		
		for (int i = 1; i <= 10; i++) {
			
			num = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor " + i + ":"));
			
			soma += num;
		}
		
		JOptionPane.showMessageDialog(null, String.format("A soma dos valores deu: %.0f", soma));
	}

}
