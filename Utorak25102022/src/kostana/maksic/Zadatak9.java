package kostana.maksic;

import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) {
		double a, b, y;
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite vrednost za n");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Unesite vrednost broja a");
			a = sc.nextDouble();
			System.out.println("Unesite vrednost broja b");
			b = sc.nextDouble();

			if (a >= 0)
				y = (1 - Math.min(a, b)) / (1 + Math.max(a, b));
			else
				y = Math.min(a, b) / (Math.max(a * a, b * b) + 3);
			System.out.println("Za unete vrednosti a= " + a + " i b  " + b + " dobija se y= " + y);
		}
		sc.close();
	}
}
