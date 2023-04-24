package logica.exercicios.aula06;

public class Exercicio07 {

	public static void main(String[] args) {

		int a, b, c, d;
		
		a = 5;
		b = 7;
		c = 4;
		d = 8;
		
		if (((a <= b) && (b < d)) == true) {
			System.out.println("1.- " + true);
		} else {
			System.out.println("1.- " + false);
		}
		
		if (((a == b) || (c != b)) == true) {
			System.out.println("2.- " + true);
		} else {
			System.out.println("2.- " + false);
		}
			
		if (((d > a) && (c >= b)) == true) {
			System.out.println("3.- " + true);
		} else {
			System.out.println("3.- " + false);
		}
			
		 if (((a <= b) || (c <= d)) == true) {
			 System.out.println("4.- " + true);		
		} else {
			System.out.println("4.- " + false);
		}	
		
		if ((((b > c) || (c < a)) && (d <= b)) == true) {
			System.out.println("5.- " + true);
		} else {
			System.out.println("5.- " + false);
		}
		
	}

}
