package logica.aulas.aula07;

import javax.swing.JOptionPane;

public class Atividade03 {

	public static void main(String[] args) {

		double nota1, nota2, media;

		do {
			nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota: "));
			
			if (nota1 < 0 || nota1 > 10) {
			JOptionPane.showMessageDialog(null, "Valor inválido. Digite novamente!", null, 2);	
			}
			
		} while (nota1 < 0 || nota1 > 10); 
		
		do {
			nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota: "));
			
			if (nota2 < 0 || nota2 > 10) {
				JOptionPane.showMessageDialog(null, "Valor inválido. Digite novamente!", null, 2);	
				}
		} while (nota2 < 0 || nota2 > 10);

		media = (nota1 + nota2) / 2;

		JOptionPane.showMessageDialog(null, String.format("A média do aluno é: %.2f", media));

	}

}
