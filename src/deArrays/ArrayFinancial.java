package deArrays;

public class ArrayFinancial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double interes=0.10;
		double acumulado;
		double [][] saldo=new double [6][5];
		for(int i=0;i<6;i++) {
			saldo[i][0]=10000;
			acumulado=10000;
			for(int j=1;j<5;j++) {
				acumulado=acumulado+(acumulado*interes);
				saldo[i][j]=acumulado;
			}
			interes=interes+0.01;
		}
		
		for(double lineOfMatrice[]:saldo) {
			System.out.print('[');
			for(double numberOfMatrice:lineOfMatrice) {
				System.out.print(" "+numberOfMatrice);
				}
				System.out.println(" ]");
			}
	/*for(int j=0;j<5;j++) {
		System.out.print("[ ");
		for(int i=0;i<6;i++) {
			System.out.printf("%1.2f",saldo[i][j]);
			System.out.print(" ");
		} System.out.println("]");
	}*/
	}
}
