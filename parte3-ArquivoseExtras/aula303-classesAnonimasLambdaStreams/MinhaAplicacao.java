import javax.swing.*;
import java.awt.event.*;

public class MinhaAplicacao{
	public static void main (String args[]){
		MeuObjeto o = new MeuObjeto();
		/*
		o.metodoDoObjeto(new MinhaInterface(){
			public void metodoDaInterface(){
				System.out.println("Metodo da interface executando");
			}
		});
		
		o.metodoDoObjeto(() -> System.out.println("Opa... executando de novo"));

		System.out.println("Fim do programa");
		*/
		o.outroMetodoDoObjeto((e,f) -> System.out.println("Valor do E = " + e + " valor do F = " + f), Integer.parseInt(args[0]), Float.parseFloat(args[1]));
		
	}
}