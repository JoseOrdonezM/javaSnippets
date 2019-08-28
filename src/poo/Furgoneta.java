package poo;

public class Furgoneta extends coche2{
	private int capacidad_carga;
	private int plazas_extra;
	
	public Furgoneta(int plazas_extra, int capacidad_carga) {
		super();//LLAMA al constructor de la clase coche2
		this.capacidad_carga=capacidad_carga;
		this.plazas_extra=plazas_extra;
	}
	public String getDataFurgoneta() {//getter
		return "La capacidad de carga es: "+capacidad_carga+". Y las plazas son: "+plazas_extra+"\n";
	}
}
