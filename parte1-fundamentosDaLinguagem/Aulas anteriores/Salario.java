import java.util.Scanner;

public class Salario {
    public static void main(String args[]){
        int numeroFuncionario;
        float horasTrabalhadas, valorHoraTrabalhada;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número do funcionário: ");       
        numeroFuncionario = input.nextInt();
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horasTrabalhadas = input.nextFloat();
        System.out.println("Digite o valor que o funcionário recebe por hora trabalhada: ");
        valorHoraTrabalhada = input.nextFloat();

        float salario = horasTrabalhadas * valorHoraTrabalhada;
        System.out.println("Number = " + numeroFuncionario);
        System.out.println("Salary = U$ " + String.format("%.2f", salario));

    }
}