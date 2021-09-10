package programmeringoppgave1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O1 {

	public static void main(String[] args) {
		String bruttoinntektTxt = showInputDialog("Bruttoinntekt");
		int bruttoinntekt = parseInt(bruttoinntektTxt);
		int skattetrinn0 = 0;
		double skattetrinn1 = 0.017;
		double skattetrinn2 = 0.04;
		double skattetrinn3 = 0.132;
		double skattetrinn4 = 0.162;

		if (bruttoinntekt <= 184800)
			System.out.println(bruttoinntekt * skattetrinn0 + "kr i skatt" + " " + ". Ikke noe skattetrinn");

		else if (bruttoinntekt > 184800 && bruttoinntekt <= 260100)
			System.out.println(
					(bruttoinntekt - 184800) * skattetrinn1 + "kr i skatt" + " " + ". Er i skattetrinn 1 1,7%");

		else if (bruttoinntekt > 260100 && bruttoinntekt <= 651250)
			System.out.println(
					(bruttoinntekt - 260100) * skattetrinn2 + "kr i skatt" + " " + ". Er i skattetrinn 2 med 4,0%");

		else if (bruttoinntekt > 651250 && bruttoinntekt <= 1021550)
			System.out.println(
					(bruttoinntekt - 651250) * skattetrinn3 + "kr i skatt" + " " + ". Er i skatttrinn 3 med 13,2%");
		else if (bruttoinntekt > 1021550)
			System.out.println(
					(bruttoinntekt - 1021550) * skattetrinn4 + "kr i skatt" + " " + ". 	Er i skattetrinn 4 med 16,2%");
	}

}
