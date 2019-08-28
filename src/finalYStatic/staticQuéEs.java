package finalYStatic;

public class staticQuéEs {

	public static void main(String[] args) {
		/*EmpleadosId trabajador1=new EmpleadosId("Francisco",1);
		EmpleadosId trabajador2=new EmpleadosId("Anita Dinamita",2);*/
		EmpleadosId trabajador1=new EmpleadosId("Francisco");
		EmpleadosId trabajador2=new EmpleadosId("Anita Dinamita");
		trabajador1.cambiaSeccion("RRHH");
		EmpleadosId trabajador3=new EmpleadosId("Manolito");
		System.out.println(trabajador1.devuelveDatos());
		EmpleadosId.Id++;
		System.out.println(trabajador2.devuelveDatos());
		EmpleadosId.Id++;
		System.out.println(trabajador3.devuelveDatos());
		//Esta solución es penosa.	
	}

}
class EmpleadosId{//NOTA:Todos los empleados empiezan en ADMON.
	
	/*public EmpleadosId(String nom, int Id) {
		nombre=nom;
		seccion="Administración";
		this.Id=Id;
	}*/
	
	public EmpleadosId(String nom) {
		nombre=nom;
		seccion="Administración";
		Id=1;
	}
	
	public void cambiaSeccion(String seccion) {//SETTER
		this.seccion=seccion;
	}
	public String devuelveDatos() {//GETTER
		return "El nombre es: "+nombre+", la sección es "+seccion+" y el Id="+Id;
	}
	private final String nombre;
	private String seccion;
	//private final int Id;
	public static int Id;
}