import java.util.Scanner;

public class spiralMatrix {

    public static void printSpiralMatrix(int[][] matrix) {
        int rowStart = 0;
        int rowEnd = matrix.length;
        int colStart = 0;
        int colEnd = matrix[0].length;

        while (rowEnd > rowStart && colEnd > colStart) {

            for (int i = colStart; i < colEnd; i++) {
                System.out.print(matrix[rowStart][i] + " ");
            }
            rowStart++;

            for (int i = rowStart; i < rowEnd; i++) {
                System.out.print(matrix[i][colEnd - 1] + " ");
            }
            colEnd--;

            if (rowEnd > rowStart) {
                for (int i = colEnd - 1; i >= colStart; i--) {
                    System.out.print(matrix[rowEnd - 1][i] + " ");
                }
                rowEnd--;
            }
            if (colEnd> colStart) {
                for (int i = rowEnd - 1; i >= rowStart; i--) {
                    System.out.print(matrix[i][colStart] + " ");
                }
                colStart++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the row size : ");
        // int rows = sc.nextInt();
        // System.out.print("Enter the column size : ");
        // int columns = sc.nextInt();

        // int[][] matrix = new int[rows][columns];

        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < columns; j++) {
        // System.out.print("Enter the element for " + i + "th row " + j + "th column :
        // ");
        // matrix[i][j] = sc.nextInt();
        // }
        // }

        // System.out.println("Orignal matrix");
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < columns; j++) {
        // System.out.print(matrix[i][j]+" ");
        // }
        // System.out.println();
        // }

        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        printSpiralMatrix(matrix);

    }

}
