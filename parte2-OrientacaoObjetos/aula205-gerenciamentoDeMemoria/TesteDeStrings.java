public class TesteDeStrings{
	public static void main(String args[]){
		String s1 = new String("oi quer tc?");
		String s2 = new String("oi quer tc?");

		Pessoa p1 = new Pessoa(1, "Isidro", "isidro@isi.com");
		Pessoa p2 = new Pessoa(1, "Isidro", "isidro@isi.com");

		System.out.println("HashCode da s1 = " + s1.hashCode());
		System.out.println("HashCode da s2 = " + s2.hashCode());

		System.out.println("HashCode da P1 = " + p1.hashCode());
		System.out.println("HashCode da P2 = " + p2.hashCode());

		
		if(p1 == p2){
			System.out.println("Ponteiros de pessoa de mesmo objeto");
		}
		else{
			System.out.println("Ponteiros para objetos distintos");
		}

		if (p1.equals(p2)) {
			System.out.println("Pessoas com conteudos iguais");
		}
		else{
			System.out.println("Pessoas com conteudos distintos");
		}

 
		if (s1 == s2) {
			System.out.println("apontam para o mesmo local");
		}
		else{
			System.out.println("apontam para locais distintos");
		}

		if (s1.equals(s2)) {
			System.out.println("Iguais lexicograficamente");
		}
		else{
			System.out.println("Diferentes lexicograficamente");
		}
	}
}