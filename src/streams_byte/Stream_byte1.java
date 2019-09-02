package streams_byte;
import java.io.*;

public class Stream_byte1 {

	public static void main(String[] args) {
		
		int contador=0;
		
		int datos_entrada[]=new int[69330];
				
		try {
			FileInputStream archivo_lectura=new FileInputStream("C:/Users/Jo/eclipse-workspace/javaSnippets/src/streams_byte/imagen.jpg");
			
			boolean final_archivo=false;
			
			while(!final_archivo) {
				
				int byte_entrada=archivo_lectura.read();
				
				if(byte_entrada!=-1) {
					
					datos_entrada[contador]=byte_entrada;
				}
				
				else {
					
					final_archivo=true;
					
				}
				//System.out.println(byte_entrada);//Esto es útil para saber cuanto vale contador y poner
													//el array con ese tamaño
				System.out.println(datos_entrada[contador]);
				
				contador++;
				
			}
			
			archivo_lectura.close();
			
		}catch(IOException e){
			
			System.out.println("Error al acceder al archivo");//e.printStackTrace();
			
			}
		
		System.out.println(contador);
		
		crea_fichero(datos_entrada);
	}
	
	static void crea_fichero(int datos_nuevo_fichero[]) {
		
		try {
			
			FileOutputStream fichero_nuevo=new FileOutputStream("C:/Users/Jo/eclipse-workspace/javaSnippets/src/streams_byte/imagen_copia.jpg");
			
			for(int i=0;i<datos_nuevo_fichero.length;i++) {
				
			
				fichero_nuevo.write(datos_nuevo_fichero[i]);
				
			}
				
				fichero_nuevo.close();
				
		}catch(IOException e) {
			
			System.out.println("Error al escribir en el archivo");
			
		}
	}
}
