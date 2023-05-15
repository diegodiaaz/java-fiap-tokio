package logica.exercicios.aula09;

public class Exercicio01 {

	public static void main(String[] args) {

//		Considerando o trecho de código Java representado a seguir:
//
		int[] v = {2, 0, 3, 9};
		v[v[2]] = v[v[1]];
		for (int i : v) {
			System.out.println(i);
		}
		
//			▪ O que será impresso na tela?
//			a) 2 0 3 2
//			b) 2 0 3 9
//			c) 2 0 0 9
//			d) 2 3 3 2

//		RESPOSTA: B
	}

}
