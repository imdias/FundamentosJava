import java.util.Scanner;

public class URI1001{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valorA, valorB, X;

        valorA = teclado.nextInt();
        valorB = teclado.nextInt();

        X = valorA + valorB;

        System.out.println("X = " + X);
    }
}