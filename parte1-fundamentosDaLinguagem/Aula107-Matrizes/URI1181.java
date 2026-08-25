import java.util.Scanner;

public class URI1181{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		float matriz[][] = new float[12][12];
		int L;
		char T;

		L = Integer.parseInt(teclado.nextLine());
		T = teclado.nextLine().charAt(0);
		for (int l=0;l<12;l++) {
			for (int c=0;c<12;c++) {
				matriz[l][c]=teclado.nextFloat();
			}	
		}
		float res = 0;
		for(int c=0;c<12;c++){
			res += matriz[L][c];
		}
		if (T == 'S') {
			System.out.printf("%.1f\n", res);
		} else{
			System.out.printf("%.1f\n", res/12);
		}
	}
}