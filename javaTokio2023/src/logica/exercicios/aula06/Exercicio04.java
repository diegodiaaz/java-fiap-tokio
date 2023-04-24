package logica.exercicios.aula06;
import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número desejado"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número desejado"));
		
		int resultado = num1 % num2;
		
		if (resultado == 0) {
			JOptionPane.showMessageDialog(null, "Os números são múltiplos!");
		} else {
			JOptionPane.showMessageDialog(null, "Os números não são múltiplos!");
		}
		
		
	}

}
