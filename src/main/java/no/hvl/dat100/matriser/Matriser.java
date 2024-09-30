package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] tabell : matrise) {
			for (int x : tabell) {
				System.out.print(x + " ");
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String matriseStr = "";
		for (int[] tabell : matrise) {
			for (int x : tabell) {
				matriseStr += x + " ";
			}
			matriseStr += "\n";
		}
		return matriseStr;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("Metoden skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
