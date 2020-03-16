package array;

public class 转圈打印矩阵 {
	public static void printEdge(int[][] m, int row1, int col1, int row2, int col2) {
		if (row1 == row2) {
			for (int i = col1; i <= col2; i++) {
				System.out.print(m[row1][i] + " ");
			}
		} else if (col1 == col2) {
			for (int i = row1; i < row2; i++) {
				System.out.print(m[i][col1] + " ");
			}
		} else {
			int curC = col1;
			int curR = row1;
			while (curC != col2) {
				System.out.print(m[row1][curC] + " ");
				curC++;
			}
			while (curR != row2) {
				System.out.print(m[curR][col2] + " ");
				curR++;
			}
			while (curC != col1) {
				System.out.print(m[row2][curC] + " ");
				curC--;
			}
			while (curR != row1) {
				System.out.print(m[curR][col1] + " ");
				curC--;
			}
		}
	}

	public static void spiralOrderPrint(int[][] matrix) {
		int row1 = 0;
		int col1 = 0;
		int row2 = matrix.length-1;
		int col2 = matrix[0].length - 1;
		while(row1<row2&&col1<=col2){
			printEdge(matrix, row1++, col1++, row2--, col2--);
		}
	}

	public static void main(String[] args) {
		int[][] matrix={};
	}
}
