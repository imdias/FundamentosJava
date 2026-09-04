public class Carro extends Veiculo{
	private float valorDiaria;

	public Carro(String modelo, String placa, float valorDiaria){
		super(modelo,placa);
		this.valorDiaria = valorDiaria;
	}

	public float calcularAluguel(int qtdeDias){
		return qtdeDias * valorDiaria;
	}
}