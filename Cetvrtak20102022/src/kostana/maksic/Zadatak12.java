package kostana.maksic;

public class Zadatak12 {

	public static void main(String[] args) {
//12. Napisati program koji prebrojava brojeve od 1 .. 20 koji su deljivi brojem 3.

		int zbir = 0;

		for (int x = 1; x <= 20; x++) {
			if (x % 3 == 0) {
				zbir++;

			}
		}
		System.out.println("Zbir brojeva od 1 do 20 koji su deljivi sa tri: " + zbir);
	}

}
