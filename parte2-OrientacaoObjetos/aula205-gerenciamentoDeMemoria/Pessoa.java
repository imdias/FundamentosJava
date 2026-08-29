public class Pessoa{
	private int id;
	private String nome;
	private String email;

	public Pessoa(int id, String nome, String email){
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	/*
	protected void finalize(){
		System.out.println("A pessoa de ID " + id + " foi removida");
	} */

	public boolean equals(Object o){
		if (o instanceof Pessoa) {
			Pessoa p = (Pessoa)o;
			return p.id == this.id && p.email.equals(this.email) && p.nome.equals(this.nome);
		}
		return false;
	}
	public void mostrarInfo(){
		System.out.println(id + "  " + nome + "  " + email);
	}
}