package kostana.maksic;

public class Zadatak2 {

	public static void main(String[] args) {
		// 2. Napisati program koji računa kvadrat i kub brojeva od 1 do 5.

		System.out.printf("%8s%8s%8s \n", "Broj", "Kvadrat", "Kub");

		for (int broj = 1; broj <= 5; broj++) {

			System.out.printf("%8d%8d%8d \n", broj, broj * broj, broj * broj * broj);

		}

	}

}
