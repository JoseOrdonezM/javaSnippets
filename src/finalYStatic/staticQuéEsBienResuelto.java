package finalYStatic;

public class staticQuéEsBienResuelto {

	public static void main(String[] args) {
		EmpleadosIdentificados trabajador1=new EmpleadosIdentificados("Francisco");
		EmpleadosIdentificados trabajador2=new EmpleadosIdentificados("Anita Dinamita");
		trabajador1.cambiaSeccion("RRHH");
		EmpleadosIdentificados trabajador3=new EmpleadosIdentificados("Manolito");
		EmpleadosIdentificados trabajador4=new EmpleadosIdentificados("Jack");
		System.out.println(trabajador1.devuelveDatos()+"\n"+trabajador2.devuelveDatos()+
				"\n"+trabajador3.devuelveDatos()+"\n"+trabajador4.devuelveDatos()+"\n");
		System.out.println(EmpleadosIdentificados.dameIdSiguiente());
	}
}
class EmpleadosIdentificados{
	
	public EmpleadosIdentificados(String nom) {
		nombre=nom;
		seccion="Administración";
		//METODO DE ASIGNAR CONSECUTIVAMENTE ID EN EL CONSTRUCTOR
		Id=IdSiguiente;
		IdSiguiente++;//Así el CONSTRUCTOR es el que se encarga de hacer el bucle
	}
	
	public void cambiaSeccion(String seccion) {//SETTER
		this.seccion=seccion;
	}
	public String devuelveDatos() {//GETTER
		return "El nombre es: "+nombre+", la sección es "+seccion+" y el Id="+Id;
	}
	
	public static String dameIdSiguiente() {//METODO STATIC Cómo
		return "El Id del próximo nuevo trabajador es: "+IdSiguiente;
		
	}
	private final String nombre;
	private String seccion;
	
	private int Id;//Todas las instancias de Empleados, tendrán una COPIA
	private static int IdSiguiente=1;//Sólo la clase EmpleadosIdentificados tendrá
	//una copia de esta variable estática
	
}

