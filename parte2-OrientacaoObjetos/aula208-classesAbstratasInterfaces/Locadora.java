public class Locadora{
	public static void main(String args[]){
		Veiculo estoque[];

		estoque = new Veiculo[5];

		estoque[0] = new Carro("Celta","JDK 0001", 50f);
		estoque[1] = new Moto("Honda PCX", "JRE 0002", 25f, 5f);
		estoque[2] = new Quadriciclo("Polar MX1", "MAC 003", 100.0f, 400.0f);
		estoque[3] = new Carro("Mercedes", "WIN 0004", 250f);
		estoque[4] = new Moto("Kawa Ninja ZX10", "ISI 0005", 600f, 2f);

		for (Veiculo v: estoque) {
			System.out.println("Veiculo v = " + v.getModelo() + " Aluguel = R$ " + v.calcularAluguel(7));
		}
	}
}