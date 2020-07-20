package assignment8;

public class Number37 {
	final static int ROW = 3;
	final static int COLUMN = 3;

	public static void sumOfMultiDArray(int[][] array1, int[][] array2) {
		int[][] sum = new int[ROW][COLUMN];
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COLUMN; j++) {
				sum[i][j] = array1[i][j] + array2[i][j];
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] arr1 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] arr2 = new int[][] { { 4, 5, 6 }, { 2, 7, 8 }, { 3, 1, 9 } };
		sumOfMultiDArray(arr1, arr2);

	}
}
