package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o nome da primeira peça desejada? - ");
		String peca1 = sc.nextLine();
		
		System.out.print("Qual o valor da primeira peça desejada? - ");
		double precoUni1 = Double.parseDouble(sc.nextLine());
		
		System.out.print("Quantas peças você deseja? - ");
		int qntPecas1 = Integer.parseInt(sc.nextLine());
		
		
		System.out.println(" ");
		
		
		System.out.print("Qual o nome da segunda peça desejada? - ");
		String peca2 = sc.nextLine();
		
		System.out.print("Qual o valor da segunda peça desejada? - ");
		double precoUni2 = Double.parseDouble(sc.nextLine());
		
		System.out.print("Quantas peças você deseja? - ");
		int qntPecas2 = Integer.parseInt(sc.nextLine());
		
		
		double valorFinal = (precoUni1 * qntPecas1) + (precoUni2 * qntPecas2);
		
		System.out.println("O valor que deverá ser pago é de: R$" + valorFinal);
		
		
		
		
		sc.close();

	}

}
