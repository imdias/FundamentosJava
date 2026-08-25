import java.util.Scanner;

public class TesteDoWhile{
	public static void main(String args[]){
		int valor,contador;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um valor");
		valor = teclado.nextInt();
		System.out.println("Contando de 1 até chegar no valor de: "+valor);

		contador = 1;

		do{
			System.out.println("O valor do contador = "+contador);
		} while(contador <= valor);
	}
}
