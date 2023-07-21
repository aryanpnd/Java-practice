import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row size : ");
        int rows = sc.nextInt();
        System.out.print("Enter the column size : ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the element for " + i + "th row " + j + "th column : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the element to search : ");
        int key = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == key) {
                    System.out.print("Element found at "+"("+i+","+j+")" + " position");
                }
            }
        }
    }
}
