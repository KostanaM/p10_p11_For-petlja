package kostana.maksic;

public class Zadatak22 {

	public static void main(String[] args) {
		double p = 1;
		double s = 0;

		for (int i = 1; i <= 50; i++)
			for (int j = 1; j <= i; j++) {
				if (j != 3)
					p *= (j + 2.0) / (j - 3.0);
				s += p;
			}
		System.out.println("Rezultat je: " + s);
	}
}
