public class LojasPI{
	public static void main(String args[]){
		Cliente[] clientes;
		
		clientes = new Cliente[5];

		clientes[0] = new Cliente("Isisdro","isidro@isi.com", 500);
		clientes[1] = new ClienteVIP("Vitor","vitor@vip.com", 500, 300);
		clientes[2] = new Cliente("Jose","jose@jose.com", 300);
		clientes[3] = new Cliente("Pedro","pedro@pedro.com", 1000);
		clientes[4] = new ClienteVIP("Andre","andre@andre.com", 1000, 500);

		for (Cliente c: clientes) {
			System.out.println(c);
		}

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