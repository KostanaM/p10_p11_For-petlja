package kostana.maksic;

import java.util.Scanner;

public class Zadatak14 {

	public static void main(String[] args) {
		// 14. Napisati program za izračunavanje aritmetičke sredine parnih brojeva.
		int ar = 0;
		int suma = 0;
		int vr = 0;
		int broj1 = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Koliko brojeva zelite da unesete?");
		int broj = sc.nextInt();

		for (int i = 1; i <= broj; i++) {
			System.out.println("Unesite " + i + " broj");
			vr = sc.nextInt();
			{
				if (vr % 2 == 0) {
					broj1++;
					suma = suma + vr;
					ar = suma / broj1;
				}
			}
		}
		System.out.println("Aritmeticka sredina parnih brojeva iznosi " + ar);
		sc.close();
	}

}
