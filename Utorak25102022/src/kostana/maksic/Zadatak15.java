package kostana.maksic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak15 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int sp = 0;
		int sn = 0;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos podataka o celim brojevima
		System.out.println("Unesite n");
		int n = Integer.parseInt(ulaz.readLine());

		for (int i = 1; i <= n; i++) {
			// Unos celih brojeva
			System.out.println("Unesite " + i + " broj");
			int m = Integer.parseInt(ulaz.readLine());
			// Izračunavanje sume
			if (m > 0)
				sp += m;
			else
				sn += m;
		}
		// Štampanje rezultata
		System.out.println("Zbir pozitivnih brojeva je " + sp + " a negativnih " + sn);
	}

}
