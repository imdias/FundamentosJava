public class MeuObjeto{
	public void metodoDoObjeto(MinhaInterface m){
		System.out.println("Estou dentro do método do objeto");
		m.metodoDaInterface();
	}

	public void outroMetodoDoObjeto(InterfaceFuncional m2, int valor, float valor2){
		m2.executaMetodo(valor, valor2);
	}
}