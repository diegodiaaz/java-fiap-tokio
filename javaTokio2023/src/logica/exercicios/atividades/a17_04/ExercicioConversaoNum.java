package logica.exercicios.atividades.a17_04;
import java.util.Scanner;

public class ExercicioConversaoNum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		float num = sc.nextInt();
		
		/* Integer num = Integer.valueOf(str); */
		
		System.out.println("Seu sucessor é: " + (num + 1));
		System.out.println("Seu antecessor é: " + (num - 1));
		System.out.println("O dobro dele é: " + (num * 2));
		System.out.println("A metade dele é: " + (num / 2));
		
		
		sc.close();
	}
}
