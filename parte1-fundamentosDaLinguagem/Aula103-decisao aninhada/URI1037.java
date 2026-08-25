import java.util.Scanner;

public class URI1037{
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);
        float numero = teclado.nextFloat();

        if(numero >= 0 && numero <= 25f){
            System.out.println("Intervalo [0,25]");
        } else {
            if (numero > 25f && numero <= 50f){
                System.out.println("Intervalo (25,50]");
            } else {
                if (numero > 50f && numero <= 75f){
                    System.out.println("Intervalo (50,75]");
                } else {
                    if (numero > 75f && numero <= 100f){
                        System.out.println("Intervalo (75,100]");
                    } else {
                        System.out.println("Fora de intervalo");
                    }
                }
            }
        }
    }
}