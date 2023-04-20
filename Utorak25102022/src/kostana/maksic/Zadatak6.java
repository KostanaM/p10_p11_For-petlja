package kostana.maksic;

import java.text.DecimalFormat;

public class Zadatak6 {

	public static void main(String[] args) throws Exception {
		// inicijalizacija promenjive p
		double p = 1;
		DecimalFormat df = new DecimalFormat("#.###");
		// Izračunavanje vrednosti proizvoda
		for (int n = 1; n <= 5; n++)
			p = p * (n + 2.5) / (n * n + 1.2);
		// Štampanje izlaznog rezultata
		System.out.println("Dobijena vrednost proizvoda je: " + df.format(p));
	}

}
