package buclesCondicionales;
import javax.swing.*;
public class BucleforeachconJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String countries[]=new String [8];
		for (int i=0;i<8;i++) {
			countries[i]=JOptionPane.showInputDialog("Introduzca el país "+(i+1)+" de 8");
		}
		int i=1;
		for(String littleCountries:countries){
			System.out.println("País "+i+" "+littleCountries);
			i++;
		}
	}

}
