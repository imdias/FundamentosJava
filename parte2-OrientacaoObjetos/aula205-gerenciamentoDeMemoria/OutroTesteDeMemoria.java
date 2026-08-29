public class OutroTesteDeMemoria{
	public static void main(String args[]){

		Pessoa p;
		int i = 0;
		do{
			p = new Pessoa(i, " NOME " + i,"EMAIL " + i);
			System.out.println("Criei ... ");
			p.mostrarInfo();
			i++;
		} while(i<100000);
		System.gc;
		System.out.println("No final ficou... ");
		p.mostrarInfo();
	}
}