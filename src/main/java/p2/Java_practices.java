package p2;

public class Java_practices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * for ( int i = 1; i<7; i++) { for (int j = 7;j<8; j++) { for (int s = 7;s<11;
		 * s++) { System.out.print(j+ " ");} }System.out.println(); }
		 * 
		 * String [][] students =
		 * {{"samir","aziz","simo"},{"hamis","tarik"},{"omar","baiis"},{"timo","amouta"}
		 * 
		 * }; for (int i =0; i<students.length; i++){ for ( int j = 0; j<
		 * students[i].length; j++) { System.out.print(students[i][j] + "         ");
		 * }System.out.println(); }
		 * 
		 * System.out.println(students.length);
		 * 
		 * //System.out.println(students [1][1]);[
		 * 
		 * int [] n= {11,21,31}; System.out.println(n.length); for ( int k = 0;
		 * k<n.length; k++) { System.out.println(n[k]);}
		 * 
		 * }
		 */

		int[][] q = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 11, 12, 13 } };
		for (int h = 0; h < q.length; h++) {
			for (int l = 0; l < q[h].length; l++) {
				System.out.print(q[h][l] + " ");
			}
			System.out.println();

		}

	}

}
