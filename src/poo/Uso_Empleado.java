package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Empleado empleado01=new Empleado("Jhon Jhonsonson", 85000, 1990, 12, 17);
		Empleado empleado02=new Empleado("Jhon Jackson", 95000, 1995, 6, 2);
		Empleado empleado03=new Empleado("Jack Jhonson", 105000, 2002, 3, 15);
		empleado01.subeSueldo(5);
		empleado02.subeSueldo(5);
		empleado03.subeSueldo(5);
		System.out.println("Nombre: "+empleado01.dameNombre()+" Sueldo: "
				+empleado01.dameSueldo()+"€ Fecha de Alta en Empresa "
				+empleado01.dameFechaContrato());
		System.out.println("Nombre: "+empleado02.dameNombre()+" Sueldo: "
				+empleado02.dameSueldo()+"€ Fecha de Alta en Empresa "
				+empleado02.dameFechaContrato());
		System.out.println("Nombre: "+empleado03.dameNombre()+" Sueldo: "
						+empleado03.dameSueldo()+"€ Fecha de Alta en Empresa "
						+empleado03.dameFechaContrato());*/
		
		Empleado[] losEmpleados=new Empleado[3];
		losEmpleados[0]=new Empleado("Jhon Jhonsonson", 85000, 1990, 12, 17);
		losEmpleados[1]=new Empleado("Jhon Jackson", 95000, 1995, 6, 2);
		losEmpleados[2]=new Empleado("Jack Jhonson", 105000, 2002, 3, 15);
		
		/*for (int i = 0; i < losEmpleados.length; i++) {//Mejora el bucle
			losEmpleados[i].subeSueldo(5);
		}*/
		for (Empleado unEmpleadoCualquiera:losEmpleados) {
			unEmpleadoCualquiera.subeSueldo(5);
		}
		/*for (int i = 0; i < 3; i++) {//Mejora el bucle
			System.out.println("Nombre: "+losEmpleados[i].dameNombre()+" Sueldo: "
				+losEmpleados[i].dameSueldo()+"€ Fecha de Alta en Empresa "
				+losEmpleados[i].dameFechaContrato());
		}*/
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