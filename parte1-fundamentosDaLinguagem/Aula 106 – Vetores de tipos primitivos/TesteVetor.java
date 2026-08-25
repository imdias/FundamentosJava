import java.util.Scanner;

public class TesteVetor{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		String vetor[];

		vetor = new String[10];

		System.out.println("Digite 10 Strings diferentes");
		for (int pos=0 ; pos < vetor.length ; pos++) {
			vetor[pos] = teclado.nextLine();
		}

		System.out.println("-------------------");
		for (int pos=0 ; pos < vetor.length ; pos++ ) {
			System.out.println("Vetor["+pos+"]= "+vetor[pos]);
		}
	}
}