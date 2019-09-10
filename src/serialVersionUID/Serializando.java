package serialVersionUID;

import java.util.*;

import java.io.*;

public class Serializando {

	public static void main(String[] args) {
		
		
		Administrador jefe=new Administrador("Juan", 80000, 2005,12,15);
		
		jefe.setIncentivo(5000);
		
		
		Empleado[] personal=new Empleado[3];
		
		personal[0]=jefe;
		
		personal[1]=new Empleado("Ana", 25000, 2008, 10,1);
		
		personal[2]=new Empleado("Luis", 18000, 2012, 9,15);
		
		try {//este empleado.dat no es generado por esta versión del codigo. cambiamos la constante de sueldo de empleado para que haya una nueva versión del código
			
			/*ObjectOutputStream escribir_fichero=new ObjectOutputStream(new FileOutputStream("C:/Users/Jo/eclipse-workspace/javaSnippets/src/serialVersionUID/empleado.v.2.dat"));

			escribir_fichero.writeObject(personal);
			
			escribir_fichero.close();*/
			
			ObjectInputStream recupera_fichero=new ObjectInputStream(new FileInputStream("C:/Users/Jo/eclipse-workspace/javaSnippets/src/serialVersionUID/empleado.v.2.dat"));

			Empleado[] empleado_recuperado=(Empleado[]) recupera_fichero.readObject();

			recupera_fichero.close();

			for(Empleado e:empleado_recuperado) {
				System.out.println(e);
			}
			
		}catch(Exception e) {
			
		}
	}

}

//-----------------------------------------------------------------------------------------------------------

class Empleado implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//con esta huella en cada clase que implements Serializable, no hay problemas al leer objetos serializable

	public Empleado(String n, double s, int agno, int mes, int dia){
		
		nombre=n;
		
		sueldoss=s;
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1,dia);
		
		fechaContrato=calendario.getTime();
		
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public double getSueldo() {
		return sueldoss;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	
	public void subirSueldo(double porcentaje){
		
		double aumento=sueldoss*porcentaje/100;
		
		sueldoss+=aumento;
		
	}
	
	public String toString(){
		
		return "El Nombre es =" + nombre + ",y su sueldo es =" + sueldoss + ", fecha de contrato=" + fechaContrato;
		
	}

	private String nombre;
	
	private double sueldoss;
	
	private Date fechaContrato;
	
}

//--------------------------------------------------------------------------------------------------------

class Administrador extends Empleado{
	
	

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//si cambiasemos ese nº, no podría leerlo

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
		
		
		public String toString(){
			
			return super.toString() + "y su Incentivo es=" + incentivo;
			
		}
	
		private double incentivo;
	
}

