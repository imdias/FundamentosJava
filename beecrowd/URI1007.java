import java.util.Scanner;

public class URI1007{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int A, B, C, D;

		A = teclado.nextInt();
		B = teclado.nextInt();
		C = teclado.nextInt();
		D = teclado.nextInt();

		int diferenca = (A * B - C * D);

		System.out.println("DIFERENÇA = " + diferenca);
	}
}