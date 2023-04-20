package kostana.maksic;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// 4. Napisati program koji sabira zadati broj sabiraka.

		Scanner sc = new Scanner(System.in);
		int zbir = 0;
		System.out.println("Koliko brojeva zelite da saberete?");
		int brojSabiraka = sc.nextInt();

		for (int i = 1; i <= brojSabiraka; i++) {
			System.out.println("Unesite " + i + " broj");
			int sabirak = sc.nextInt();

			zbir = zbir + sabirak;
		}

		System.out.println("Zbir brojeva iznosi: " + zbir);

		sc.close();
	}

}
