package logica.aulas.aula07;

import javax.swing.JOptionPane;

public class WhileLaco {

	public static void main(String[] args) {
		
		
//		int i = 0;
//		
//		while(i < 10) {
//			System.out.println("Olá mundo");
//			i++;
//		}
		
		
//		String jogar = "sim";
//		
//		while (jogar.equals("sim")) {
//			JOptionPane.showMessageDialog(null, "Repete ou inicia o jogo");
//			
//			jogar = JOptionPane.showInputDialog(null, "Deseja jogar novamente?");
//		}
		
//		int i = 0;
//		
//		while (i <= 10) {
//			JOptionPane.showMessageDialog(null, "Olá mundo" + i);
//			i++;
//		}
		
		
		// MODIFICADORES DE LAÇOS
		
		int i = 0;
		
		while (i < 10) {
			i++;
			
			if (i == 3 || i == 5) {
				continue;
			}
			
			if (i == 7){
				break;
			}
			
			System.out.println("Cambalhota " + i);
		}
		
		System.out.println("Fim do prgrama");
	}

}
