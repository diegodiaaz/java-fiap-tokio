package logica.exercicios.aula06;

import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {
		
		double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira seu salário em R$: "));
		
		double aumento20 = (salario * 0.2);
		double aumento15 = (salario * 0.15);
		double aumento10 = (salario * 0.1);
		double aumento5 = (salario * 0.05);
		
		if (salario <= 280) {
			JOptionPane.showMessageDialog(null, String.format("Seu salário era: R$%.2f \n", salario)
					+ "O percentual de aumento foi de: 20% \n" 
					+ String.format("O valor aumentado foi de: R$%.2f \n", aumento20) 
					+ String.format("Seu novo salário é de: R$%.2f", (salario + aumento20)));			
		} else if (salario > 280 && salario <= 700) {
			JOptionPane.showMessageDialog(null, String.format("Seu salário era: R$%.2f \n", salario) 
					+ "O percentual de aumento foi de: 15% \n" 
					+ String.format("O valor aumentado foi de: R$%.2f \n", aumento15) 
					+ String.format("Seu novo salário é de: R$%.2f", (salario + aumento15)));
		} else if (salario > 700 && salario < 1500) {
			JOptionPane.showMessageDialog(null, String.format("Seu salário era: R$%.2f \n", salario)
					+ "O percentual de aumento foi de: 10% \n" 
					+ String.format("O valor aumentado foi de: R$%.2f \n", aumento10) 
					+ String.format("Seu novo salário é de: R$%.2f", (salario + aumento10)));
		} else if (salario >= 1500) {
			JOptionPane.showMessageDialog(null, String.format("Seu salário era: R$%.2f \n", salario)
					+ "O percentual de aumento foi de: 5% \n" 
					+ String.format("O valor aumentado foi de: R$%.2f \n", aumento5) 
					+ String.format("Seu novo salário é de: R$%.2f", (salario + aumento5)));
		} else {
			JOptionPane.showMessageDialog(null, "Favor insira um valor!");
		}
		
	}

}
