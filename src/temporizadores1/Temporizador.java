package temporizadores1;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;

public class Temporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DameLaHora oyente=new DameLaHora();
		
		//ActionListener oyente=new DameLaHora();//Otra forma en la que aprovecha la implementación
		//el interfaz ActionListener en la clase DameLaHora para instanciarla
		
		Timer miTemporizador=new Timer(5000,oyente);

		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para Detenerme");
		
		System.exit(0);
		
	}

}
class DameLaHora implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		
		Date ahora=new Date();
		System.out.println("Te pongo la hora cada 5 segundos: "+ahora);
		
		Toolkit.getDefaultToolkit().beep();//Beep cuando imprima la hora
		
	}
}