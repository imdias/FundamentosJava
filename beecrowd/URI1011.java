import java.util.Scanner;

public class URI1011{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		//double area;

		double raio = teclado.nextDouble();

		double area = (4.0/3) * 3.14159 * Math.pow(raio, 3);

		System.out.printf("VOLUME = %.3f\n", area);

		teclado.close();
	}
}