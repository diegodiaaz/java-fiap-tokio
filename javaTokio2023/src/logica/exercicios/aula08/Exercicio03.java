package logica.exercicios.aula08;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {

		String texto = JOptionPane.showInputDialog("Insira um texto: ");
		int upper = 0, lower = 0, num = 0, space = 0;

		for (int i = 0; i <= texto.length() - 1; i++) {

			char ch = texto.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {
				upper++;
			} else if (ch >= 'a' && ch <= 'z') {
				lower++;
			} else if (ch >= '0' && ch <= '9') {
				num++;
			} else {
				space++;
			}

		}

		JOptionPane.showMessageDialog(null, String.format(
				"Seu texto tem %d caracteres maiúsculos; \nSeu texto tem %d caracteres minúsculos; \nSeu texto tem %d caracteres numéricos; \nSeu texto tem %d espaços",
				upper, lower, num, space));

//		JOptionPane.showMessageDialog(null, "Seu texto tem " + upper + " caracteres maiúsculos;"
//				+ "\nSeu texto tem " + lower + " caracteres minúsculos; "
//				+ "\nSeu texto tem " + num + " caracteres numéricos; "
//				+ "\nSeu texto tem " + space + " espaços ");itinho é bem bixa
	}

}
