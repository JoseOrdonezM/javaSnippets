package genericProgramming;

public class genericClass<T>{
	public genericClass() {
		first=null;
	}
	public void setFirst(T newValue) {
		first=newValue;
	}
	public T getFirst() {
		return first;
	}
	private T first;
	
}
