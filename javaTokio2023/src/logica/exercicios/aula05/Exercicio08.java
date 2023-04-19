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
		
		System.out.printf("Valor em Real fornecido: " + "%.2f", valorReal + "\n");
		System.out.printf("Valor esquivalente em Dólar: " + "%.2f", valorDolar + "\n");
		System.out.printf("Valor esquivalente em Euro: " + "%.2f", valorEuro + "\n");
		System.out.printf("Valor esquivalente em Peso: " + "%.2f", valorPeso + "\n");
		System.out.printf("Valor esquivalente em Libra: " + "%.2f", valorLibra + "\n");
		System.out.printf("Valor esquivalente em Iene: " + "%.2f", valorIene + "\n");

	}

}
