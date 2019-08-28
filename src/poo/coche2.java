package poo;

public class coche2 {
	private int ruedas;
	private float largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	
	private String color;
	
	private int peso_total;
	private boolean asientos_cuero,climatizador;
	
	public coche2 () {//CONSTRUCTOR
		ruedas=4;
		largo=4500;
		ancho=200;
		motor=1200;
		peso_plataforma=500;
	}
	public String getData() {//getter
		return "La plataforma tiene "+ruedas+" ruedas."+
			" Mide "+(largo/1000)+" metros con un ancho de "
			+ancho+" centímetros y un peso de plataforma de "
			+peso_plataforma+" kg.";
	}
	public void setColor(String carColor) {//setter
		this.color=carColor;
	}
	public String getColor() {//getter
		return "El color del coche es "+color;
	}
	public void setSeating(String setSeating) {//setter
		if (setSeating.equalsIgnoreCase("on")) {
			this.asientos_cuero=true;
		}else{this.asientos_cuero=false;
		}
	}	
	public void setClimate(String setClimate) {//setter
		if (setClimate.equalsIgnoreCase("on")) {
			this.climatizador=true;
		}else{
			this.climatizador=false;
		}
	}
	public String getSeating() {//getter
		if (asientos_cuero==true) {
			return "Los asientos son de cuero";
		}else{
			return "Los asientos están tapizados";
		}
	}
	public String getClimate() {//getter
		if (climatizador==true) {
			return "Con Climatizador";
		}else{
			return "Sin Climatizador. Sólo A/C.";
		}
	}
	public String getPeso_Total() {//SETTER Y GETTER
		int peso_carrocería=500;
		peso_total=peso_plataforma+peso_carrocería;
		if (asientos_cuero==true) {
			peso_total=peso_total+50;
		}
		if (climatizador==true) {
			peso_total=peso_total+20;
		}
		return "El peso del coche es "+peso_total;
	}
	public int precio_coche() {//GETTER
		int precio_final=10000;
		if(asientos_cuero==true) {
			precio_final+=2000;
		}
		if(climatizador==true) {
			precio_final+=1500;
		}
		return precio_final;
	}
}