public class TesteExceptions{
	public static void main(String args[]){

	try{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a / b;

		System.out.print("Resultado da divisão = " + c + "\n");
	}
	catch(ArrayIndexOutOfBoundsException ex){
		System.err.print("Plis, informe 2 valores \n");
	}
	catch(Exception ex){
		System.err.print("Deu ruim!!! \n");		
		}
	}
}