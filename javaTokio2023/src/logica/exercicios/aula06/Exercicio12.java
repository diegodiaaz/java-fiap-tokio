package logica.exercicios.aula06;

import javax.swing.JOptionPane;

public class Exercicio12 {

	public static void main(String[] args) {

		double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'A'"));
		double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'B'"));
		double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'C'"));
		double aux;

		
		if (a < b) {
			aux = b;
			b = a;
			a = aux;
		} else if (a < c) {
			aux = c;
			c = a;
			a = aux;
		} 
 		
		System.out.println("1.- " + a + "\n2.- "  + b + "\n3.- "  + c);
		
		
		// if (B > A && B > C) {
//			aux = A;
//			A = B;
//			B = aux;
//		} else if (C > A) {
//			aux = A;
//			A = C;
//			C = aux;
//		}
//		
//		if (A >= (B + C)) { 
//			JOptionPane.showMessageDialog(null, "NAO FORMA TRIANGULO");
//		} else {
//			if (A*A == (B*B) + (C*C)) JOptionPane.showMessageDialog(null, "TRIANGULO RETANGULO");
//			if (A*A > (B*B) + (C*C)) JOptionPane.showMessageDialog(null, "TRIANGULO OBTUSANGULO");
//			if (A*A < (B*B) + (C*C)) JOptionPane.showMessageDialog(null, "TRIANGULO ACUTANGULO");
//			if (A == B && A == C) JOptionPane.showMessageDialog(null, "TRIANGULO EQUILATERO");
//			if ((A == B && A != C) || (A == C && A != B) || (B == C && B != A)) JOptionPane.showMessageDialog(null, "TRIANGULO ISOSCELES");
	}

}
