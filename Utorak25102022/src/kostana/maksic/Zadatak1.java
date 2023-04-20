package kostana.maksic;

import java.text.DecimalFormat;

public class Zadatak1 {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#.###");

		// Inicijalizacija promenjive s
		double s = 0;

		// Izracunavanje vrednosti sume
		for (int n = 1; n <= 50; n++)
			s += (n + 2.5) / (n * n + 1.2);

		System.out.println("Dobijena vrednost sume: " + df.format(s));

	}

}
