package logica.aulas.aula01;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		System.out.println("Ol� mundo, meu nome � Diego.");
		
		int idade = 17;
		System.out.println("Tenho " + idade + " anos");
		
		double salario = 1318.20;
		System.out.println(salario);
		
		// String tem S mai�sculo pq � uma classe, n�o uma vari�vel igual "int" ou "double" 
		String nome = "Diego";
		System.out.println(nome);
		
		// Operadores para String
		System.out.println("Bem-vindo, " + nome + "!");
		
		System.out.println(nome + ", voc� tem " + idade + " anos");
		
		System.out.println(nome + ", voc� tem " + (idade + idade) + " anos");
		
		
	}

}
