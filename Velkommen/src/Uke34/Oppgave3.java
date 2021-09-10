package Uke34;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
public class Oppgave3 {

	public static void main(String[] args) {
		String dagnummerTxt = showInputDialog("Dagnummer");
		String MaanednummerTxt = showInputDialog("Maanednummer");
		String AarstallnummerTxt = showInputDialog("Aarstallnummer");
		
		int dagnummer= parseInt(dagnummerTxt);
		int Maanednummer= parseInt(MaanednummerTxt);
		int Aarstallnummer= parseInt(AarstallnummerTxt);
		
		System.out.print(dagnummer);
		System.out.print("."); 
		System.out.print(Maanednummer);
		System.out.print(".");
		System.out.print(Aarstallnummer);
		
		
		
	}

}
