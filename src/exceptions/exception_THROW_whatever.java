package exceptions;
import javax.swing.*;

public class exception_THROW_whatever {

	public static void main(String[] args) {
		try {
			division();
		}catch(ArithmeticException e){
			System.out.println("No puedo dividir por CERO");
		}catch(NumberFormatException e){
			System.out.println("Introduce números enteros");
			System.out.println(e.getMessage());
			System.out.println("Has generado un error tipo: "+e.getClass().getName());
		}
	}
	static void division(){
		int num1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
		int num2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));
		System.out.println("El resultado es: "+num1/num2);
	}
}
