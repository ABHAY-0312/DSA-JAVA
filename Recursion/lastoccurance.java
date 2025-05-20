package Recursion;

public class lastoccurance {
    public static int lastoccurance(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastoccurance(arr, i + 1, key);
        if (isFound != -1) {
            return isFound;
        }
        if (arr[i] == key) {
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1};
        System.out.println(lastoccurance(arr, 0, 1)); // Output: 3
    }
}
