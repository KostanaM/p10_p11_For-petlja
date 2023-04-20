package kostana.maksic;

public class Zadatak13a {

	public static void main(String[] args) {
		int s, d, j;

		for (int b = 100; b <= 999; b++) {

			s = b / 100;
			d = (b / 10) % 10;
			j = b % 10;
			if (b == s * s * s + d * d * d + j * j * j)

				System.out.println(b);
		}

	}
}
