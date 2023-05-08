package logica.exercicios.aula08;

public class Exercicio05 {

	public static void main(String[] args) {

		
		/*
		double numSorteado = Math.random();
		System.out.println("Num sorteado: " + numSorteado);
		
		double numMultiplicado = numSorteado * 5;
		System.out.println("numMultiplicado: " + numMultiplicado);
		
		double numSomado = numMultiplicado;
		System.out.println("numSomado: " + numSomado);
		
		int numInteiro = (int) Math.round(numSomado);
		System.out.println(numInteiro);
		*/
		
		
		int max = 50;
		int min = 5;
		
		double numSorteado = Math.random();
		System.out.println("Num sorteado: " + numSorteado);
		
		double numMultiplicado = numSorteado * (max - min);
		System.out.println("numMultiplicado: " + numMultiplicado);
		
		System.out.println(min + (numMultiplicado));

	}

}
