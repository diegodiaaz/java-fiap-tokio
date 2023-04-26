package logica.aulas.aula08;

import javax.swing.JOptionPane;

public class StringClasse {

	public static void main(String[] args) {

		String str = "FIAP Paulista";
		
		int tamanho = str.length();		
		JOptionPane.showMessageDialog(null, "Tamanho da String: " + tamanho);
		
		for (int i = 0; i < tamanho; i++) {
			JOptionPane.showMessageDialog(null, str.charAt(i));
		}
	}

}
