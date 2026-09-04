public class Quadriciclo extends Veiculo{
	private float fatorRisco;
	private float valorDiaria;

	public Quadriciclo(String modelo, String placa, float fatorRisco){
		super(modelo,placa);
		this.fatorRisco = fatorRisco;
	}
	public float calcularAluguel(float qtdeDias){
		return qtdeDias * valorDiaria;
	}
}