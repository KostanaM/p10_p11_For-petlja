package kostana.maksic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak18 {

	public static void main(String[] args) throws Exception {
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		double x, y;
		for (int i = 1; i <= 5; i++) {
			System.out.println("Unesite " + i + ". vrednost za x:");
			x = Double.parseDouble(ulaz.readLine());
			if (x < 2)
				y = x;
			else if (x < 3)
				y = 2;
			else
				y = x - 1;
			System.out.println("Za uneto x=" + x + " dobija se y=" + y);
		}

	}

}
