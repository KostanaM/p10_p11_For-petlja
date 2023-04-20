package kostana.maksic;

public class Zadatak1 {

	public static void main(String[] args) {
		// 1. Napisati program koji ispisuje sve cifre.

		System.out.print("I nacin: \n"); // od 0 do 9

		for (int cifra = 0; cifra < 10; cifra++) {

			System.out.print(cifra + "\t");
		}
		System.out.print("\nII nacin: \n"); // od 9 do 0

		for (int c = 9; c >= 0; c--) {

			System.out.print(c + "\t");
		}
	}
}
