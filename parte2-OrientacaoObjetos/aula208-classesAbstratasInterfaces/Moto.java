public class Moto extends Veiculo{
	private float valorDiaria;
	private float fatorDesconto;

	public Moto(String modelo, String placa, float valorDiaria, float fatorDesconto){
		super(modelo, placa);
		this.valorDiaria = valorDiaria;
		this.fatorDesconto = fatorDesconto;
	}

	public float calcularAluguel(int qtdeDias){
		return valorDiaria * qtdeDias - (valorDiaria*qtdeDias*fatorDesconto/100f);
	}
}