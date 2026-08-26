public class TesteStatic {
    public int at1;
    public int at2;
    
    public static int AT3;

    public void exibirValores(){
        System.out.println("at1 = " + at1 + "   at2 = " + at2);
        System.out.println("AT3 = " + AT3);
    } 

    public static void metodoStatic(String str){
        System.out.println("METODO STATIC " + str);
    }
}
