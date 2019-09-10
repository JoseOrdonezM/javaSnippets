package file_in_out;
import java.io.*;

public class Routes_1 {

	public static void main(String[] args) {

		File archivo=new File("Ejemplo_archivo");
		
		System.out.println(archivo.getAbsolutePath());
		
		System.out.println(archivo.exists());
		
	}

}
