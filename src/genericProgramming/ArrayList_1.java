package genericProgramming;
import java.util.*;

public class ArrayList_1{
	
	public static void main(String[] args){
		
		/*Empleado[] listaEmpleados=new Empleado[3];		
		listaEmpleados[0]=new Empleado("Jhon Jhonsonson", 45, 2500);
		listaEmpleados[1]=new Empleado("Jhon Jackson", 55, 2000);
		listaEmpleados[2]=new Empleado("Jack Jhonson", 25, 2600);*///Sustitución por ArrayList
		
		ArrayList <Empleado> listaEmpleados=new ArrayList<Empleado>();//Instancia directamente la clase en la
		//declaración del ArrayList. OJO:Constructor por defecto. Hay más
		listaEmpleados.ensureCapacity(11);
		
		listaEmpleados.add(new Empleado("Jhon Jhonsonson", 45, 2500));
		listaEmpleados.add(new Empleado("Jhon Jackson", 55, 2000));
		listaEmpleados.add(new Empleado("Jack Jhonson", 25, 2600));
		listaEmpleados.add(new Empleado("Jhon Jhonsonson", 45, 2500));
		listaEmpleados.add(new Empleado("Jhon Jackson", 55, 2000));
		listaEmpleados.add(new Empleado("Jack Jhonson", 25, 2600));
		listaEmpleados.add(new Empleado("Jhon Jhonsonson", 45, 2500));
		listaEmpleados.add(new Empleado("Jhon Jackson", 55, 2000));
		listaEmpleados.add(new Empleado("Jack Jhonson", 25, 2600));
		listaEmpleados.add(new Empleado("Jhon Jhonsonson", 45, 2500));
		listaEmpleados.add(new Empleado("Turuta Marquesa", 55, 2000));
		//Al haber escedido el tamaño por defecto de 10, has hecho que internamente haga una copia del ArrayList
		//por lo que consumes más recursos de la cuenta. Esto se evita con:ensureCapacity
		//Si te vuelves a exceder de 11, vuelves a consumir más recursos de lo adecuado
		
		listaEmpleados.trimToSize();
		//Esta solución permite al GC no gastar más memoria en el arrayList
		listaEmpleados.add(new Empleado("Cocolisa More", 55, 2000));
		//Sólo usar cuando estás seguro que no crecerá más. Si vuelves a esceder el límite, te lo permitirá
		
		System.out.println(listaEmpleados.size());

		for(Empleado unEmpleadoCualquiera:listaEmpleados){
			System.out.println(unEmpleadoCualquiera.dameDatos());
		}
	}
}
class Empleado{
	
	public Empleado (String nombre, int edad, double salario){
		
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

