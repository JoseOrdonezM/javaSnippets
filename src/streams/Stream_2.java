package streams;
import java.io.*;

public class Stream_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leer_Fichero2 accediendo=new Leer_Fichero2();
		accediendo.lee();
	}
}
class Leer_Fichero2{
	
	FileReader entrada;
	
	public void lee(){
		
		try {
			entrada=new FileReader("C:/Users/Jo/eclipse-workspace/javaSnippets/src/streams/ejemplo.txt");
			
			//int c=entrada.read();//ASí evitas comerte el primer char del file
			int c=0;
						
			while(c != -1){
				
				c=entrada.read();//esta será la primera lectura del file
				
				char letra=(char)c;
				
				System.out.print(letra);
			}
		//entrada.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No he encontrado el archivo");
		}finally {
			try {
				entrada.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
