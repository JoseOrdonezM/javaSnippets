package file_in_out;

import java.io.*;

public class Create_3 {

	public static void main(String[] args) {

		try (FileWriter fw=new FileWriter("C:"+File.separator+"Users"+File.separator+"Jo"+File.separator+"eclipse-workspace"
		+File.separator+"javaSnippets"+File.separator+"src"+File.separator+"file_in_out"+File.separator+"new_directory"+File.separator
		+"new_file.txt", true))//Así se cierra el stream sólo y además permite escribir al final del archivo, no machacando el contenido
		{
			WritingToFileToo(fw);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
		

	public static void WritingToFileToo(FileWriter fw) throws IOException{//Así usa un método en vez de una clase
	
		fw.write("Esto es un ejemplo. A ver si sale");
	}
}
	
	
