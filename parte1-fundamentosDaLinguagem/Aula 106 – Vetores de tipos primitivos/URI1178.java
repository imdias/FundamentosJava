import java.util.Scanner;

public class URI1178{
		public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		double N[] = new double[100];

		N[0]= teclado.nextDouble();
		System.out.printf("N[0] = %.4f\n", N[0]);

		for (int i=1 ; i<100 ; i++) {
			N[i] = N[i-1] / 2;
			System.out.printf("N[%d] = %.4f\n", i, N[i]);
			
		}
	}
}