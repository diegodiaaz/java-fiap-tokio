package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		int num;
		do {
			System.out.println("Digite um número inteiro até 999: ");
			num = Integer.parseInt(sc.nextLine());
		}
		while (num > 999); 
		
		
		int numCent = num / 100;
		int numDez = (num % 100) / 10;
		int numUni = ((num % 100) % 10);
		
		System.out.println("A centena do número é: " + numCent 
				+ "00\nA dezena do número é: " + numDez
				+ "0\nA unidade do número é: " + numUni);
		
		

		
		sc.close();
	}
}