package logica.aulas.aula05;

import java.util.Scanner;

public class Manipulacao {

	public static void main(String[] args) {
		
		double salario = 1300.50;
		String salarioStr = Double.toString(salario);
		
		System.out.println(salarioStr.getClass().getSimpleName());
		
		System.out.println(" ");
		
		String idade = "25";
		
		int idadeInt = Integer.parseInt(idade);
		
		System.out.println(idadeInt);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o preco do produto: R$");
		String preco = sc.nextLine();
		
		float precoFloat = Float.parseFloat(preco);
		
		System.out.println("R$" + precoFloat);
		
		
		sc.close();

	}

}
