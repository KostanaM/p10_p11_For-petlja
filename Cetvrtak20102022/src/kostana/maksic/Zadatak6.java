package kostana.maksic;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {

//6. Napisati naredbe kojima se za dato n izračunava faktorijel prirodnog broja n: fakt = n! = 1*2*3*...*n
		Scanner sc = new Scanner(System.in);
		int faktorijel = 1; // 1 predstavlja neutral za mnozenje
		System.out.println("Unesite broj n: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			faktorijel = faktorijel * i;

		}
		System.out.println("Faktorijel broja " + n + " iznosi: " + faktorijel);
		sc.close();
	}
}
