package exceptions;
import javax.swing.JOptionPane;

public class exception_THROW_2 {

	public static void main(String[] args) {
		
		String mail=JOptionPane.showInputDialog("Introduce un email válido");
			examina_mail(mail);//El metodo arroja una instancia de una clase que HEREDA de RuntimeException(Exc.no comprobada)
			//Si HEREDASE de Exception (Exc.comprobada) te pediría bloque TRY-CATCH para controlar lo que throws

//		try {
//			examina_mail(mail);
//		} catch (Exception e) {
//			/* TODO Auto-generated catch block
//			e.printStackTrace();*/
//			System.out.println("Te he dicho que sea un email válido, MELÓN");
//			e.printStackTrace();
//		}
	}
	static void examina_mail(String mail) throws Longitud_mail_erronea{
		int arroba=0;
		boolean punto=false;
		if(mail.length()<=3) {//THROW una excepción detallada<-<-<-<-<-<-<-<-<-<-<-<
			throw new Longitud_mail_erronea("El email es demasiado corto");
		}
		else {
			
		for (int i=0; i<mail.length();i++) {
			
			if(mail.charAt(i)=='@') {
				arroba++;
			}
			if(mail.charAt(i)=='.') {
				punto=true;
			}
	}

		if (arroba==1 && punto==true) {
				System.out.println("Es correcto");
			}
			else {
				System.out.println("Está mal, tío");
			}
		}
	}
}

class Longitud_mail_erronea extends RuntimeException{//Las clases que generan excepciones DEBEN TENER 2 constructores
	
	public Longitud_mail_erronea() {}//Constructor vacío
	public Longitud_mail_erronea(String msj_error) {//Constructor con mensaje
		super(msj_error);
	}
}