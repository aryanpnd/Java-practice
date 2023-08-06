/*
 Complete the code segment to find the largest among three numbers x,y, and z. You should use if-then-else construct in Java.
 */

import java.util.Scanner;

public class codeAssignment2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();
        int result = 0;
        if (x > y && x > z) {
            result = x;
        } else if (y > x && y > z) {
            result = y;
        } else if (z > y && z > x) {
            result = z;
        }

        System.out.print(result);
    }
}
