package herenciaCorrectamenteDiseñada;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona[] lasPersonas=new Persona[2];
		lasPersonas[0]=new Empleado2("Luisito Meapilas", 50000, 2009, 2, 25);
		lasPersonas[1]=new Alumno("Luisita", "Arquitectura");
		
		for (Persona unaPersona:lasPersonas) {
			System.out.println(unaPersona.dameNombre()+", "+unaPersona.dameDescripcion());
		}
	}
}
abstract class Persona {
	public Persona(String nom) {
	nombre=nom;
	}
	public String dameNombre() {
	return nombre;
	}
	public abstract String dameDescripcion();
	
	private String nombre;
}
class Empleado2 extends Persona{
	public Empleado2 (String nom, double sue,
						int agno, int mes, int dia) {
		super(nom);
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		altaContrato=calendario.getTime();
		//METODO DE ASIGNAR CONSECUTIVAMENTE ID EN EL CONSTRUCTOR
		++IdSiguiente;//Así el CONSTRUCTOR es el que se encarga de hacer el bucle
		Id=IdSiguiente;	
	}
	public String dameDescripcion() {
		return "Empleado con Id: "+Id+" con sueldo: "+sueldo;
	}
	public double dameSueldo () {//getter
		return sueldo;
	}
	public Date dameFechaContrato() {//getter
		return altaContrato;
	}
	public void subeSueldo(double porcentaje) {//setter
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}

	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;
	}
class Alumno extends Persona{
	public Alumno (String nom,String car) {
		super(nom);
		carrera=car;
	}
	
	public String dameDescripcion(){
		return "Alumno estudiando la carrera: "+carrera;
	}
	private String carrera;
	
}
