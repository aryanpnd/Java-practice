import java.util.Scanner;

public class searchingAlgos {
    public static void binarySearch(int[]arr,int key){
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        for (int i = 0; i < arr.length; i++) {
            if(arr[mid]==key){
                System.out.print("Element found at "+(mid+1)+"th position");
                return;
            }
            else if(key>arr[mid]){
                start = mid+1;
            }else if(key<arr[mid]){
                end = mid-1;
            }
            mid = (start+end)/2;
        }
        System.out.print("Element not found");
    }

    public static void linearSearch(int[]arr,int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                System.out.print("Element found at "+(i+1)+"th position");
                return;
            }
        }
        System.out.print("Element not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements to be input : ");
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            System.out.print("Enter the " + i + "th element : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to search : ");
        int key = sc.nextInt();
        
        binarySearch(arr, key);
        System.out.println();
        linearSearch(arr, key);

    }
}
