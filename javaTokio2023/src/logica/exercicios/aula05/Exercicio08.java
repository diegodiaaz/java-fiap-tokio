package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor em R$ para conversão: ");
		double valorReal = Double.parseDouble(sc.nextLine());
		
		double valorDolar = (valorReal * 0.20);
		
		double valorEuro = (valorReal * 0.18);
		
		double valorPeso = (valorReal * 42.78);
		
		double valorLibra = (valorReal * 0.16);
		
		double valorIene = (valorReal * 26.50);
		
		System.out.printf("Valor em Real fornecido: %.2f" , valorReal);
		System.out.printf("\nValor esquivalente em Dólar: %.2f", valorDolar);
		System.out.printf("\nValor esquivalente em Euro: %.2f", valorEuro);
		System.out.printf("\nValor esquivalente em Iene: %.2f", valorIene);
		System.out.printf("\nValor esquivalente em Peso: %.2f", valorPeso);
		System.out.printf("\nValor esquivalente em Libra: %.2f", valorLibra);

	}

}
