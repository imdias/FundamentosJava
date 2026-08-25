import java.util.Scanner;

public class TesteFor{
	public static void main(String args[]){
		int valor,contador;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um valor");
		valor = teclado.nextInt();
		System.out.println("Contando de 1 até chegar no valor de: "+valor);
		for (contador = 1 ; contador <= valor ; contador++){
			System.out.println("Valor do contador "+contador);
		}
	}
}