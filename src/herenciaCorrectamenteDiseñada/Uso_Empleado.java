package herenciaCorrectamenteDiseñada;
import java.util.Date;
import java.util.GregorianCalendar;



public class Uso_Empleado {
	public static void main(String[] args) {
		Jefatura jefe_RRHH=new Jefatura("Jhon Doe", 55000, 2006, 9, 25);
		jefe_RRHH.setIncentivo(2570);
		Empleado[] losEmpleados=new Empleado[6];
		losEmpleados[0]=new Empleado("Jhon Jhonsonson", 30000, 1990, 12, 17);
		losEmpleados[1]=new Empleado("Jhon Jackson", 50000, 1995, 6, 2);
		losEmpleados[2]=new Empleado("Jack Jhonson", 25000, 2002, 3, 15);
		losEmpleados[3]=new Empleado("McKeihan Grömenaüer");
		losEmpleados[4]=jefe_RRHH;//Polimorfismo: Cumple la regla "Es un..."
		//Como espera un Empleado(objeto de la superclase),admite un
		//Jefatura(objeto de la subclase)
		losEmpleados[5]=new Jefatura("Paco el del Taco", 95000, 1999, 5, 26);
		
		Jefatura jefe_Supremo=(Jefatura) losEmpleados[5];//CASTING para que Paco sea
		//de la clase Jefatura y se pueda acceder al método incentivo 
		jefe_Supremo.setIncentivo(100000);
				
		for (Empleado unEmpleadoCualquiera:losEmpleados) {
			unEmpleadoCualquiera.subeSueldo(5);
		}
		for(Empleado unEmpleadoCualquiera:losEmpleados) {
			System.out.println("Nombre: "+unEmpleadoCualquiera.dameNombre()+" Sueldo: "
					+unEmpleadoCualquiera.dameSueldo()+"€ Fecha de Alta en Empresa "
					+unEmpleadoCualquiera.dameFechaContrato());
		}
		

	}

}

class Empleado {
	public Empleado (String nom, double sue,
						int agno, int mes, int dia) {
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		altaContrato=calendario.getTime();
		//METODO DE ASIGNAR CONSECUTIVAMENTE ID EN EL CONSTRUCTOR
		Id=IdSiguiente;
		IdSiguiente++;//Así el CONSTRUCTOR es el que se encarga de hacer el bucle
			
	}
	public Empleado (String nom) {//CONSTRUCTOR SOBRECARGADO:por si sólo sabemos
		//el nombre del trabajador
		this(nom, 30000, 2000, 12, 01);
	}
	public String dameNombre() {//getter
		return nombre+" Id: "+Id;
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
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente=1;
	private int Id;
}

class Jefatura extends Empleado {
	
	public Jefatura(String nom, double sue,
			int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
	}
	public void setIncentivo(double b) {//SETTER
		incentivo=b;
	}
	public double dameSueldo() {//GETTER
		double sueldoJefe=super.dameSueldo();
		return sueldoJefe+incentivo;
	}
	private double incentivo;
		
	
}
