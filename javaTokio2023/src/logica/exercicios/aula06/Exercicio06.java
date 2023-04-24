package logica.exercicios.aula06;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {

		int anoNasc = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira seu ano de nascimento: "));
		Calendar cal = GregorianCalendar.getInstance();
		
		int conta = cal.get(Calendar.YEAR) - anoNasc;

		if (conta > 0 && conta < 16) {
			JOptionPane.showMessageDialog(null, "Você tem: " + conta + " anos. " 
		+ "\nVoto proibido por lei!");
		} else if ((conta >= 16 && conta < 18) || conta > 70) {
			JOptionPane.showMessageDialog(null, "Você tem: " + conta + " anos. " 
		+ "\nVoto opcional!");
		} else {
			JOptionPane.showMessageDialog(null, "Você tem: " + conta + " anos. " 
		+ "\nVoto obrigatório por lei!");
		}
	}

}
