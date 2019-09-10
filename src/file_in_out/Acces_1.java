package file_in_out;

import java.io.*;

public class Acces_1 {

	public static void main(String[] args) {

		File ruta=new File("C:"+File.separator+"Users"+File.separator+"Jo"+File.separator+"eclipse-workspace"+File.separator+"javaSnippets"+File.separator+"src");
		//Evita incompatibilidad con linux
		System.out.println(ruta.getAbsolutePath());
		
		String[] lista_archivos=ruta.list();//Crea un array de strings con el listado
		
		for(int i=0;i<lista_archivos.length;i++) {
			
			System.out.println(lista_archivos[i]);
			
			File full_route=new File(ruta.getAbsoluteFile(),lista_archivos[i]);//Almacena las direcciones completas de cada elemento, sea lo que sea
			
			if(full_route.isDirectory()) {//Sólo si es carpeta
				
					String[] lista_archivos_subcarpeta=full_route.list();
					
					for(int j=0;j<lista_archivos_subcarpeta.length;j++) {
						
						System.out.println(lista_archivos_subcarpeta[j]);
						
					}
			}
		}
		
	}

}
