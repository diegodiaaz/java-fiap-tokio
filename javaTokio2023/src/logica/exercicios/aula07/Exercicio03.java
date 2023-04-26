package logica.exercicios.aula07;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {

		double num = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o número desejado: "));
		int i = 0;
		
		for (i = 0; i <= 25; i++) {
			JOptionPane.showMessageDialog(null, String.format("%.0f X ", num) + i + " = " + String.format("%.0f", (num * i)));
		}
		

	}

}
