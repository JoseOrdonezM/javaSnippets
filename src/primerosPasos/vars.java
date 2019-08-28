package primerosPasos;

public class vars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte edad=35;
		String nombre = "LolaiLord";
		int longitudNombre = nombre.length();
		System.out.println(longitudNombre);
		char resultado = nombre.charAt(longitudNombre-1);
		//double base=3.545223;
		//double exp=22.543223;
		//int resultado=(int)Math.round(Math.pow(base,exp));
		//double resultado = (double)Math.round(base);
		String nombreParte = nombre.substring(5,longitudNombre);
		System.out.println(resultado);
		System.out.println(nombreParte);
		
	}

}
