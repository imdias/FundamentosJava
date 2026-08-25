import java.util.Scanner;


public class URI1011{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		double volumeEsfera;

		double raio = teclado.nextFloat();

		volumeEsfera = (4.0/3) * 3.14159 * Math.pow(raio, 3);

		System.out.printf("Volume = %.3f\n", volumeEsfera);
	}
}
