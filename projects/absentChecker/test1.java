import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class test1 {

    public static int minNum(int[] arr){
        int min = arr[0];  
         
        for (int i = 0; i < arr.length; i++) {  
            
           if(arr[i] < min)  
               min = arr[i];  
        }  
        return min;
    }
    public static int maxNum(int[] arr){
        int max = arr[0];  
         
        for (int i = 0; i < arr.length; i++) {  
            
           if(arr[i] > max)  
               max = arr[i];  
        }  
        return max;
    }

    public static void missingNumbers(int[] arr) {
        int minNum = minNum(arr);
        int maxNum = maxNum(arr);
        Stack<Integer> missingRollNo = new Stack<>();
        

        for (int i = minNum; i <= maxNum; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(i==arr[j]){
                    count++;
                }
            }
            if(count==0){
                missingRollNo.push(i);
            }
        }

        for (int i = 0; i < missingRollNo.size(); i++) {
            System.out.println(missingRollNo.get(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of students : ");
        String rollNo = sc.nextLine();
        String[] noOfStudent = rollNo.split(",");

        int[] intArray = new int[noOfStudent.length];

        for (int i = 0; i < noOfStudent.length; i++) {
            intArray[i] = Integer.valueOf(noOfStudent[i]);
        }
        
        missingNumbers(intArray);

    }
}
