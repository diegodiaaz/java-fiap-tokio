package logica.exercicios.aula07;

import javax.swing.JOptionPane;

public class Exercicio09 {

	public static void main(String[] args) {

		int i, j = 0;
		int num;

		do {
			num = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número inteiro e positivo: "));

			if (num <= 0) {
				JOptionPane.showMessageDialog(null, "Erro, insira um número positivo", "Error", 2);
			}

		} while (num <= 0);

		JOptionPane.showMessageDialog(null, "Os números divisíveis por " + num + " são: ");

		for (i = 1; i <= num; i++) {

			if (num % i == 0) {

				j = i;

				System.out.println(j);
			}
		}

	}

}
