import java.util.Scanner;

public class URI1009{
	public static void main(String args[]){
		Scanner teclado = new Scanner (System.in);
		String vendedor = teclado.nextLine();
		double salario = teclado.nextFloat();
		double vendas = teclado.nextFloat();
		double total = salario + (vendas * 0.15f);
		System.out.println(String.format("TOTAL = R$ %.2f", total));

	}
}