package kostana.maksic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak20 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite n:");
		double n = sc.nextDouble();

		double p = 1;

		for (int i = 1; i <= n; i++)
			p *= 1.0 - (1.0 / ((double) i + 1.0));

		System.out.println("Proizvod je: " + df.format(p));

		sc.close();
	}

}
