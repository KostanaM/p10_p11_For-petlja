package kostana.maksic;

import java.util.Scanner;

public class Zadatak10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite vrednost za n: ");
		int n = input.nextInt();

		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				System.out.println("Unesite vrednost broja a: ");
				double a = input.nextDouble();
				double y;
				if (a > 0)
					y = Math.sqrt(a);
				else
					y = a * a;

				System.out.println("Za unetu vrednost a = " + a + " dobija se y = " + y);
			}
		} else
			System.out.println("Vrednost za n mora biti veće od nule");

		input.close();
	}
}