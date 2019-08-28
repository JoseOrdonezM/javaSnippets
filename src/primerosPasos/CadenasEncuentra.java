package primerosPasos;

import javax.swing.JOptionPane;

// import java.util.*;



public class CadenasEncuentra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Alumno01 = "Rober";
		String Alumno02 = "Jhony";
		System.out.println("Los alumos se llaman igual");
		System.out.println(Alumno01.equals(Alumno02));
//		Scanner entrada = new Scanner(System.in);
//		System.out.println("Escribe el nombre del nuevo alumno");
//		String Nuevo_Alumno = entrada.nextLine();
//		System.out.println("Escribe su edad");
//		int Edad_Alumno = entrada.nextInt();
//		entrada.close();
		String Nuevo_Alumno = JOptionPane.showInputDialog("Escribe el nombre del nuevo alumno");
		String Edad_Alumno = JOptionPane.showInputDialog("Escribe su edad");
		int Edad_Alumno_Int = Integer.parseInt(Edad_Alumno);
		System.out.println("Hola " + Nuevo_Alumno +
				" tienes " + (Edad_Alumno_Int+1) + " años");

	}

}
