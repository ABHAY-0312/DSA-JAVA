

public class bubblesort{
    public static void bubbleSort(int arr[]) {
        boolean swapped;
        
        for (int turn = 0; turn < arr.length - 1; turn++) {
            swapped = false;

            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) { 
                System.out.println("Sorting not required");
                break; // Exiting early as the array is already sorted
            }
        }
        
        System.out.println("Sorting required and completed");
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        bubbleSort(arr);
        printArr(arr);
    }
}
