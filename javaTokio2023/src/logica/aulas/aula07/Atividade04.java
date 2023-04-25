package logica.aulas.aula07;

//import java.util.Iterator;

import javax.swing.JOptionPane;

public class Atividade04 {

	public static void main(String[] args) {

		int produto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de produtos"));
		
		for (int i = 1; i <= produto; i++) {
//			JOptionPane.showMessageDialog(null, "Produto: " + i);
			System.out.println("Produto: " + i);
		}

	}

}
