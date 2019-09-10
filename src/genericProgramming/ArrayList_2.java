package genericProgramming;
import java.util.*;

public class ArrayList_2{
	
	public static void main(String[] args){
		
				
		ArrayList <Empleado2> listaEmpleados=new ArrayList<Empleado2>();

		//listaEmpleados.ensureCapacity(11);
		
		listaEmpleados.add(new Empleado2("Jhon Jhonsonson", 45, 2500));
		listaEmpleados.add(new Empleado2("Jhon Jackson", 55, 2000));
		listaEmpleados.add(new Empleado2("Jack Jhonson", 25, 2600));
		listaEmpleados.add(new Empleado2("Jhon Jhonsonson", 45, 2500));
		listaEmpleados.add(new Empleado2("Jhon Jackson", 55, 2000));
		listaEmpleados.add(new Empleado2("Jack Jhonson", 25, 2600));
		listaEmpleados.add(new Empleado2("Jhon Jhonsonson", 45, 2500));
		listaEmpleados.add(new Empleado2("Jhon Jackson", 55, 2000));
		listaEmpleados.add(new Empleado2("Jack Jhonson", 25, 2600));
		listaEmpleados.add(new Empleado2("Jhon Jhonsonson", 45, 2500));
		listaEmpleados.add(new Empleado2("Turuta Marquesa", 55, 2000));
		listaEmpleados.add(new Empleado2("Cocolisa More", 55, 2000));
		//listaEmpleados.trimToSize();
		
		//Para reordenar el arrayList al añadir
		listaEmpleados.set(0, new Empleado2("La Primera", 99, 1001));
		
		System.out.println(listaEmpleados.size());

		for(Empleado2 unEmpleadoCualquiera:listaEmpleados){//MEJOR QUE UN FOR normal
			System.out.println(unEmpleadoCualquiera.dameDatos());
		}
		
		/*for(int i=0; i<listaEmpleados.size();i++){//FOR normal es más complicado
			Empleado2 e=listaEmpleados.get(i);
			System.out.println(e.dameDatos());
		}*/
		
		
		//Si queremos extraer una posición determinada ()LA ONCE:
		System.out.println("La nº ONCE es: "+listaEmpleados.get(10).dameDatos());
		//OJO: ese get devuelve un objeto, tienes que aplicarle un método para ver los datos
		
	}
}
class Empleado2{
	
	public Empleado2 (String nombre, int edad, double salario){
		
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

