package temporizadores1;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class TemporzdrInnerLOCALClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Reloj2 mireloj=new Reloj2(2000,true); Sustituye los valores y se los pasa a la instancia del objeto
//		mireloj.enMarcha();
		Reloj2 mireloj=new Reloj2();
		mireloj.enMarcha(2000, true);
		
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar");
		System.exit(0);
		
	}

}

class Reloj2{
//	public Reloj2(int intervalo, boolean sonido) { Elimina el constructor de la clase para usar el constructor en el MAIN por defecto
//		this.intervalo=intervalo;
//		this.sonido=sonido;
//	}
	public void enMarcha(int intervalo, final boolean sonido) {// intervalo no es accedido por la clase interna, así que no es necesario que sea FINAL sonido SÍ
		
		class DameLaHora2 implements ActionListener{
			public void actionPerformed(ActionEvent evento){
				Date ahora=new Date();
				System.out.println("Esta es la hora cada 2 sg: "+ahora);
				if(sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}
		ActionListener oyente=new DameLaHora2();
		Timer miTemporizador=new Timer(intervalo,oyente);
		miTemporizador.start();
	}
//	private int intervalo;
//	private boolean sonido;
	
}