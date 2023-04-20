package kostana.maksic;

public class Zadatak14a {

	public static void main(String[] args) {
		// b - trocifreni broj

		for (int b = 100; b <= 999; b++)
			if (b % 2 == 0 && b % 3 == 0)
				System.out.println(b);
	}

}
