package logica.exercicios.aula06;
import javax.swing.*;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número"));
		
		if (num > num2) {
			JOptionPane.showMessageDialog(null, "O número maior é: " + num);
		} else if (num < num2){
			JOptionPane.showMessageDialog(null, "O número maior é: " + num2);
		} else {
			JOptionPane.showMessageDialog(null, "Os Números são iguais");
		}
		

	}

}
