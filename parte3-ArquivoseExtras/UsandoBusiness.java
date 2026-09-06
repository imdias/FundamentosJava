public class UsandoBusiness{
	public static void main(String args[]){
		try{
			MeuBusiness.metodoLancador(null);	
		}
		catch(Exception ex){
			System.out.print("Erro - " + ex.getMessage());
		}
	}
}