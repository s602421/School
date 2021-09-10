package programmeringoppgave1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import java.text.DecimalFormat;

public class O3 {

	public static void main(String[] args) {
		String nFakultetTxt = showInputDialog("Fakultet");
		long nFakultet = parseInt(nFakultetTxt);
		long nFak = 1;
		while (nFakultet <= 0 || nFakultet >20) {
			System.out.println("Ugydlig");
			nFakultetTxt = showInputDialog("Fakultet, det kan ikke være høyere enn 20, fordi det blir for langt til at console klarer å lese det. Det kan heller ikke være mindre enn 0 fordi da går ikke fakultetet opp");
			nFakultet = parseInt(nFakultetTxt);

		}
		for (long i = 0; i < nFakultet; i++) {
			nFak *= i + 1;	
		}
		
		DecimalFormat nFakFormat = new DecimalFormat("#,##");
		nFakFormat.setGroupingUsed(true);
		nFakFormat.setGroupingSize(3);
		showMessageDialog(null, "N Fakulteten er " + nFakFormat.format(nFak));
	}

}
