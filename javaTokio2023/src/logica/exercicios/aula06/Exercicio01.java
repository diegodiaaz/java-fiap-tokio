package logica.exercicios.aula06;
import javax.swing.*;

class Exercicio01 {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
		int div = num % 2;
		
		if (div == 1) {
			JOptionPane.showMessageDialog(null, "O número: " + num + " é ímpar");
		} else {
			JOptionPane.showMessageDialog(null, "O número: " + num + ", é par");
		}

	}

}
