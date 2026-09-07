import java.io.*;

public class LeituraDeArquivo{
	public static void main(String args[]) throws Exception{
		//BufferedReader br = null;
		try(BufferedReader br = new BufferedReader(new FileReader("arquivo.in"));){
		//	br = new BufferedReader(new FileReader("arquivo.in"));
			String s;
			while((s = br.readLine()) != null){
				System.out.print("Lido = " + s + " \n");
			}
		}
		catch(IOException ex){
			System.err.print("Deu algum problema");
		}
		
		//
		/*
		finally{
			if (br != null) {
				br.close();
			}
		}
		*/

	}	
}