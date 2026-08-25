import java.util.Scanner;

public class URI1004{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int valor1 = teclado.nextInt();
		int valor2 = teclado.nextInt();

		int produto = valor1 * valor2;

		System.out.println("PROD = "+produto);
	}
}