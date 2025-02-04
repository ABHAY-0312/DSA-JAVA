import java.util.Arrays;

public class BuildInMethods {

    public static void main(String[] args) {
        int[] arr = {30, 40, 15, 80, 59, 88};
        for(int x:arr){
            System.out.println(x+" ");
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        Arrays.sort(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


}
