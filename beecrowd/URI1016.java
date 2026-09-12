import java.util.Scanner;

public class URI1016{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int km = teclado.nextInt();

        int tempo = km * 2;

        System.out.println(tempo + " minutos");
    }
}