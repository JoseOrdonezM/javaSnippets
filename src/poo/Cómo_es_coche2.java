package poo;

import javax.swing.JOptionPane;

public class Cómo_es_coche2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coche2 Skoda=new coche2();
		Skoda.setColor(JOptionPane.showInputDialog("Introduce color"));
		//Skoda.color="rosa";//NO COMPILA
		System.out.println(Skoda.getData());
		System.out.println(Skoda.getColor());
		Skoda.setSeating(JOptionPane.showInputDialog("Asientos de cuero on/off"));
		System.out.println(Skoda.getSeating());
		Skoda.setClimate(JOptionPane.showInputDialog("Climatizador on/off"));
		System.out.println(Skoda.getClimate());
		System.out.println(Skoda.getPeso_Total());
		System.out.println("El precio del coche es "+Skoda.precio_coche());
		
	}

}
