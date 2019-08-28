package tiposEnum;

public class usoTallas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String talla;
		talla="Pequeña";
		talla="Mediana";
		talla="Grande";
		talla="AzUl";//Esto es absurdo
		Talla equis=Talla.GRANDE;
		Talla equisele=Talla.MUY_GRANDE;
		Talla eme=Talla.MINI;
		Talla ele=Talla.MEDIANO;
		//Talla xxl=Talla.BIG;//FALLO
	}
	//FUERA DEL MAIN
	//DECLARA una variable cuyo valor está comprendido entre
	//cuatro campos
	enum Talla {MINI,MEDIANO,GRANDE,MUY_GRANDE};
}
