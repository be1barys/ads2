import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[][] myMatrix = new int[n][n];

            matrixx(myMatrix, 1, 0, 0, n);
            printMatrix(myMatrix);
        }
    }

    public static void matrixx(int[][] matrix, int value, int row, int col, int size) {
        if (size <= 0) return;
        if (size == 1) {
            matrix[row][col] = value;
            return;
        }
        for (int i = 0; i < size - 1; i++) matrix[row][col + i] = value++;
        for (int i = 0; i < size - 1; i++) matrix[row + i][col + size - 1] = value++;
        for (int i = 0; i < size - 1; i++) matrix[row + size - 1][col + size - 1 - i] = value++;
        for (int i = 0; i < size - 1; i++) matrix[row + size - 1 - i][col] = value++;

        matrixx(matrix, value, row + 1, col + 1, size - 2);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}