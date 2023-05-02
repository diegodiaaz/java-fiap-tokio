package logica.aulas.aula10;

import java.util.Scanner;

public class MetodoComArg {

	// METODOS SEM RETORNO COM PARAMETROS(Argumentos)

	static void SaudacaoComArgs(String nome, int idade) {

		if (idade >= 18) {
			System.out.printf("Olá, %s! Você tem %d anos e é maior de idade\n", nome, idade);
		} else {
			System.out.printf("Olá, %s! Você tem %d anos e é menor de idade\n", nome, idade);
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String nomeDigitado = sc.nextLine();

		System.out.print("Digite sua idade: ");
		int idadeDigitada = sc.nextInt();

		SaudacaoComArgs(nomeDigitado, idadeDigitada);

	}

}
