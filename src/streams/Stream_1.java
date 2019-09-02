package streams;
import java.io.*;

public class Stream_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Leer_Fichero accediendo=new Leer_Fichero();
		
		accediendo.lee();
		
	}
	
}
class Leer_Fichero{
	public void lee(){
		
		try {
			FileReader entrada=new FileReader("C:/Users/Jo/eclipse-workspace/javaSnippets/src/streams/ejemplo.txt");
			
			int c=entrada.read();
			
			while(c != -1){
				
				c=entrada.read();
				
				char letra=(char)c;
				
				System.out.print(letra);
			}
		//entrada.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No he encontrado el archivo");
		}
	}
	
}
