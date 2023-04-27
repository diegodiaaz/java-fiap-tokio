package logica.aulas.aula09;

public class RevVetores {

	public static void main(String[] args) {

		int[] nums = {10, 25, 5, 3};
		
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("Pos: %d -- valor: %d\n", i, nums[i]);
		}
		
		
		// JEITO UM POUCO DIFERENTE DE PERCORRER UM VETOR
		
		for (int num: nums) {
			System.out.println(num);
		}
		
	}

}
