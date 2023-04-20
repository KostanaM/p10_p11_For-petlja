package kostana.maksic;

public class Zadatak14b {

	public static void main(String[] args) {
		int s, d, j, m;

		for (s = 0; s <= 9; s++)
			for (d = 0; d <= 9; d++)
				for (j = 0; j <= 9; j++) {
					m = 100 * s + 10 * d + j;
					if (m % 2 == 0 && m % 3 == 0)
						System.out.println(m);
				}
	}

}
