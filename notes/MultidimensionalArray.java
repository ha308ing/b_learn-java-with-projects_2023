package notes;

public class MultidimensionalArray {
    public static void main(String... args) {

        // int[][] matrix = new int[2][3];

        int[][] matrix = {
                { 4, 8, 15 },
                { 16, 23, 42 }
        };

        for (int i = 0; i < matrix.length; i++) {
            System.out.format("row %d: ", i + 1);
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] row : matrix) {
            for (int element : row) {
                System.out.format("%d ", element);
            }
        }

    }
}
