public class MeuBusiness{
	public static void metodoLancador(String str) throws Exception{
		if (str != null) {
			System.out.print("Teste " + str + " \n");	
		} 
		else{
			throw new Exception("Ixi deu ruim no método!!!");
		}
		
	}
}