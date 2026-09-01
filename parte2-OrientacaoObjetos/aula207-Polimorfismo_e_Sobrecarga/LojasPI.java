public class LojasPI{
	public static void main(String args[]){
		Cliente c1, c2;
		// ClienteVIP v;

		c1 = new Cliente("Isisdro","isidro@isi.com", 500);
		c2 = new ClienteVIP("Vitor","vitor@vip.com", 500, 300);

		System.out.println(c1);
		System.out.println(c2);

		/*
		// vou comprar
		if (c.fazerCompra(650)) {
			System.out.println("Conseguiu comprar");
		}
		else{
			System.out.println("Saldo Insificiente");
		}

		System.out.println(c);
		*/

	}
}