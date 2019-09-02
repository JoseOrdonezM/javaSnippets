package exceptions;
import javax.swing.*;
public class exception_RuntimeExceptions {

	public static void main(String[] args) {
		try {
			int[] mi_matriz;
			mi_matriz = new int[5];
			mi_matriz[0] = 5;
			mi_matriz[1] = 38;
			mi_matriz[2] = 15;
			mi_matriz[3] = 92;
			mi_matriz[4] = 71;
			mi_matriz[5] = 999;
			for (int i = 0; i < 5; i++) {
				System.out.println("Posición " + i + " = " + mi_matriz[i]);
			} 
		} catch (ArrayIndexOutOfBoundsException e) {
			// handle exception
			System.out.println("Hay un error de tipo: "+e.getMessage());
			e.printStackTrace();
		}
		//Intro DATA
		String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
		int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		System.out.println("Hola "+nombre+" Tienes "+edad+" años."+" El programa terminó de ejecutarse");
	}

}
