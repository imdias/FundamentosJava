import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.EOFException;

public class BinReader{
	public static void main(String args[]) {
			try{
				File tmpArq = new File("arquivo.bin");
				FileInputStream fsArq = new FileInputStream(tmpArq);
				ObjectInputStream obj = new ObjectInputStream(fsArq);

				Player p;
				do{
					p = (Player)obj.readObject();
					if (p != null) {
						System.out.println("LIDO: "+p.showInfo());
					}
				}while(p != null);
				obj.close();
				fsArq.close();

			}
			catch(EOFException ex){
				System.out.println("FIM DOS REGISTROS");
			}

			catch(Exception ex){
				System.out.println("ERRO: "+ex.getMessage());
			}	
		}	
}