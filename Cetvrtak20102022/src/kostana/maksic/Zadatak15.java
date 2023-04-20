package kostana.maksic;

import java.util.Scanner;

public class Zadatak15 {

	public static void main(String[] args) {
		// 15. Napisati program koji učitava 10 brojeva i ispisuje koliko ima
		// negativnih, nula i pozitivnih brojeva.

		int broj = 0;
		int pozitivan = 0, negativan = 0, nula = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.println("Unesite " + i + " broj");
			broj = sc.nextInt();

			{
				if (broj > 0) {
					pozitivan++;
				}
				if (broj < 0) {
					negativan++;
				}
				if (broj == 0) {
					nula++;
				}
			}
		}
		System.out.println(nula + "   " + pozitivan + "   " + negativan);
		sc.close();
	}

}