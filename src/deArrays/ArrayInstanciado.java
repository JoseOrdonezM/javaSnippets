package deArrays;

public class ArrayInstanciado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]matrice= {
				{3,7,11,76,3},
				{98,34,76,12,78},
				{12,54,231,7,23},
				{4,87,4,9,2,78}
		};
		for(int lineOfMatrice[] : matrice) {
			System.out.print('[');
			for(int numberOfMatrice:lineOfMatrice) {
				System.out.print(" "+numberOfMatrice);
				}
				System.out.println(" ]");
			}
		}

}
