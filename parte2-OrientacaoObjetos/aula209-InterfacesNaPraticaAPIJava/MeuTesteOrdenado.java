import java.util.ArrayList;
import java.util.Collections;

public class MeuTesteOrdenado{
	public static void main(String args[]){
		ArrayList<Player> lista = new ArrayList<Player>();

		lista.add(new Player(1, "VenomousInk87", 100.0f));
		lista.add(new Player(2, "BullDog897", 87.5f));
		lista.add(new Player(3, "PlayerFromHaven", 50.0f));
		lista.add(new Player(4, "PhonicDyno", 200.6f));
		lista.add(new Player(5, "Newbie1786", 50.0f));
		
		System.out.print(" ***** Imprimindo a lista de jogadores ****\n");

		// Ordenando lista com o uso do sort
		Collections.sort(lista);

		for (Player p: lista) {
			System.out.print("Nome = " + p + " \n");
		}

		/*String s1 = "Jose";
		String s2 = "Marcelo";
		System.out.print("Resultado da comparacao " + s1.compareTo(s2) + "\n");*/
	}
}