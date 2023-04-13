package logica.aulas;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		System.out.println("Olá mundo, meu nome é Diego.");
		
		int idade = 17;
		System.out.println("Tenho " + idade + " anos");
		
		double salario = 1318.20;
		System.out.println(salario);
		
		/* String tem S maiúsculo pq é uma classe, não uma variável igual "int" ou "double" */
		String nome = "Diego";
		System.out.println(nome);
		
		/* Operadores para String */
		System.out.println("Bem-vindo, " + nome + "!");
		
		System.out.println(nome + ", você tem " + idade + " anos");
		
		System.out.println(nome + ", você tem " + (idade + idade) + " anos");
	}

}
