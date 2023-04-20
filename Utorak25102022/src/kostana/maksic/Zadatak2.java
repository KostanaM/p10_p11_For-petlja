package kostana.maksic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak2 {

	public static void main(String[] args) throws Exception {
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.###");
		// Inicijalizacija promenjive s
		double s = 0;
		// Unos vrednosti promenjive n
		System.out.println("Unesite vrednost za n: ");
		int n = Integer.parseInt(ulaz.readLine());
		if (n < 100) {
			// Izracunavanje vrednosti sume
			for (int i = 1; i <= n; i++)
				if (i != 3)
					s += (i + 3.5) / (i - 3);
			// Štampanje izlaznog rezultata
			System.out.println("Dobijena vrednost sume: " + df.format(s));
		} else
			System.out.println("Treba da unesete vrednost za n<100");

	}
}
