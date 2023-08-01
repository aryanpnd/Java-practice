public class sortingAlgos {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] bubbleSort(int[] arr) {
        int[] tempArr = arr;
        for (int i = 0; i < tempArr.length - 1; i++) {
            for (int j = 0; j < tempArr.length - i - 1; j++) {
                if (tempArr[j] > tempArr[j + 1]) {
                    int temp = tempArr[j];
                    tempArr[j] = tempArr[j + 1];
                    tempArr[j + 1] = temp;
                }
            }
        }
        return tempArr;
    }

    public static int[] selectionSort(int[] arr) {
        int[] tempArr = arr;

        for (int i = 0; i < tempArr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < tempArr.length - 1; j++) {
                if (tempArr[smallest] > tempArr[j]) {
                    smallest = j;
                }
            }
            int temp = tempArr[smallest];
            tempArr[smallest] = tempArr[i];
            tempArr[i] = temp;
        }

        return tempArr;
    }

    public static int[] insertionSort(int[] arr) {
        int[] tempArr = arr;
    
        for (int i = 1; i < tempArr.length; i++) {
            int current = tempArr[i];
            int j = i - 1;
            while (j >= 0 && current < tempArr[j]) {
                tempArr[j + 1] = tempArr[j];
                j--;
            }
            tempArr[j + 1] = current;
        }
    
        return tempArr;
    }
    

    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 3, 8, 7, 12, 6 };

        printArray(bubbleSort(arr));
        printArray(selectionSort(arr));
        printArray(insertionSort(arr));
    }
}
