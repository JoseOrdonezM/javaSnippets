package buclesCondicionales;

public class BucleRandomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] allRandomsInArray=new int[150];
		for (int i=0;i<allRandomsInArray.length;i++) {
			allRandomsInArray[i]=(int)Math.round(Math.random()*100);
		}
		int counterPosition=0;
		for(int aNumberInRandomArray:allRandomsInArray) {
			System.out.println("El número en la posición "+(counterPosition+1)+" es "+aNumberInRandomArray);
			counterPosition++;
		}
	}

}
