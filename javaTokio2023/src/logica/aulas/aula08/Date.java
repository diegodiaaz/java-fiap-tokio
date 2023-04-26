package logica.aulas.aula08;

import java.util.Calendar;

public class Date {

	public static void main(String[] args) {
		
//		Date data = new Date();
//		System.out.println("Data agora: " + data);
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		
		int hora = c.get(Calendar.HOUR_OF_DAY);
		int min = c.get(Calendar.MINUTE);
		
		System.out.println(" ");
		System.out.println("Hora: " + hora);
		System.out.println("Minutos: " + min);
		
	}

}
