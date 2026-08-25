import java.util.Scanner;

public class URI1064{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		float valor;
		float media;
		int contador,i;

		media = 0;
		contador = 0;

		for(i = 1; i<=6 ; i++){
			valor = teclado.nextFloat();
			if (valor > 0) {
				media += valor; // o mesmo de: media = media + valor;
				contador++;
				
			}
		} 
		media = media / contador;
		System.out.println(contador + " valores positivos");
		System.out.printf("%.1f\n", media);
	}
}