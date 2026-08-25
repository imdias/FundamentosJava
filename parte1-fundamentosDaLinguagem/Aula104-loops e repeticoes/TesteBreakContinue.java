import java.util.Scanner;

public class TesteBreakContinue{
	public static void main(String args[]){
		int valor;
		int contador;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um valor");
		valor = teclado.nextInt();
		System.out.println("Contando de 1 até chegar no valor de: "+valor);

		
		// Utilizando o break dentro do comando for
		/*
		for (contador =1; contador <= valor; contador++){
			System.out.println("Contador = "+contador);
			if (contador == 5) {
				break;			
			}
		}
		*/

		// Utilizando o continue dentro do for
		/*

		for (contador =1; contador <= valor; contador++){
			if (contador == 5) {
				continue;
			}
			System.out.println("Contador = "+contador);
		}

		*/

		// Fazendo o mesmo dos testes acima só que utilizando o While
		contador = 1;
		while(contador <= valor){
			if (contador == 5) {
				continue;
			}
			System.out.println("Contador = "+contador);
			contador++;
		}
		System.out.println("Fim do programa");
		

	}
}