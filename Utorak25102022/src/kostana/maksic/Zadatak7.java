package kostana.maksic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak7 {

	public static void main(String[] args) throws Exception {
		double p = 1;
		double q = 1;
		DecimalFormat df = new DecimalFormat("#.##");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite vrednost za n: ");
		int n = Integer.parseInt(ulaz.readLine());

		for (int i = 2; i <= n; i++) {
			q *= i;
			p *= (1 + 1 / q);
		}
		System.out.println("Dobijena vrednost proizvoda je: " + df.format(p));

	}

}
