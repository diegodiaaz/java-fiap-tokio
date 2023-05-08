package logica.exercicios.aula08;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		String user = JOptionPane.showInputDialog("Insira seu nome: ");
		
		System.out.println("Data e hora atuais: " + cal.getTime() + "\n");
		
		int hora = cal.get(Calendar.HOUR_OF_DAY); 
		
		if (hora >= 6 && hora < 12) {
			System.out.println("Bom dia " + user + "!");
		} else if (hora >= 12 && hora < 18) {
			System.out.println("Boa tarde " + user + "!");
		} else {
			System.out.println("Boa noite " + user + "!");
		}
		
	}

}
 

