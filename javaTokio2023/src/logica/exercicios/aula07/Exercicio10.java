package logica.exercicios.aula07;

import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {

		System.out.println("Números primos no intervalo de 2 a 2000:");
		for (int num = 2; num <= 2000; num++) {
			boolean primo = true;

			for (int i = 2; i <= Math.sqrt(num); i++) {

				if (num % i == 0) {
					primo = false;
					break;
				}
			}

			if (primo) {
				System.out.println(num + " ");
			}
		}

	}
}