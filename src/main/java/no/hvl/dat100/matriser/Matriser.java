package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
	
		for ( int rad = 0; rad < matrise.length; rad++) {
			for (int verdi = 0; verdi < matrise[rad].length; verdi++) {
				System.out.print(matrise[rad][verdi] + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String matriseStr = "";
		for (int rad = 0; rad < matrise.length; rad++) {
			for (int kolonne = 0; kolonne < matrise[rad].length; kolonne++) {
				matriseStr += matrise[rad][kolonne];
				if (kolonne < matrise[rad].length - 1) {
					matriseStr += " ";
				}
			}
			matriseStr += " \n";
		}
		return matriseStr;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
	
			int[][] nyMatrise = new int[matrise.length][];
			
			for ( int rad = 0; rad < matrise.length; rad++) {
				nyMatrise[rad] = new int[matrise[rad].length];
				
				for (int verdi = 0; verdi < matrise[rad].length; verdi++) {
					nyMatrise[rad][verdi] = matrise[rad][verdi] * tall;
				}
			}
			return nyMatrise;
		
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
			
			int x = 0;
			int y = 0;
		
			if (a.length == b.length && a[x][y] == b[x][y]) {
				return true;
			} 
			
			else {
				return false;
			}
					
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int[][] resultMatrix = new int[a.length][b[0].length];
		if (a[0].length == b.length) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					for (int k = 0; k < a[0].length; k++) {
						resultMatrix[i][j] += a[i][k] * b[k][j];
					}
				}
			}
		}
		return resultMatrix;
	}
}
