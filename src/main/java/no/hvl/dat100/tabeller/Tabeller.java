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

		for (int element : tabell) {
			if (element == tall) {
				return true;
			}
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int pos = 0;
		for (int element : tabell) {
			if (element == tall) {
				return pos;
			} else {
				pos++;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] reversertTabell = new int[tabell.length];
		
		for (int i = 0; i < tabell.length; i++) {
			reversertTabell[i] = tabell[tabell.length - 1 - i];
		}
		
		return reversertTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				return false;
			}
		}
		return true;
	}
	

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int nyTabLengde = tabell1.length + tabell2.length;
		int[] nyTabell = new int[nyTabLengde];
		
		for (int i = 0; i < tabell1.length; i++) {
			nyTabell[i] = tabell1[i];
		}
		
		for (int j = 0; j < tabell2.length; j++) {
			nyTabell[tabell1.length + j] = tabell2[j];
		}
		
		return nyTabell;
	}
}
