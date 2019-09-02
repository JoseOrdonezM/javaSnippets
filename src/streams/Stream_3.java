package streams;
import java.io.*;

public class Stream_3 {

	public static void main(String[] args) {
		Escribir_Fichero accede_fichero=new Escribir_Fichero();
		accede_fichero.escribe();
	}
}
class Escribir_Fichero{
	
	public void escribe(){
		
		//String frase="Esto es una frase de prueba";
		String frase="Esto añade una frase de prueba al fichero existente";
		try {
			FileWriter escrito=new FileWriter("C:/Users/Jo/eclipse-workspace/javaSnippets/src/streams/ejemplo_viejo.txt",true);
			//Constructor que añade FRASE en el último char de un fichero existente
			
			for(int i=0;i<frase.length();i++) {
				escrito.write(frase.charAt(i));
			}
			escrito.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

