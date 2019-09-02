package exceptions;
import javax.swing.JOptionPane;
public class exception_THROW_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String mail=JOptionPane.showInputDialog("Introduce un email válido");
		try {
			examina_mail(mail);
		} catch (ArrayIndexOutOfBoundsException e) {
			/* TODO Auto-generated catch block
			e.printStackTrace();*/
			System.out.println("Te he dicho que sea un email válido, MELÓN");
		}
	}
	static void examina_mail(String mail) throws ArrayIndexOutOfBoundsException{
		int arroba=0;
		boolean punto=false;
		if(mail.length()<=3) {//THROW una excepción de tu gusto<-<-<-<-<-<-<-<-<-<-<-<
			/*ArrayIndexOutOfBoundsException mi_excepcion=new ArrayIndexOutOfBoundsException();
			throw mi_excepcion;*/
			throw new ArrayIndexOutOfBoundsException();
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
}}
}

