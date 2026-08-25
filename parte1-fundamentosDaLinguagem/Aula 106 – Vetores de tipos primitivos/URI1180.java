import java.util.Scanner;

public class URI1180{
		public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int X[], N;
		int menor, posMenor;

		N = teclado.nextInt();
		X = new int[N];

		for (int pos=0 ; pos < X.length ; pos++ ) {
			X[pos] = teclado.nextInt();
		}
		
		posMenor = 0;
		menor = X[0];

		for (int pos=0 ; pos < X.length ; pos++ ) {
				if (X[pos] < menor) {
					menor = X[pos];
					posMenor = pos;				
				}
		}
			System.out.println("Menor valor: "+menor);
			System.out.println("Posicao: "+posMenor);
	}	
}