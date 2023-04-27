package logica.exercicios.aula07;

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {

		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor desejado: ")); 
		
		if (num < 2) {
			JOptionPane.showMessageDialog(null, "ERRO, INSIRA MAIOR OU IGUAL A 2", "ERROR", 2);
		}

		for (int i = 2; i <= num; i += 2) {
			System.out.println(i);
		}
				
	}

}
