package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro até 999: ");
		int num = Integer.parseInt(sc.nextLine());

		int numCent = num / 100;
		int numDez = (num % 100) / 10;
		int numUni = ((num % 100) % 10);
		

		if (num < 999) {
			
			System.out.println("A centena do número é: " + numCent 
					+ "00\nA dezena do número é: " + numDez
					+ "0\nA unidade do número é: " + numUni);

		} else {

			System.out.println("Erro, digite um número inteiro até 999: ");
			int num2 = Integer.parseInt(sc.nextLine());
			
			int num2Cent = num2 / 100;
			int num2Dez = (num2 % 100) / 10;
			int num2Uni = ((num2 % 100) % 10);
			
			System.out.println("A centena do número é: " + num2Cent 
					+ "00\nA dezena do número é: " + num2Dez
					+ "0\nA unidade do número é: " + num2Uni);
			
		}
		
		
		
		sc.close();
	}
}