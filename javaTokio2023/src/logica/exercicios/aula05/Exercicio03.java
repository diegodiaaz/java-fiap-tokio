package logica.exercicios.aula05;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Favor digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Favor selecione seu gênero: " 
							+ "\n[M] para Masculino"
							+ "\n[F] para Feminino"
							+ "\n[O] para Outro"
							+ "\n[N] para Não responder");
		String gen = sc.nextLine();
		
		char genChar = gen.charAt(0);
		
		System.out.println("Olá " + nome + " Você escolheu a seguinte opção de gênero: " + genChar);
		
		
		
		sc.close();

	}

}
