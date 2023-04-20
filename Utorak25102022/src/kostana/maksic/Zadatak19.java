package kostana.maksic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak19 {

	public static void main(String[] args) throws Exception {
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("Unesite opterećenje u kN/m");
		double q = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite dužinu u m");
		double L = Double.parseDouble(ulaz.readLine());

		System.out.println("\tZ" + "\tFt" + "\tM");
		double z;

		for (z = 2.5; z < 3.5; z += 0.1) {
			double F = q / 2.0 * (L / 3.0 - (z * z) / L);
			double M = (q * L * L) / 6.0 * ((z / L - Math.pow((z / L), 3.0)));

			System.out.println("\t" + df.format(z) + "\t" + df.format(F) + "\t" + df.format(M));
		}
	}
}
