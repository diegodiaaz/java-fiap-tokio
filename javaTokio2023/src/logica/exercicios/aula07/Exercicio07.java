package logica.exercicios.aula07;

import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void main(String[] args) {

		double[] nota = new double[20];
		double media;
		int i = 0;
		int j = 0;
		int k = 0;

		media = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a média da turma: "));;
		
		
		for (i = 0; i < nota.length; i++) {

			nota[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a nota do " + (i + 1) + "º aluno"));
			
			if (nota[i] >= media) {
				j += 1;
			} else {
				k += 1;
			}
		}

		JOptionPane.showMessageDialog(null, "O número de alunos com nota acima da média é: " + j + "\nO número de alunos abaixo da média é: " + k);
	}
}
