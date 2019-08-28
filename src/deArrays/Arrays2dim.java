package deArrays;

public class Arrays2dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int [][] matrice=new int [4][5];
		for (int i=0;i<4;i++) {
			for (int j=0;j<5;j++) {
				matrice[i][j]=(int)Math.round(Math.random()*100);
			}
		}	
			for (int i=0;i<4;i++) {
				System.out.print("[ ");
				for (int j=0;j<5;j++) {
					
					System.out.print(matrice[i][j]+" ");
					
				}
				System.out.println("]");
		}*/
		int [][] matrice=new int [4][5];
		for (int i=0;i<4;i++) {
			for (int j=0;j<5;j++) {
				matrice[i][j]=(int)Math.round(Math.random()*100);
			}
		}	
			for (int [] line:matrice) {
				System.out.print("[ ");
				for (int elementInLine:line) {
					
					System.out.print(elementInLine+" ");
					
				}
				System.out.println("]");
		}
		/*int [][] matrice=new int [4][5];
		for (int [] line:matrice) {
			for (int elementInLine:line) {
				elementInLine=(int)Math.round(Math.random()*100); no funciona
			}
		}	
			for (int [] line:matrice) {
				System.out.print("[ ");
				for (int elementInLine:line) {
					
					System.out.print(elementInLine+" ");
					
				}
				System.out.println("]");
		}*/
	}

}
