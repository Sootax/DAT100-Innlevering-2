package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for (int element : tabell) {
			System.out.print(element + " ");
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		if (tabell.length == 1) {
			return "[" + tabell[0] + "]";
		} else if (tabell.length == 0) {
			return "[]";
		}
		String tabellStr = "";
		for (int x = 0; x < tabell.length; x++) {
			if (x == 0) {
				tabellStr += "[" + tabell[x] + ",";
			} else if (x == tabell.length - 1) {
				tabellStr += tabell[x] + "]";
			} else {
				tabellStr += tabell[x] + ",";
			}
		}
		return tabellStr;
	}

	// c)
	public static int summer(int[] tabell) {
		int totalSum = 0;
		for (int element : tabell) {
			totalSum += element;
		}
		return totalSum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// Øyvind

		// TODO
		throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// Øyvind

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
