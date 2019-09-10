package genericProgramming;

public class usingGenericClass {
	
	public static void main(String[] args) {
	
	genericClass<String> oneInstance=new genericClass<String>();
	oneInstance.setFirst("Jhon");
	System.out.println(oneInstance.getFirst());
	
	
	Person aPerson=new Person("Ann");
	genericClass<Person> otherInstance=new genericClass<Person>();
	otherInstance.setFirst(aPerson);
	System.out.println(otherInstance.getFirst());
		
	}
}
class Person{
	public Person(String nombre) {
		this.name=nombre;
	}
	/*public String toString() {//Sobreescribe el método para convertir el objeto otra
		//convertido en String
		return name;
	}*///Si lo comentas, te da un objeto tipo Person
	private String name;
}