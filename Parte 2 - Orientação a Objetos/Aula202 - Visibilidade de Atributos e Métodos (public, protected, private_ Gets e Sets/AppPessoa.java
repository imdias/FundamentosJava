public class AppPessoa{
    public static void main(String args[]){
        Pessoa p1 = new Pessoa("Prof. Isisdro","isidro@isidro.org", 2000);
        Pessoa p2 = new Pessoa("Asdrubal", 3000);

        p1.exibirDados();
        p1.aumentarSalario(15);

        p1.exibirDados();
        p2.exibirDados();
    }
}