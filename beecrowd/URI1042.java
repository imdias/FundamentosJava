import java.util.Scanner;

public class URI1042{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int a, b, c, aux;
		a = teclado.nextInt();
		b = teclado.nextInt();
		c = teclado.nextInt();
		if(a > b){
			aux = a;
			a = b;
			b = aux;
		}
		if(b > c){
			aux = b;
			b = c;
			c = aux;
		}
		if(a > b){
			aux = a;
			a = b;
			b = aux;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}