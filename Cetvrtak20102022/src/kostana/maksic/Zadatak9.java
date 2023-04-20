package kostana.maksic;

public class Zadatak9 {

	public static void main(String[] args) {
		// 9. U intervalu brojeva od 1 .. 100 ispitati sve parne brojeve.

		System.out.println("Parni brojevi o 1 do 100: ");
		for (int x = 1; x <= 100; x++) {
			if (x % 2 == 0)

				System.out.print(x + " ");
		}
	}
}
