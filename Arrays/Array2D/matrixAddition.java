package Arrays.Array2D;

import java.util.Scanner;

public class matrixAddition {

    public static void printMatrix (int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void getMatrixValues (int[][] matrix, int row, int col, Scanner input) {
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print("[" + i + "][" + j + "]: ");
                matrix [i][j] = input.nextInt();
            }
        }
    }

    public static void additionOfMatrix (int[][] matrix_1, int[][] matrix_2) {
        int[][] resMatrix = new int [matrix_1.length][matrix_1[0].length];
        for (int i = 0; i < matrix_1.length; i++) {
            for (int j = 0; j < matrix_1[0].length; j++) {
                resMatrix[i][j] = matrix_1[i][j] + matrix_2[i][j];
            }
        }
        System.out.println("\nAddition Successful...");
        printMatrix(resMatrix);
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int column = input.nextInt();
        int[][] matrix_1 = new int [row][column];
        int[][] matrix_2 = new int [row][column];

        System.out.println("******Matrix 1******");
        getMatrixValues (matrix_1, row, column, input);
        System.out.println("******Matrix 2******");
        getMatrixValues (matrix_2, row, column, input);

        System.out.println("\n\n******Matrix 1******");
        printMatrix(matrix_1);
        System.out.println("******Matrix 2******");
        printMatrix(matrix_2);

        additionOfMatrix (matrix_1, matrix_2);

        input.close();
    }
}
