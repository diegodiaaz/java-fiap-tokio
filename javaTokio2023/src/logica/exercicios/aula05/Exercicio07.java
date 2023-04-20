package logica.exercicios.aula05;

//import java.awt.geom.RoundRectangle2D.Double;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o valor do produto: ");
		double valorProd = Double.parseDouble(sc.nextLine());
		
		System.out.print("Insira o valor pago: ");
		double valorPago = Double.parseDouble(sc.nextLine());
		
		double valorTroco = (valorPago - valorProd);
				
		if (valorPago <= valorProd) {
			System.out.println("Sem troco!");
		} else {
			System.out.printf("%.2f", valorTroco);
		}
		
		
		
		sc.close();
	}
		
}