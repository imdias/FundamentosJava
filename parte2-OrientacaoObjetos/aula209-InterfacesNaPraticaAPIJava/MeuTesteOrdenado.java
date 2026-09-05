import java.util.ArrayList;
import java.util.Collections;

public class MeuTesteOrdenado{
	public static void main(String args[]){
		ArrayList<String> listaNomes = new ArrayList<String>();

		listaNomes.add("Zelia");
		listaNomes.add("Isidro");
		listaNomes.add("Adriano");
		listaNomes.add("Jose");
		listaNomes.add("Pedro");

		System.out.print(" ***** Imprimindo a lista ****\n");

		// Ordenando lista com o uso do sort
		Collections.sort(listaNomes);

		for (String s: listaNomes) {
			System.out.print("Nome = " + s + " \n");
		}

		/*String s1 = "Jose";
		String s2 = "Marcelo";
		System.out.print("Resultado da comparacao " + s1.compareTo(s2) + "\n");*/
	}
}