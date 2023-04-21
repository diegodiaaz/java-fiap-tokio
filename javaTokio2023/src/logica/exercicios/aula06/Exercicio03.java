package logica.exercicios.aula06;

import javax.swing.*;

public class Exercicio03 {

	public static void main(String[] args) {
		
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota"));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a terceira nota"));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quarta nota"));
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media >= 7) {
			JOptionPane.showMessageDialog(null, "O aluno está aprovado!");
		} else if (media >=5 && media < 7) {
			JOptionPane.showMessageDialog(null, "O aluno está de recuperação!");			
		} else if (media < 5) {
			JOptionPane.showMessageDialog(null, String.format("A média do aluno foi: %.1f", media, "\nO aluno está reprovado"));/*(null, "O aluno está reprovado!");*/		
			
		}else {
			JOptionPane.showMessageDialog(null, "bota os ngc direito mlk");
		}
	}

}