package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota do aluno: ");
		double nota2 = sc.nextDouble();
		
		double mediaPonderada = ((nota1 * 4 + nota2 * 6) / (4 + 6));
		
		System.out.println("A média ponderada do aluno foi: " + mediaPonderada);
		
		
		
		
		
		
		sc.close();

	}

}
