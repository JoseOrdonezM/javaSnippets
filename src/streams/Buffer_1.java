package streams;
import java.io.*;

public class Buffer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Leer_Buffer accediendo=new Leer_Buffer();
		
		accediendo.lee();
		
	}
	
}
class Leer_Buffer{
	
	FileReader entrada;
	
	public void lee(){
		
		try {
			entrada=new FileReader("C:/Users/Jo/eclipse-workspace/javaSnippets/src/streams/tocho.txt");
			
			BufferedReader mibuffer=new BufferedReader(entrada);
			String linea="";
						
			while(linea!=null){
				
				linea=mibuffer.readLine();
				
				if(linea!=null) {

					System.out.println(linea);
				}
				
			}
		//entrada.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No he encontrado el archivo");
		}
	}
	
}
