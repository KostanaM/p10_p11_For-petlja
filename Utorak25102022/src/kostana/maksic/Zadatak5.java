package kostana.maksic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak5 {

	public static void main(String[] args) throws Exception {
		// Inicijalizacija promenjive s
		double s = 0;

		DecimalFormat df = new DecimalFormat("#.###");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		// Unos promenjive n
		System.out.println("Unesite vrednost za n: ");
		int n = Integer.parseInt(ulaz.readLine());

		// Izračunavanje vrednosti sume
		for (int i = 1; i <= n; i++)
			s = Math.sqrt(6 + s);
		// Štampanje izlaznog rezultata
		System.out.println("Dobijena vrednost sume je: " + df.format(s));

	}

}
