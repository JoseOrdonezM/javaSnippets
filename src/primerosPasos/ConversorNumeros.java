package primerosPasos;

import javax.swing.JOptionPane;

public class ConversorNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = 10000.0;
		System.out.printf("%1.5f",num/3);
		String nm01 = JOptionPane.showInputDialog("Introduzca número y le sumo uno");
		int nm02 = Integer.parseInt(nm01);
		double nm03 = (double) nm02;
		System.out.println("\n" + (nm03+1));
		String nm04 = JOptionPane.showInputDialog("Introduzca OTRO número y le sumo dos");
		double nm05 = Double.parseDouble(nm04);
		System.out.printf("%1.11f" , (nm05+2));
		
	}

}
