package logica.exercicios.aula06;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		
		String[] operadores = {"+", "-", "*", "/"};
		
		double num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número que será usado na conta:"));
		int operador = JOptionPane.showOptionDialog(new JDesktopPane(), "Escolha o operador desejado: ", "OPERADOR", 0, JOptionPane.QUESTION_MESSAGE, null, operadores, operadores[0]);
		double num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número que será usado na conta:"));
		
		
		switch (operador) {
		case 0:
			JOptionPane.showMessageDialog(null, "O resultado foi: " + (int)(num1 + num2));
			break;
		
		case 1:
			JOptionPane.showMessageDialog(null, "O resultado foi: " + (int)(num1 - num2));
			break;
			
		case 2:
			JOptionPane.showMessageDialog(null, "O resultado foi: " + (int)(num1 * num2));
			break;
			
		case 3:
			JOptionPane.showMessageDialog(null, String.format("O resultado foi: %.2f", (num1 / num2)));
			break;
		}

	}

}
