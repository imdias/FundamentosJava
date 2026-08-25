public class TesteArgs{
	public static void main(String args[]){
		System.out.println("Tamanho do vetor args "+args.length);
		System.out.println("E quais os valores ");

		for (int i=0 ; i<args.length ; i++ ) {
			System.out.println("args["+i+"]"+args[i]);
		}
	}
}
