package primerosPasos;

import javax.swing.JOptionPane;

public class PideEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre, membrillo");
		String edad = JOptionPane.showInputDialog("Introduce tu edad, carabobo");
		int edad_numero = Integer.parseInt(edad);
		System.out.println("Hola " + nombre + " serás un capullo de " + (edad_numero+1) + " años, el año que viene");
	}

}
