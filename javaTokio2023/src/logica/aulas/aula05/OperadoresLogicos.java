package logica.aulas.aula05;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		boolean verificaSenha = true;
		boolean verificaEmail = true;
		
		boolean logicaE = verificaSenha && verificaEmail;
		System.out.println("\n" + logicaE);
		
		
		boolean logicaOU = true || false;
		System.out.println("\n" + logicaOU);
		
		
		boolean negacao = !true;
		System.out.println("\n" + negacao);
		
		
		// OPERADORES DE STRINGS
		String nome1 = "Joana";
		String nome2 = "Joana";
		String nome3 = new String("Joana");
		
		System.out.println("\n" + nome1 == nome3);
		System.out.println("\n" + nome1.equals(nome3));
		
	}
}
