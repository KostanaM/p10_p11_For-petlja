package kostana.maksic;

import java.text.DecimalFormat;

public class Zadatak17 {

	public static void main(String[] args) {
		double a, b;
		DecimalFormat d = new DecimalFormat("#.##");
		DecimalFormat df = new DecimalFormat("#,###0.000");
		System.out.println("\ta" + "\tb" + "\tP" + "\tQ");

		for (a = 0.1; a <= 0.5; a += 0.1)
			for (b = 0.1; b <= 0.2; b += 0.1) {

				double p = Math.cos(a) - Math.cos(b);
				double q = -2 * Math.sin((a + b) / 2) * Math.sin((a - b) / 2);
				System.out.println("\t" + d.format(a) + "\t" + d.format(b) + "\t" + df.format(p) + "\t" + df.format(q));

			}
	}
}
