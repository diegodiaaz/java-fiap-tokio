package logica.exercicios.aula05;
import javax.swing.*;

public class Exercicio11 {

	public static void main(String[] args) {

		int idadeDias = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a sua idade em dias?  ")); 
		
		int contaAnos = idadeDias / 365;
		
		JOptionPane.showMessageDialog(null, "Sua idade é : " + contaAnos + " anos de idade!");
		

	}

}
