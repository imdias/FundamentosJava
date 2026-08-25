import java.util.Scanner;

public class URI2167{
	public static void main(String args[]){
		int N, R[];
		Scanner teclado = new Scanner(System.in);
		
		int posQueda = 0;

		N = teclado.nextInt();
		R = new int[N];

		for (int i=0 ; i<R.length; i++){
			R[i] = teclado.nextInt();
		}

		for (int i=1 ; i<R.length ; i++){
			if (R[i] < R[i-1]) {
				posQueda = i+1;
				break;				
			}
		}
		System.out.println(posQueda);

	}
}