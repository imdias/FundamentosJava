import java.util.Scanner;

public class URI1073{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		int N;
		int numero;

		N =teclado.nextInt();
		for (numero = 2 ; numero <= N ; numero += 2 ) {
			System.out.println(numero+"ˆ2 = "+ numero * numero);
		}
		

	}
}