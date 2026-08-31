public class Funcionario extends Pessoa{
		private float salario;

		public Funcionario(String nome, String email, float salario){
			super(nome, email);
			this.salario = salario;
		}

		public void setSalario(float salario){
			this.salario = salario;
		}

		public float getSalario(){
			return this.salario;
		}

		@Override
		public String toString(){
			return super.toString() + " - R$ " + this.salario;
			//return "FUNCIONARIO: " + getNome() + " (" + getEmail() + ") R$ " + this.salario;
		}
}