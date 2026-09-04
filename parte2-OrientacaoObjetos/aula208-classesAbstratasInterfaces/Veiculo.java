public abstract class Veiculo{
	private String modelo;
	private String placa;
	private float valorDiaria;

	public Veiculo(String modelo, String placa, float valorDiaria){
		this.modelo = modelo;
		this.placa = placa;	
		this.valorDiaria = valorDiaria;
	} 

	public String getModelo(){
		return this.modelo;
	}
	public String getPlaca(){
		return this.placa;
	}

	public float getValorDiaria(){
		return this.valorDiaria;
	}

	public void setValorDiaria(float valorDiaria){
		this.valorDiaria = valorDiaria;
	}

	// Eu obrigo todo mundo a calcular a lógica abaixo
	public abstract float calcularAluguel(int qtdeDias);
}