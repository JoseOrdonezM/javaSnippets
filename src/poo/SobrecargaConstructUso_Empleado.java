package poo;
import java.util.Date;
import java.util.GregorianCalendar;
public class SobrecargaConstructUso_Empleado {

	public static void main(String[] args) {
		Employ[] losEmpleados=new Employ[4];
		losEmpleados[0]=new Employ("Jhon Jhonsonson", 85000, 1990, 12, 17);
		losEmpleados[1]=new Employ("Jhon Jackson", 95000, 1995, 6, 2);
		losEmpleados[2]=new Employ("Jack Jhonson", 105000, 2002, 3, 15);
		losEmpleados[3]=new Employ("McKeihan Grömenaüer");
		
		for (Employ unEmpleadoCualquiera:losEmpleados) {
			unEmpleadoCualquiera.subeSueldo(5);
		}
		for(Employ unEmpleadoCualquiera:losEmpleados) {
			System.out.println("Nombre: "+unEmpleadoCualquiera.dameNombre()+" Sueldo: "
					+unEmpleadoCualquiera.dameSueldo()+"€ Fecha de Alta en Empresa "
					+unEmpleadoCualquiera.dameFechaContrato());
		}
		
	}

}

class Employ {
	public Employ (String nom, double sue,
						int agno, int mes, int dia) {
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		altaContrato=calendario.getTime();
	}
	public Employ (String nom) {//CONSTRUCTOR SOBRECARGADO:por si sólo sabemos
		//el nombre del trabajador
		this(nom, 30000, 2000, 12, 01);
	}
	public String dameNombre() {//getter
		return nombre;
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
}