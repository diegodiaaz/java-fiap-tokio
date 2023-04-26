package logica.exercicios.aula07;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		
		
		double num, maior = 0;
		
		for (int i = 1; i <= 12; i++) {
			
			num = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor " + i + ":"));
			
			if (num > maior) {
				
				maior = num;
				
			}
			
		}
		
		JOptionPane.showMessageDialog(null, String.format("O maior número digitado foi: %.0f", maior));

	}

}
