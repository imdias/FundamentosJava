public class MeuRecurso implements AutoCloseable{
	

	public int getValue(int value){
	if (value == 0) {
		throw new RuntimeException("ZERO VALUE!");
		
	}
		return value;
	}

	public void close() throws Exception{
		System.out.print("Fechei o recurso... \n");
	}
}