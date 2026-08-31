public class Pessoa{
	private String nome;
	private String email;

	public Pessoa(String nome, String email){
		this.nome = nome;
		this.email = nome;
	}

	public String getNome(){
		return this.nome;
	}

	public String getEmail(){
		return this.email;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setEmail(String email){
		this.email = email;
	}
}