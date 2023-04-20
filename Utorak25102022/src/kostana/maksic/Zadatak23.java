package kostana.maksic;

import java.text.DecimalFormat;

public class Zadatak23 {

	public static void main(String[] args) {
		System.out.println("\tVitkost štapova" + "\tKoeficijent izvijanja");

		DecimalFormat df = new DecimalFormat("#.##");
		double I = 1;
		for (int lambda = 10; lambda <= 75; lambda++) {

			I = 1.0 / (1.0 - (0.8 * Math.pow(lambda / 100.0, 2.0)));
			System.out.println("\t\t" + lambda + "\t\t" + df.format(I));
		}

	}

}
