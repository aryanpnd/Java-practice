/*
Complete the code segment to help Ragav , find the highest mark and average mark secured by him in "s" number of subjects.
*/

import java.util.Scanner;

public class codeAssignment5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mark_avg;
        int result;
        int i;
        int s;
        // define size of array
        s = input.nextInt();
        // The array is defined "arr" and inserted marks into it.
        int[] arr = new int[s];
        for (i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        result = 0;
        mark_avg = 0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]>result){
                result=arr[j];
            }
            mark_avg+=arr[j];
        }

        System.out.println(result);
        System.out.println(mark_avg/arr.length);
    }
}
