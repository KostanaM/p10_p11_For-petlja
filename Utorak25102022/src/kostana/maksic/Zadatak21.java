package kostana.maksic;

import java.text.DecimalFormat;

public class Zadatak21 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.###");

		double s = 1;
		double s1 = 1;

		for (int n = 1; n <= 50; n++) {
			s1 = Math.pow(-1.0, (n - 1.0)) * (n / (n + 1.0));
			s += s1;
		}
		System.out.println("Suma je: " + df.format(s));
	}

}
