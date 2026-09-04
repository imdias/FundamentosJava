public class DriverMySQL implements InterfaceBD{
	public void conectar(String servidor){
		System.out.println("MYSQL> Connecting on " + servidor);
	}

	public void executar(String SQL){
		System.out.print("MYSQL> " + SQL + " executed");
	}
}