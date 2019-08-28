package buclesCondicionales;

public class BucleForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] countries= {"España","México","Colombia","Perú","Chile","Argentina","Ecuador","Venezuela","Brasil"};
		/*for (int i=0;i<countries.length;i++) {
			System.out.println("País "+(i+1)+" "+countries[i]);
		}*/
		int i=1;
		for(String littleCountry:countries) {
			System.out.println("País "+i+" "+littleCountry);
			i++;
		}
	}

}
