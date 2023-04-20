package kostana.maksic;

public class Zadatak13b {

	public static void main(String[] args) {
		int m, s, d, j;

		for (s = 1; s <= 9; s++)
			for (d = 0; d <= 9; d++)
				for (j = 0; j <= 9; j++) {
					m = 100 * s + 10 * d + j;
					if (m == Math.pow(s, 3) + Math.pow(d, 3) + Math.pow(j, 3))
						System.out.println(m);
				}
	}

}
