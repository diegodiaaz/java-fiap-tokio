package logica.exercicios.aula06;

import javax.swing.JOptionPane;

public class Exercicio12 {

	public static void main(String[] args) {

		double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'A'"));
		double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'B'"));
		double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'C'"));
		double aux;

		if (a < b) {
			aux = a;
			a = b;
			b = aux;
		}

		if (b < c) {
			aux = b;
			b = c;
			c = aux;
		}

		if (a < b) {
			aux = a;
			a = b;
			b = aux;
		}

		if (a >= b + c) {
			JOptionPane.showMessageDialog(null, "NÃO FORMA TRIÂNGULO");
		} else {

			if ((a * a) == (b * b) + (c * c)) {
				JOptionPane.showMessageDialog(null, "TRIÂNGULO RETÂNGULO");
			} else if ((a * a) > (b * b) + (c * c)) {
				JOptionPane.showMessageDialog(null, "TRIÂNGULO OBTUSÂNGULO");
			} else {
				JOptionPane.showMessageDialog(null, "TRIÂNGULO ACUTÂNGULO");
			}

			if (a == b && b == c) {
				JOptionPane.showMessageDialog(null, "TRIÂNGULO EQUILÁTERO");
			} else if (a == b || b == c) {
				JOptionPane.showMessageDialog(null, "TRIÂNGULO ISÓCELES");
			}
		}

	}
}