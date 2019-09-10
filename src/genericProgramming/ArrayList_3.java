package genericProgramming;
import java.util.*;

public class ArrayList_3{
	
	public static void main(String[] args){
		
				
		ArrayList <Empleado3> listaEmpleados=new ArrayList<Empleado3>();
		
		listaEmpleados.add(new Empleado3("Jhon Jhonsonson", 45, 2500));
		listaEmpleados.add(new Empleado3("Jhon Jackson", 55, 2000));
		listaEmpleados.add(new Empleado3("Jack Jhonson", 25, 2600));
		listaEmpleados.add(new Empleado3("Jhon Jhonsonson", 45, 2500));
		listaEmpleados.add(new Empleado3("Jhon Jackson", 55, 2000));
		listaEmpleados.add(new Empleado3("Jack Jhonson", 25, 2600));
		listaEmpleados.add(new Empleado3("Jhon Jhonsonson", 45, 2500));
		listaEmpleados.add(new Empleado3("Jhon Jackson", 55, 2000));
		listaEmpleados.add(new Empleado3("Jack Jhonson", 25, 2600));
		listaEmpleados.add(new Empleado3("Jhon Jhonsonson", 45, 2500));
		listaEmpleados.add(new Empleado3("Turuta Marquesa", 55, 2000));
		listaEmpleados.add(new Empleado3("Cocolisa More", 55, 2000));

		//CONVERTIR A array normal:
		//Instancia un array con dimensión la de la lista y llena de objetos Empleado3
		Empleado3 arrayEmpleados[]=new Empleado3[listaEmpleados.size()];
		
		listaEmpleados.toArray(arrayEmpleados);//ASÍ los convierte en array de Empleados3
		
		for(Empleado3 unempleadoCualquiera:arrayEmpleados){
			System.out.println(unempleadoCualquiera.dameDatos());
		}
	}
}
class Empleado3{
	
	public Empleado3 (String nombre, int edad, double salario){
		
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

