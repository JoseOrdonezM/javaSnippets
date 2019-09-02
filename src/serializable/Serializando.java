package serializable;

import java.util.*;

import java.io.*;

public class Serializando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Administrador jefe=new Administrador("Juan", 80000, 2005,12,15);
		
		jefe.setIncentivo(5000);
		
		
		Empleado[] personal=new Empleado[3];
		
		personal[0]=jefe;
		
		personal[1]=new Empleado("Ana", 25000, 2008, 10,1);
		
		personal[2]=new Empleado("Luis", 18000, 2012, 9,15);
		
		try {
			//serializa el objeto empleado y lo mete en un archivo
			ObjectOutputStream escribir_fichero=new ObjectOutputStream(new FileOutputStream("C:/Users/Jo/eclipse-workspace/javaSnippets/src/serializable/empleado.dat"));
			//el constructor ObjectOutputStream pide un objeto tipo outputstream, que será el flujo (stream) de salida al fichero determinado (empleado.dat)
			//por heredar directamente de OOS, la instancia directamente dentro del nuevo objeto OOS
			escribir_fichero.writeObject(personal);
			
			escribir_fichero.close();
			
			//recupera el objeto desde el archivo, a través del objeto ObjectInputStream
			ObjectInputStream recupera_fichero=new ObjectInputStream(new FileInputStream("C:/Users/Jo/eclipse-workspace/javaSnippets/src/serializable/empleado.dat"));
			//Ahora tiene que meter en un objeto el array que va a leer en ese fichero. Como es un obj de tipo empleado, lo crea
			Empleado[] empleado_recuperado=(Empleado[]) recupera_fichero.readObject();
			//El objeto devuelto a través de OIS es un obj Object, por lo que tendrá que HACER UN CASTING:(Empleado[]) para convertirlo a Empleado
			recupera_fichero.close();
			//ahora recorre el array empleado_recuperado[] con un foreach para ver lo que se ha traido
			for(Empleado e:empleado_recuperado) {
				System.out.println(e);
			}
			
		}catch(Exception e) {
			
		}
	}

}

//-----------------------------------------------------------------------------------------------------------

class Empleado implements Serializable {
	
	
	
	public Empleado(String n, double s, int agno, int mes, int dia){
		
		nombre=n;
		
		sueldo=s;
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1,dia);
		
		fechaContrato=calendario.getTime();
		
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	
	public void subirSueldo(double porcentaje){
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
		
	}
	
	public String toString(){//Con el toString permites devolver info relativa a la clase sólo llamando al método de la clase Empleado
		
		return "El Nombre es =" + nombre + ",y su sueldo es =" + sueldo + ", fecha de contrato=" + fechaContrato;
		
	}

	private String nombre;
	
	private double sueldo;
	
	private Date fechaContrato;
	
}

//--------------------------------------------------------------------------------------------------------

class Administrador extends Empleado{
	
	

		public Administrador(String n, double s, int agno, int mes, int dia){
			
			super(n,s,agno,mes,dia);
			
			incentivo=0;
			
		}
		
		public double getSueldo(){
			
			double sueldoBase=super.getSueldo();
			
			return sueldoBase + incentivo;
			
		}
		
		public void setIncentivo(double b){
			
			incentivo=b;
		}
		
		
		public String toString(){//Con el toString permites devolver info relativa a la clase sólo llamando al método de la clase Administrador
			
			return super.toString() + "y su Incentivo es=" + incentivo;
			
		}
	
		private double incentivo;
	
}

