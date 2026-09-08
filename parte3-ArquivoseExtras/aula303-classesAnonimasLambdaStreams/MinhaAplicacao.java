import javax.swing.*;
import java.awt.event.*;

public class MinhaAplicacao{
	public static void main (String args[]){
		MeuObjeto o = new MeuObjeto();
		o.metodoDoObjeto(new MinhaInterface(){
			public void metodoDaInterface(){
				System.out.println("Metodo da interface executando");
			}
		});
		System.out.println("Fim do programa");

		JButton btn = new JButton();
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				System.out.println("Botão apertado");
			}
		});
	}
}