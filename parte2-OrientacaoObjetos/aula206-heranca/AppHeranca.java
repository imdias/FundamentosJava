public class AppHeranca{
	public static void main(String args[]){
		Pessoa p = new Pessoa();
		p.setNome("Isidro");
		p.setEmail("isidro@isidro.com");

		Funcionario f = new Funcionario();
		f.setNome("Josineidson");
		f.setEmail("josineidson@isidro.com");
		f.setSalario(5000);

		System.out.println("Mostrando infos....");
		System.out.println("Pessoa: " + p.getNome() + " - " + p.getEmail());
		System.out.println("Funcionario: " + f.getNome() + " - " + f.getEmail() + " - R$ " + f.getSalario());
		System.out.println("-------------------- ");
	}
}