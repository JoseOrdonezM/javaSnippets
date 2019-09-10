package genericProgramming;
import java.util.*;

public class ArrayList_4_iterator{
	
	public static void main(String[] args){
		
				
		ArrayList <Empleado4> listaEmpleados=new ArrayList<Empleado4>();
		
		listaEmpleados.add(new Empleado4("Jhon Jhonsonson", 45, 2500));
		listaEmpleados.add(new Empleado4("Jhon Jackson", 55, 2000));
		listaEmpleados.add(new Empleado4("Jack Jhonson", 25, 2600));
		listaEmpleados.add(new Empleado4("Jhon Jhonsonson", 45, 2500));
		listaEmpleados.add(new Empleado4("Jhon Jackson", 55, 2000));
		listaEmpleados.add(new Empleado4("Jack Jhonson", 25, 2600));
		listaEmpleados.add(new Empleado4("Jhon Jhonsonson", 45, 2500));
		listaEmpleados.add(new Empleado4("Jhon Jackson", 55, 2000));
		listaEmpleados.add(new Empleado4("Jack Jhonson", 25, 2600));
		listaEmpleados.add(new Empleado4("Jhon Jhonsonson", 45, 2500));
		listaEmpleados.add(new Empleado4("Turuta Marquesa", 55, 2000));
		listaEmpleados.add(new Empleado4("Cocolisa More", 55, 2000));

		//Crea un objeto Iterator:
		
		Iterator <Empleado4> mi_iterador=listaEmpleados.iterator();
		
		while(mi_iterador.hasNext()) {//recorre el arrayList sacando objetos Empleado4 y llamando al metodo dameDatos
			System.out.println(mi_iterador.next().dameDatos());
		}
	}
		
}
class Empleado4{
	
	public Empleado4 (String nombre, int edad, double salario){
		
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
	}
	
	public String dameDatos(){
		
		return "El empleado se llama "+nombre+". Tiene "+edad+" años. Y un salario de "+salario;
		}
	
		private String nombre;
		private int edad;
		private double salario;
}

