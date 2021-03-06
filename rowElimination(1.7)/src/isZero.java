public class isZero {
	public static void setZeros(int[][] matrix) {
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}

			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (row[i] || row[j]) {
					matrix[i][j] = 0;
				}
			}
		}
	}

	public static void main(String arg[]) {
		int[][] matrix = { { 1, 2, 1 }, { 1, 0, 1 }, { 1, 1, 0} };
		setZeros(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
			   System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		} 
	}
}
