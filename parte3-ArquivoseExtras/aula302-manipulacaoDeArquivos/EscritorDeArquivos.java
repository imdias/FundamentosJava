import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class EscritorDeArquivos{
	public static void main(String args[]) {		
		try{
			Scanner teclado = new Scanner(System.in);
			File tmpArquivo = new File("arquivo.txt");
			FileWriter wtArquivo = new FileWriter(tmpArquivo);

			String texto;
			do{
				System.out.print("Digite algo (FIM para sair): ");
				texto = teclado.nextLine();
				if (!texto.equals("FIM")) {
					wtArquivo.write(texto + "\n");		
				}				
			} 
			while(!texto.equals("FIM"));
			wtArquivo.close();

		}
		catch(Exception ex){
			System.out.print("Erro: " + ex.getMessage() + " \n");
		}
	}
	
}