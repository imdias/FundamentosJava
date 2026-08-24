public class AppPessoa{
    public static void main(String args[]){
        Pessoa p = new Pessoa();

        p.setNome("Prof. Isidro");
        p.setEmail("isidro@isidro.org");
        p.setSalario(2000);

        p.exibirDados();
        p.aumentarSalario(15);
        p.exibirDados();
    }
}