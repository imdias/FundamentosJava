public class URI1038SC{
	public static void main(String args[]){
		java.util.Scanner teclado = new java.util.Scanner(System.in);
		int qtde, cod;
		float total = 0.0f;

		cod = teclado.nextInt();
		qtde = teclado.nextInt();

		switch (cod){
		case 1:
			total = qtde * 4.0f;
			break;
		case 2:
			total = qtde * 4.5f;
			break;
		case 3:
			total = qtde * 5.0f;
			break;
		case 4:
			total = qtde * 2.0f;
			break;
		case 5:
			total = qtde * 1.5f;
			break;
		}
		System.out.printf("Total: R$ %.2f\n", total);
	}
}