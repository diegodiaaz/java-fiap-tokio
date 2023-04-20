package logica.aulas.aula06;

public class IntroducaoSwitchCase {

	public static void main(String[] args) {
		
		int escolhaUsuario = 1;
		
		switch (escolhaUsuario) {
		case 0:
			System.out.println("Sair do programa");
			break;
			
		case 1:
			System.out.println("Entrar no programa");
			break;
		
		default:
			System.out.println("Erro");
		}
		
		
	}

}
