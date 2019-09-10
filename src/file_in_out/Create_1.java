package file_in_out;

import java.io.*;

public class Create_1 {

	public static void main(String[] args) {

		File newObjectDirectory=new File("C:"+File.separator+"Users"+File.separator+"Jo"+File.separator+"eclipse-workspace"+File.separator+"javaSnippets"+File.separator+"src"+File.separator+"file_in_out"+File.separator+"new_directory");

		newObjectDirectory.mkdir();
		
		
		File ruta=new File("C:"+File.separator+"Users"+File.separator+"Jo"+File.separator+"eclipse-workspace"+File.separator+"javaSnippets"+File.separator+"src"+File.separator+"file_in_out"+File.separator+"new_directory"+File.separator+"new_file.txt");

		String archivo_destino=ruta.getAbsolutePath();
		
		try {
			ruta.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Escribiendo accede_es=new Escribiendo();
		
		accede_es.escribir(archivo_destino);
		
	}

}

class Escribiendo{
	
	public void escribir(String ruta_archivo) {
		
		String frase="Esto es un ejemplo. A ver si sale";
		
		try {
			
			FileWriter escritura=new FileWriter(ruta_archivo);
			
			for(int i=0;i<frase.length();i++) {
				
				escritura.write(frase.charAt(i));
			}
			
			escritura.close();
			
		}catch(IOException e){
			
		}
		
	}
}
