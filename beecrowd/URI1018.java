import java.util.Scanner;

public class URI1018{
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        int valor, q100, q50, q20, q10, q5, q2, q1;
        int resto;

        //entrada
        valor = teclado.nextInt();

        //processamento
        q100 = valor / 100;
        resto = valor % 100;

        q50 = resto / 50;
        resto = resto % 50;

        q20 = resto / 20;
        resto = resto % 20;

        q10 = resto / 10;
        resto = resto % 10;

        q5 = resto / 5;
        resto = resto % 5;

        q2 = resto / 2;
        q1 = resto % 2;

        //saida
        System.out.println(valor);
        System.out.println(q100 + " nota(s) de R$ 100,00");
        System.out.println(q50 + " nota(s) de R$ 50,00");
        System.out.println(q20 + " nota(s) de R$ 20,00");
        System.out.println(q10 + " nota(s) de R$ 10,00");
        System.out.println(q5 + " nota(s) de R$ 5,00");
        System.out.println(q2 + " nota(s) de R$ 2,00");
        System.out.println(q1 + " nota(s) de R$ 1,00");

        teclado.close();
        
    }
}