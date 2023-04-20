package logica.exercicios.aula05;
import javax.swing.*;

public class Exercicio10 {

	public static void main(String[] args) {

		int idadeAnos = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos anos você tem?  ")); 
		int idadeMeses = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos meses de idade você tem? ")); 
		int idadeDias = Integer.parseInt(JOptionPane.showInputDialog(null, "Qauntos dias de idade você tem? ")); 
		
		int contaDias = idadeAnos * 365 + idadeMeses * 30 + idadeDias;
		
		JOptionPane.showMessageDialog(null, "Sua idade em dias é de: " + contaDias);
		

	}

}
