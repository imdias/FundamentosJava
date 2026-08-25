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

class Pessoa {
    private String nome;
    private String email;
    private double salario;

    Pessoa(String nome, String email, double salario) {
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }

    Pessoa(String nome, double salario) {
        this(nome, "", salario);
    }

    void exibirDados() {
        System.out.println("Nome: " + nome + ", Email: " + email + ", Salario: " + salario);
    }

    void aumentarSalario(double percPercentual) {
        if (percPercentual > 0) {
            salario += salario * percPercentual / 100.0;
        }
    }
}