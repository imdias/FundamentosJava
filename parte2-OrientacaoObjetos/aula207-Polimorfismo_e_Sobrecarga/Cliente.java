public class Cliente{
	private String nome;
	private String email;
	private float credito;

	public Cliente(String nome, String email, float credito){
		this.nome = nome;
		this.email = email;
		this.credito = credito;
	}

	public void setCredito(float credito){
		this.credito = credito;
	}

	public float getCredito(){
		return this.credito;
	}

	public String toString(){
		return "CLIENTE: " + nome + " (" + email + ") R$ " + credito;
	}

	public boolean fazerCompra(float valor){
		if (valor > credito) {
			return false;			
		}
		else{
			credito -= valor;
			return true;
		}
	}
	public void quitarDivida(float valor){
		credito += valor;
	}
}