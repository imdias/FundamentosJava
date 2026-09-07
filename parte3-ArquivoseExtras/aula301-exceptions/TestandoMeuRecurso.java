import java.util.Scanner;
public class TestandoMeuRecurso{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);

		try(MeuRecurso r = new MeuRecurso()){
			int valor;
			do{
				valor = r.getValue(teclado.nextInt());
				System.out.print("Valor recebido... " + valor + " \n");
			} while(valor != -1);
		}
		catch(Exception ex){
			System.out.print("Ops... erro... " + ex.getMessage() +"\n");
		}
	}
}