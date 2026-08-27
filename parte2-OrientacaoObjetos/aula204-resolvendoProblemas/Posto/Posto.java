public class Posto{
	public static void main(String args[]){
	BombaDeCombustivel b1, b2;
	b1 = new BombaDeCombustivel("Gasolina", 3.99f);
	b2 = new BombaDeCombustivel("Etanol", 3.39f);

	b1.puxarGancho();
	b1.abastecerPorLitros(20);
	b1.voltarGancho();

	b2.puxarGancho();
	b2.abastecerPorValor(50);
	b2.voltarGancho();

	}
}