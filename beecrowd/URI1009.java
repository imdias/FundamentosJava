import java.util.Scanner;

public class URI1009{
	public static void main(String args[]){
		Scanner teclado = new Scanner (System.in);

		String vendedor;
		float salario, vendas, total;

		vendedor = teclado.nextLine();
		salario = teclado.nextFloat();
		vendas = teclado.nextFloat();

		total = salario + (vendas * 0.15f);

		System.out.printf("TOTAL = %.2f%n", total);

	}
}