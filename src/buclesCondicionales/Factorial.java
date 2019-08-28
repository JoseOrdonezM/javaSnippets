package buclesCondicionales;
import javax.swing.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int resultado=1;
		Long resultado=1L;
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número"));
		for(int i=numero;i>0;i--) {
			resultado=resultado*i;
			}
		System.out.println("Elfactorial de "+numero+" es "+resultado);
	}

}
