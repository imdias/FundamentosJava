import java.util.Scanner;

public class URI1005{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		double notaA, notaB, media;

		notaA = teclado.nextFloat();
		notaB = teclado.nextFloat();

		media = ((notaA * 3.5) + (notaB * 7.5)) / 11;


		System.out.printf("MEDIA = %.5f\n", media);

	}
}