package logica.exercicios.aula05;

import javax.swing.*;

public class Exercicio06 {

	public static void main(String[] args) {
		
		String peca1 = JOptionPane.showInputDialog(null, "Insira o nome da primeira peça desejada: ");
		double precoUni1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o preço da primeira peça desejada: "));
		int qntPecas1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade desejada: "));
		
		String peca2 = JOptionPane.showInputDialog(null, "Insira o nome da segunda peça desejada: ");
		double precoUni2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o preço da segunda peça desejada: "));
		int qntPecas2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade desejada: "));
		
		
		double valorFinal = (precoUni1 * qntPecas1) + (precoUni2 * qntPecas2);
		
		JOptionPane.showMessageDialog(null, String.format("O valor que deverá ser pago é de: R$%.2f" , valorFinal));
		
		
		System.out.println(peca1 + " " + peca2);
		
	

	}

}
