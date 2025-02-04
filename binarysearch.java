import java.util.*;

public class binarysearch {
    public static int binary(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {// right
                start = mid + 1;

            } else {// left
                end = mid - 1;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 50, 60, 70 };
        int key =50 ;
        System.out.println("KEY FOUND AT INDEX : " +binary(arr,key));
    }
}
