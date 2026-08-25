import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String args[]){
        
        int anosEmDias;
        int qtdAnos, qtdMeses, qtdDias;
        int resto;

        Scanner teclado = new Scanner(System.in);
        anosEmDias = teclado.nextInt();

        qtdAnos = anosEmDias / 365;
        
        resto = anosEmDias % 365;
        
        qtdMeses = resto / 30;
        
        qtdDias = resto % 30;

        System.out.println(qtdAnos + " ano(s)");
        System.out.println(qtdMeses + " mes(es)");
        System.out.println(qtdDias + " dia(s)");

    }
}