package kostana.maksic;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
		/*
		 * 7. Napisati program kojim se za date prirodne brojeve m i n, izračunava: S =
		 * n*(n+m)*(n+2m)*(n+3m)...*(n+m*m)
		 */

		Scanner sc = new Scanner(System.in);
		int m, n;
		int s = 1;

		System.out.println("Unesite broj m: ");
		m = sc.nextInt();

		System.out.println("Unesite broj n: ");
		n = sc.nextInt();

		for (int i = 1; i <= m; i++)
			s = s * (n + i * m);

		s *= n;

		System.out.println(s);

		sc.close();
	}
}
