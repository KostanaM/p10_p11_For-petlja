package kostana.maksic;

import java.text.DecimalFormat;

public class Zadatak16 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");

		System.out.println("\tR.BR." + "\tX" + "\tY" + "\tZ");
		System.out.println("\t----------------------------");

		double x, y, z;
		int i = 0;

		for (x = 0.0; x <= 10.0; x++) {
			i++;
			y = Math.sqrt(x) + 0.2 * x - Math.pow(x, 2) / (x + 1);

			z = y - 0.3 * Math.pow(y, 2) / (y + 1);
			System.out.println("\t" + i + "\t" + df.format(x) + "\t" + df.format(y) + "\t" + df.format(z));
		}

	}

}
