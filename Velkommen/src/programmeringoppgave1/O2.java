package programmeringoppgave1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			String karakterpoengTxt = showInputDialog("Karakterpoeng");
			int karakterpoeng = parseInt(karakterpoengTxt);
			char karakter = 'g';

			while (karakterpoeng < 0 || karakterpoeng > 100) {

				System.out.println("Ugyldig karakter");
				karakterpoengTxt = showInputDialog("Karakterpoeng");
				karakterpoeng = parseInt(karakterpoengTxt);
			}

			if (karakterpoeng <= 39)
				karakter = 'F';
			else if (karakterpoeng <= 49)
				karakter = 'E';
			else if (karakterpoeng <= 59)
				karakter = 'D';
			else if (karakterpoeng <= 79)
				karakter = 'C';
			else if (karakterpoeng <= 89)
				karakter = 'B';
			else if (karakterpoeng <= 100)
				karakter = 'A';

			System.out.println(karakter);

		}
	}
}
