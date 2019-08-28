package tiposEnum;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class usoTallas2 {
	//FUERA DEL MAIN declara una variable tipo enum
	enum Talla{//QUE VA A tener un método
		
		MINI("S"),MEDIANO("M"),GRANDE("L"),MUY_GRANDE("XL");
		
		private Talla (String abreviatura) {
			this.abreviatura=abreviatura;
			
		}
		private String abreviatura;
		//Crea un Setter que se pueda acceder desde fuera
		//de la clase
		public String dameAbreviatura() {
			return abreviatura;
		}
		
	}
	//enum Talla {MINI,MEDIANO,GRANDE,MUY_GRANDE};
	/*Ha creado ese constructor estre los campos de Talla porque
	 * los tipos enum no permiten crear objetos:es decir, no puedes
	 * hacer Talla miTalla=new Talla 
	 * El private de ese constructor impide que se pueda acceder
	 * desde fuera de la clase al método de dentro de Talla
	 * 
	 * Para hacer los getter y setter, el constructor actúa
	 * a modo de getter y sólo tiene que crear el setter.TODO
	 * ELLO dentro de los {} de los campos de la variable ENUM
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduzca una de las tallas: MINI,MEDIANO"
				+ ",GRANDE,MUY_GRANDE");
		String entrada_datos=entrada.next().toUpperCase();
		Talla la_talla=Enum.valueOf(Talla.class, entrada_datos);
		System.out.println("Talla="+la_talla);
		System.out.println("Abreviatura="+la_talla.dameAbreviatura());
		
	}
	
}
