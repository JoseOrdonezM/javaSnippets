package poo;

public class coche1 {
	private int ruedas;
	private float largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	
	String color;
	
	private int peso_total;
	boolean asientos_cuero,climatizador;
	
	public coche1 () {
		ruedas=4;
		largo=4500;
		ancho=200;
		motor=1200;
		peso_plataforma=500;
	}
	public String getLarge() {//getter
		return "El largo del coche es "+largo;
	}
	public void setColor() {//setter
		color="azul";
	}
	public String getColor() {//getter
		return "El color del coche es "+color;
	}
	
}
