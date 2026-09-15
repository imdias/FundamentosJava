import java.util.Scanner;

public class URI1042{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int a, b, c, aux;
		a = teclado.nextInt();
		b = teclado.nextInt();
		c = teclado.nextInt();

		if (a < b && a < c) {
			System.out.println(a);
			if (b < c) {
				System.out.println(b);
				System.out.println(c);				
			} else{
				System.out.println(c);
				System.out.println(b);
			}	
		} else if (b < c) {
			System.out.println(b);
			if (a < c) {
				System.out.println(a);
				System.out.println(c);
			} else {
				System.out.println(c);
				System.out.println(a);
			}
		} else {
			System.out.println(c);
			if (a < b) {
				System.out.println(a);
				System.out.println(b);				
			} else {
				System.out.println(b);
				System.out.println(a);
			}
		}

		System.out.println("");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
}