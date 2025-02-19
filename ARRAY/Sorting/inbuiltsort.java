
import java.util.Arrays;
import java.util.Collections;
public class inbuiltsort {
    public static void main(String[] args) {
        int arr[]={15,5,1,3,6,2};
        // Arrays.sort(arr);  // in ascending order
        // Arrays.sort(arr,0,5); // for specific index
        // Arrays.sort(arr ,Collections.reverseOrder()); // reverse order works in object so whe to convert int into Integer
        
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] +" ");
}
System.out.println();
    }
    
}
