package kostana.maksic;

import java.util.Scanner;

public class Zadatak13 {

	public static void main(String[] args) {
		// 13. Napisati program za izračunavanje aritmetičke sredine unetih brojeva.

		Scanner sc = new Scanner(System.in);
		System.out.println("Koliko brojeva zelite da unesete?");
		int broj = sc.nextInt();

		int ar = 0;
		int suma = 0;

		for (int i = 1; i <= broj; i++) {

			System.out.println("Unesite " + i + " broj");

			int vr = sc.nextInt();

			suma = suma + vr;
			ar = suma / broj;
		}

		System.out.println("Aritmeticka sredina brojeva iznosi " + ar);

		sc.close();
	}

}