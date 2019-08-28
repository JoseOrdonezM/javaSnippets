package buclesCondicionales;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class BucleInicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato = new Scanner(System.in);
		
		System.out.println("Dime el user");
		
		String User = dato.next();
		String secretPass = "ManDanga";
		System.out.println("Dime la clave");
		String dato01 = dato.next();
		while (dato01.equals(secretPass)==false) {
			if (dato01.equals(secretPass)==true) {
				System.out.println(User + " estás dentro");
			}else{System.out.println(User + " vuelve a meter contr");
		//	String dato02 = dato.next();
		}
			}
		dato.close();
//		while (pass.equals(User)==false) {
//			System.out.println(User + " dime la clave");
//			String dato01 = dato.next();
//			String secretPass = "ManDanga";
//			if (dato01.equals(secretPass )==true) {
//				System.out.println(User + " estás dentro");
//			} else {System.out.println(User + " te has equivocado, repite");
//
//			}
//		}
//		dato.close();		
	}

}
