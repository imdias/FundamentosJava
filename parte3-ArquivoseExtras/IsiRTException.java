public class IsiRTException extends RuntimeException{
	public IsiRTException(String str){
		super("ISI: " + str + "\n");
	}
}