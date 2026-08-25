public class URI1038 {
    public static void main(String args[]){
        java.util.Scanner teclado = new java.util.Scanner(System.in);

        int qtde, cod;
        float total;

        cod = teclado.nextInt();
        qtde = teclado.nextInt();

        if (cod == 1) {
            total = qtde * 4.0f;
        } else if (cod == 2) {
            total = qtde * 4.5f;
        } else if (cod == 3) {
            total = qtde * 5.0f;
        } else if (cod == 4) {
            total = qtde * 2.0f;
        } else if (cod == 5) {
            total = qtde * 1.5f;
        } else {
            total = 0.0f;
        }
        System.out.printf("Total: R$ %.2f\n", total);
    }
}