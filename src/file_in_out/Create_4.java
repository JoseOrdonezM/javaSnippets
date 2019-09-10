package file_in_out;
import java.io.*; 
public class Create_4 {

	public static void main(String[] args) {
        try(FileWriter fw=new FileWriter("C:"+File.separator+"Users"+File.separator+"Jo"+File.separator+"eclipse-workspace"
        	+File.separator+"javaSnippets"+File.separator+"src"+File.separator+"file_in_out"+File.separator+"new_directory"
        	+File.separator+"new_file.txt", true);
            FileReader fr=new FileReader("C:"+File.separator+"Users"+File.separator+"Jo"+File.separator+"eclipse-workspace"
        	+File.separator+"javaSnippets"+File.separator+"src"+File.separator+"file_in_out"+File.separator+"new_directory"
        	+File.separator+"new_file.txt"))
        	////Así se cierra el stream sólo y además permite escribir al final del archivo, no machacando el contenido
        	{//Escribimos en el fichero un String y un caracter 97 (a)
            fw.write("Esto es una prueb");
            fw.write(97);
            //Guardamos los cambios del fichero
            fw.flush();
            /*¿Porqué? La respuesta es que  cuando se cierra el stream, es como si pincháramos en guardar de forma gráfica, es decir,
             * que si no cerramos el stream es como si el fichero estuviera vacio. También debemos tener en cuenta que esto se debe
             * a que leemos y modificamos el mismo fichero en el mismo tiempo.
			¿Entonces que podemos hacer? Podemos hacer con fw.close o podemos usar el método flush() de FileWriter que hace que se guarden los cambios.*/
            //Leemos el fichero y lo mostramos por pantalla
            int valor=fr.read();
            while(valor!=-1){
                System.out.print((char)valor);
                valor=fr.read();
            }
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }
    }
}
