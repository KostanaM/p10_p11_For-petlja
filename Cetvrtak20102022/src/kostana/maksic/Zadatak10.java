package kostana.maksic;

import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {
		// 10. U zadatom intervalu ispitati i ispisati sve brojeve deljive brojem 3.

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite prvi broj: ");
		int x1 = sc.nextInt();

		System.out.println("Unesite drugi broj: ");
		int x2 = sc.nextInt();

		for (int x = x1; x <= x2; x++) {
			if (x % 3 == 0)
				System.out.print(x + " ");
		}
		sc.close();
	}
}