package logica.aulas.aula11;

public class MetodoComRet {
	
//	static void somar(int a, int b) {
//		int soma = a + b;
//		System.out.println(soma);
//	}
	
//	static int somar(int a, int b) {
//		int soma = a + b;
//		return soma;
//	}
	
	//OU
	
	static int somar(int a, int b) {
		return a + b;
	}
	

	public static void main(String[] args) {

		
		int valorSoma = somar(2, 100); 
		
		System.out.println(valorSoma);
		
	}

}
