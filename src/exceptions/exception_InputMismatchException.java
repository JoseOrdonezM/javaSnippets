package exceptions;
import java.util.*;
public class exception_InputMismatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("¿Qué deseas hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. Salir del programa");
		
		Scanner entrada=new Scanner (System.in);
		
		int decision=entrada.nextInt();
		
		if (decision==1){
			
			try {
				pedirDatos();
			} catch (InputMismatchException e) {//Esta forma es la adecuada para tratar excepciones no controladas
				/* TODO Auto-generated catch block
				e.printStackTrace();*/
				System.out.println("DEBES introducir tu edad con un número");
			}
			
		}else{
			
			System.out.println("Adios");
			
			System.exit(0);
		}
		
		entrada.close();
		
	}
	
		static void pedirDatos() throws InputMismatchException {//ÑAPA considerable, hacer de otra forma			
		//try {
			Scanner entrada=new Scanner(System.in);
			System.out.println("Introduce tu nombre, por favor");
			String nombre_usuario=entrada.nextLine();
			System.out.println("Introduce edad, por favor");
			int edad=entrada.nextInt();	
			System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad+1) + " años");
			entrada.close();
		/*} catch (InputMismatchException e) {
			System.out.println("DEBES introducir tu edad con un número");
		}*/
		System.out.println("Hemos terminado");

	}
		
		
}