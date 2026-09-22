import java.util.Scanner;

public class URI1010 {
	public static void main (String args[]) {
		Scanner teclado = new Scanner (System.in);

		int cod1, cod2, peca1, peca2, qtd1, qtd2;
		float valor1, valor2, total;


		cod1 = teclado.nextInt();
		peca1 = teclado.nextInt();
		valor1 = teclado.nextFloat();

		cod2 = teclado.nextInt();
		peca2 = teclado.nextInt();
		valor2 = teclado.nextFloat();

		total = (peca1 * valor1) + (peca2 * valor2);

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

	}
}