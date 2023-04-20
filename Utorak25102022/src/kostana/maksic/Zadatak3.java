package kostana.maksic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak3 {

	public static void main(String[] args) throws Exception {
		// s-spoljasnja suma
		// s1-unutrasnja suma
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.##");

		double s = 0, s1;

		System.out.println("Unesite vrednost za n: ");
		int n = Integer.parseInt(ulaz.readLine());

		for (int i = 1; i <= n; i++) {
			s1 = 0;
			for (int j = 1; j <= n; j++)
				if (j != 3)
					s1 += (j + 3.5) / (j - 3.0);
			s += s1;
		}
		System.out.println("Dobijena vrednost sume: " + df.format(s));
	}
}
