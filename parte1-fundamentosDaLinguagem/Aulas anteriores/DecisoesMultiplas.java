import java.util.Scanner;

public class DecisoesMultiplas {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        float n1, n2, media;
        System.out.println("Digite a N1: ");
        n1 = teclado.nextFloat();
        System.out.println("Digite a N2: ");
        n2 = teclado.nextFloat();
        media = (n1 + n2) / 2;

        System.out.println("Média final = " + media);

        if(media >= 9.0f){
            System.out.println("Conceito A");
        } else {
            if (media >= 8.0f){
                System.out.println("Conceito B");
            } else {
                if(media >= 7.0f){
                    System.out.println("Conceito C");
                } else {
                    if(media >= 6.0f){
                        System.out.println("Conceito D");
                    } else {
                        System.out.println("Conceito E");
                    }
                }
            }
        }
    }
}