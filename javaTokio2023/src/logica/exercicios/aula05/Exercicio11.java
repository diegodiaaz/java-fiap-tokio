package logica.exercicios.aula05;
import javax.swing.*;

public class Exercicio11 {

	public static void main(String[] args) {

		double idadeDias = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a sua idade em dias?  ")); 
		
		double idadeAnos = idadeDias / 365;
		double idadeMeses = (((idadeAnos - (int)idadeAnos) * 365) / 30);
		double dias = ((idadeMeses - (int)idadeMeses) * 30);
		
		//JOptionPane.con(showMessageDialog(null, "A sua idade é: %.f", idadeAnos , " anos, %.0f", idadeMeses, " meses e %.0f", dias, "dias de idade!" ));
		
//		System.out.printf("\nA sua idade é: %.1f", idadeAnos);
//		System.out.printf("\n meses: %.1f", idadeMeses);
//		System.out.printf("\n e dias: %.1f", dias);
		
		
		System.out.println("A sua idade é: " + (int)idadeAnos);
		System.out.println("meses: " + (int)idadeMeses);
		System.out.printf("e dias: %.0f", dias);

	}

}
