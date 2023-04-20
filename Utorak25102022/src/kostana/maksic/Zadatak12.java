package kostana.maksic;

public class Zadatak12 {

	public static void main(String[] args) {
		// Štampanje zaglavlja
		System.out.println("\tT" + "\tS1" + "\tS2" + "\tS");
		System.out.println("\t----------------------------");
		for (int t = 0; t <= 15; t++) {

			double S1 = 2 * Math.pow(t, 3) + Math.pow(t, 2);
			double S2 = 2 * Math.pow(t, 2) + 5 * t;
			double S = Math.abs(S1 - S2);

			System.out.println("\t" + t + "\t" + S1 + "\t" + S2 + "\t" + S);
		}
	}
}