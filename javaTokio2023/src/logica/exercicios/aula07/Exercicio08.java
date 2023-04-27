package logica.exercicios.aula07;

import javax.swing.JOptionPane;

public class Exercicio08 {

	public static void main(String[] args) {

		int i;
		int total = 0;
		double num;

		do {
			num = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número positivo"));

			if (num <= 0) {
				JOptionPane.showMessageDialog(null, "Erro, insira um valor positivo", "Error", 2);
			}
		} while (num <= 0);

		for (i = 0; i <= num; i++) {

			total += i;
		}
		JOptionPane.showMessageDialog(null, String.format("O valor da soma de 1 até %.0f é: %d", num, total));
	}
}
