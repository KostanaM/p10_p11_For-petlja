package kostana.maksic;

public class Zadatak3 {

	public static void main(String[] args) {
		// 3. Napisati program za računanje zbira brojeva od 1 do 10.

		int zbir = 0; // predstavlja neutral prilikom sabiranja

		for (int i = 1; i <= 10; i++) {

			zbir = zbir + i; // zbir+=i;
		}
		System.out.println("Zbir brojeva od 1 do 10 iznosi: " + zbir);

	}

}
