package logica.aulas.aula09;

public class Atividade01 {

	public static void main(String[] args) {

		//"matriz.length" = linhas
		//"matriz[0] = o que tem na linha 0
		// "matriz[0][3] = oq tem na linha zero, posição tres
		
		
		int[][] matriz = new int[4][5];

		int qtdLinhas = matriz.length;
		int qtdColunas = matriz[3].length;
		
		System.out.println("linhas: " + qtdLinhas);
		System.out.println("colunas: " + qtdColunas);
		
		for (int i = 0; i < qtdLinhas; i++) {
			
			for (int j = 0; j < qtdColunas; j++) {
				matriz[i][j] = 5;
			}
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < qtdLinhas; i++) {
			
			for (int j = 0; j < qtdColunas; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

}
