package finalYStatic;

public class finalConstantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados trabajador1=new Empleados("Francisco");
		Empleados trabajador2=new Empleados("Anita Dinamita");
		trabajador1.cambiaSeccion("RRHH");
		//trabajador1.cambiaNombre("Paquito Chocolatero");//Aquí cambia el nombre, lo que es imposible
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());
	}

}
class Empleados{//NOTA:Todos los empleados empiezan en ADMON.
	public Empleados(String nom) {
		nombre=nom;
		seccion="Administración";
	}
	public void cambiaSeccion(String seccion) {//SETTER
		this.seccion=seccion;
	}
	public String devuelveDatos() {//GETTER
		return "El nombre es: "+nombre+" y la sección es "+seccion;
	}
	/*//Imagina que crea otro setter que cambia nombre
	public void cambiaNombre(String nombre) {
		this.nombre=nombre;
	}*/
	private final String nombre;
	private String seccion;
	
}