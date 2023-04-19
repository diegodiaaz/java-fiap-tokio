package logica.aulas.aula06;

public class IntroducaoCondicionais {

	public static void main(String[] args) {

		// ESTRUTURA CONDICIONAL SIMPLES

		/*
		 * float nota = 7;
		 * 
		 * if (nota <= 6) { System.out.println("Sua nota é: " + nota); } else {
		 * System.out.println("Parabéns, aprovado"); }
		 */

		// ------------------------------------------
		// ESTRUTURA CONDICIONAL COMPOSTA
		// ------------------------------------------

		/*
		 * float notaFinal = 6;
		 * 
		 * if (notaFinal < 6) { System.out.println("REPROVADO VERME AMALDIÇOADO"); }
		 * else {
		 * System.out.println("PARABÉNS APROVADO, NÃO FEZ MAIS QUE SUA OBRIGAÇÃO"); }
		 */

		// ------------------------------------------
		// ESTRUTURA CONDICIONAL ENCADEADA
		// ------------------------------------------

		/*
		 * float notaFinal2 = 6;
		 * 
		 * if (notaFinal2 < 4) { System.out.println("REPROVADO VERME AMALDIÇOADO"); }
		 * else { if (notaFinal2 < 6) {
		 * System.out.println("REPROVADO VERME AMALDIÇOADO"); } else {
		 * System.out.println("PARABÉNS APROVADO, NÃO FEZ MAIS QUE SUA OBRIGAÇÃO"); } }
		 */

		// ------------------------------------------
		// ESTRUTURA CONDICIONAL COMPOSTA - ELSE IF
		// ------------------------------------------

		float notaFinal2 = 6;

		if (notaFinal2 < 4) {
			System.out.println("REPROVADO VERME AMALDIÇOADO");
		} else if (notaFinal2 < 6) {
				System.out.println("REPROVADO VERME AMALDIÇOADO");
			} else {
				System.out.println("PARABÉNS APROVADO, NÃO FEZ MAIS QUE SUA OBRIGAÇÃO");
			}
		}

}
