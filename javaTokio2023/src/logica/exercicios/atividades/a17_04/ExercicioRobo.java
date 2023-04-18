package logica.exercicios.atividades.a17_04;
import java.util.Scanner;

public class ExercicioRobo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a distância do alvo em centímetros: ");
		int num = sc.nextInt();
		
		/* Integer num = Integer.valueOf(str); */
		
		if (num <= 70) {
			System.out.println("Distância perigosa. ATIVADA");
		} else {
			System.out.println("Distância 'segura'. DESATIVADA");
		}
		
		
		sc.close();
	}
}
