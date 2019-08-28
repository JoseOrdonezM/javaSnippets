package herInterfaceArraySort;

import java.util.Arrays;
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
		losEmpleados[4]=jefe_RRHH;
		losEmpleados[5]=new Jefatura("Paco el del Taco", 95000, 1999, 5, 26);
		Jefatura jefe_Supremo=(Jefatura) losEmpleados[5];
		jefe_Supremo.setIncentivo(100000);
		/*
		Esto desvela el uso de "instanceof"
		Empleado director_comercial=new Jefatura ("Humbertha",12000,2019,6,10);
		Comparable ejemplo=new Empleado("Ejemplina Pamplinas",9999,2020,1,1);
		if(director_comercial instanceof Empleado) {
			System.out.println("Jefatura hereda de Empleado");
		}
		if(ejemplo instanceof Comparable) {
			System.out.println("Jefatura implementa Comparable");
		}
		*/
		
		System.out.println(jefe_Supremo.tomar_decisiones("Dar más días de vacaciones a la gente"));
		
		System.out.println("El jefe: "+jefe_Supremo.dameNombre()+" tiene un bonus de: "+
		jefe_Supremo.establece_bonus(500));
		
		System.out.println(losEmpleados[3].dameNombre()+" tiene un bonus de: "+
		losEmpleados[3].establece_bonus(200));
		
		for (Empleado unEmpleadoCualquiera:losEmpleados) {
			unEmpleadoCualquiera.subeSueldo(5);
		}
		Arrays.sort(losEmpleados);
		for(Empleado unEmpleadoCualquiera:losEmpleados) {
			System.out.println("Nombre: "+unEmpleadoCualquiera.dameNombre()+" Sueldo: "
					+unEmpleadoCualquiera.dameSueldo()+"€ Fecha de Alta en Empresa "
					+unEmpleadoCualquiera.dameFechaContrato());
		}
	}

}

class Empleado implements Comparable <Empleado>, Trabajadores {//La otra opción es quitar<Empleado> y variar el @Override
	public Empleado (String nom, double sue,
						int agno, int mes, int dia) {
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		altaContrato=calendario.getTime();
		Id=IdSiguiente;
		IdSiguiente++;

	}
	public Empleado (String nom) {
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
	/*public int compareTo(Object miObjeto) {//Sobreescritura del interfaz Comparable
		
		Empleado otroEmpleado=(Empleado) miObjeto;//CASTING para que miObjeto sea
		//de tipo Empleado
		if (this.sueldo<otroEmpleado.sueldo) {
			return -1;
		}
		if (this.sueldo>otroEmpleado.sueldo) {
			return 1;
		}
		return 0;
	}*/
	
public int compareTo(Empleado e) {//Sobreescritura del interfaz Comparable
		
		//Empleado otroEmpleado=(Empleado) miObjeto;//CASTING para que miObjeto sea
		//de tipo Empleado
		if (sueldo<e.sueldo) {
			return -1;
		}
		if (sueldo>e.sueldo) {
			return 1;
		}
		return 0;
	}
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente=1;
	private int Id;
	@Override
	public double establece_bonus(double gratificacion) {
		
		return Trabajadores.bonus_base+gratificacion;
	}
	
}

class Jefatura extends Empleado implements Jefes {
	
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
	@Override
	public String tomar_decisiones(String decision) {
		
		return "Un miembro de la dirección ha tomado la siguiente decisión: "+decision;
	}
	@Override
	public double establece_bonus(double gratificacion) {
		double prima=2000;//Es sólo de Jefatura
				
		return Trabajadores.bonus_base+gratificacion+prima;
	}
		
	
}
