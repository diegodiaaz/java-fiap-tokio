package logica.exercicios.aula08;

import java.util.Calendar;

public class Exercicio02 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		int dia = cal.get(Calendar.DAY_OF_WEEK);

//		System.out.println(dia);

		switch (dia) {

		case 1:
			System.out.println("Hoje é domingo, sem feira");
			break;

		case 2:
			System.out.println("Hoje é segunda-feira, sem feira");
			break;

		case 3:
			System.out.println("Hoje é terça-feira, terá feira de rua");
			
		case 4:
			System.out.println("Hoje é quarta-feira, sem feira");
			
		case 5:
			System.out.println("Hoje é quinta-feira, sem feira");
			
		case 6:
			System.out.println("Hoje é sexta-feira, sem feira");
		
		case 7:
			System.out.println("Hoje é sábado, sem feira");
		}

	}

}
