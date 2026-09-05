public class TesteExceptions{
	public static void main(String args[]){

	try{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a / b;

		System.out.print("Resultado da divisão = " + c + "\n");
	}
	catch(ArrayIndexOutOfBoundsException | NumberFormatException ex){
		System.err.print("Plis, 2 valores INTEIROS!!! \n");
	}
	/*catch(NumberFormatException ex){
		System.err.print("Plis, 2 valores INTEIROS!!! \n");
	}*/
	catch(ArithmeticException ex){
		System.err.print("Não da pra dividir por ZEROOOOOOOO!!! X( \n");
	}
	catch(Exception ex){
		System.err.print("Deu ruim!!! \n");		
	}
	finally{
		System.out.print("Chegue no finally... posso fazer algo aqui \n");
	}

	}
}