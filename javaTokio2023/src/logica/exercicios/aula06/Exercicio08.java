package logica.exercicios.aula06;

import javax.swing.JOptionPane;

public class Exercicio08 {

	public static void main(String[] args) {

		double km = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a distância da viagem em KM"));
		double litros = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o gasto de combustivel em L"));
		
		double kml = km/litros;
		
		JOptionPane.showMessageDialog(null, String.format("O gasto de Km/l do carro é de: %.2fKm/L", kml));

	}

}
