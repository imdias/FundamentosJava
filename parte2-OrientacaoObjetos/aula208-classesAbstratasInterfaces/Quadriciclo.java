public class Quadriciclo extends Veiculo{
	private float fatorRisco;

	public Quadriciclo(String modelo, String placa, float valorDiaria ,float fatorRisco){
		super(modelo,placa,valorDiaria);
		this.fatorRisco = fatorRisco;
	}

	public float calcularAluguel(int qtdeDias){
		return qtdeDias * super.getValorDiaria() + fatorRisco;
	}
}