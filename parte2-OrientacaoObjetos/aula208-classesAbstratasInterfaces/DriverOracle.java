public class DriverOracle implements InterfaceBD{
	public void conectar(String servidor){
		System.out.print("ORACLE> " + servidor + " Connected");
	}
	public void executar(String SQL){
		System.out.print("ORACLE> Executing " + SQL);

	}
}