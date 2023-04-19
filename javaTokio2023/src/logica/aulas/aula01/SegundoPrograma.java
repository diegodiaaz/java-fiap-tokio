package logica.aulas.aula01;

import java.util.Scanner;

public class SegundoPrograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Bem-vindo, " + nome + " seu monstro");
		
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		System.out.println("Sua idade é: " + idade + " anos");
		

		sc.close();
	}

}
