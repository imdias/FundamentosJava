public class AppTesteStatic{
    public static void main(String args[]){
        TesteStatic t1, t2;

        t1 = new TesteStatic();
        t2 = new TesteStatic();

        t1.at1 = 10;
        t1.at2 = 100;
        
        t2.at1 = 20;
        t2.at2 = 200;

        TesteStatic.AT3 = 500;

        t1.exibirValores();
        t2.exibirValores();

        TesteStatic.metodoStatic("Exemplo...");
    }
}