package Uke34;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class Oppgave1 {
 
	public static void main(String[] args) {
		
		String lengdeTxt = showInputDialog("Lengde");
		String breddeTxt = showInputDialog("Bredde");
		
		int lengde = parseInt(lengdeTxt);
		int bredde = parseInt(breddeTxt);
		System.out.println(lengde*bredde);
		
		
		
				

	}

}
