package logica.exercicios.aula06;

import javax.swing.JOptionPane;
import javax.swing.JDesktopPane;

public class Exercicio09 {

	public static void main(String[] args) {
		
		String[] lugar = {"Residência", "Comércio", "Indústria"};
		double kwhGasto = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o gasto em KW/h"));
		
		int lugarEscolhido = JOptionPane.showOptionDialog(new JDesktopPane(), "Escolha o tipo de cobrança ", "COBRANÇA", 0, JOptionPane.QUESTION_MESSAGE, null, lugar, lugar[0]);
		
		double valorRes = kwhGasto * 0.6;
		double valorCom = kwhGasto * 0.48;
		double valorInd = kwhGasto * 1.29;
		
		if (lugarEscolhido == 0) {
			
			JOptionPane.showMessageDialog(null, String.format("O valor da conta é: R$%.2f", valorRes));
			
		}else if (lugarEscolhido == 1) {
			
			JOptionPane.showMessageDialog(null, String.format("O valor da conta é: R$%.2f", valorCom));
			
		}else if (lugarEscolhido == 2) {
			
			JOptionPane.showMessageDialog(null, String.format("O valor da conta é: R$%.2f", valorInd));
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Favor escolher modelo de cobrança");
			
		}

}
}