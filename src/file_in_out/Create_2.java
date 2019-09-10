package file_in_out;

import java.io.*;

public class Create_2 {

	public static void main(String[] args) {

		File newObjectDirectory=new File("C:"+File.separator+"Users"+File.separator+"Jo"+File.separator+"eclipse-workspace"+File.separator+"javaSnippets"+File.separator+"src"+File.separator+"file_in_out"+File.separator+"new_directory");

		//newObjectDirectory.mkdir();
		
		
		File pathToNewFile=new File("C:"+File.separator+"Users"+File.separator+"Jo"+File.separator+"eclipse-workspace"+File.separator+"javaSnippets"+File.separator+"src"+File.separator+"file_in_out"+File.separator+"new_directory"+File.separator+"new_file.txt");

		String path_to_string=pathToNewFile.getAbsolutePath();
		
		try {
			pathToNewFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		WritingToFile aWriteToFile=new WritingToFile();
		
		aWriteToFile.writting(path_to_string);
		
	}

}

class WritingToFile{
	
	public void writting(String path_file) {
		
		String some_text="Esto es un ejemplo. A ver si sale";
		
		try {
			
			FileWriter someWrite=new FileWriter(path_file);
			
			for(int i=0;i<some_text.length();i++) {
				
				someWrite.write(some_text.charAt(i));
			}
			
			someWrite.close();
			
		}catch(IOException e){
			
		}
		
	}
}
