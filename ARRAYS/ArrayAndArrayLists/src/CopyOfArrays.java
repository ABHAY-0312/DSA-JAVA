import java.util.Arrays;

public class CopyOfArrays {
    public static void main(String[] args) {
        int[] arr={30,45,96,52,45,63};
        for(int ele:arr){
            System.out.print(ele +" ");
        }
        System.out.println();
//        int[] nums=arr;
//        for(int i=0;i<nums.length;i++){
//            System.out.print(nums[i]+" ");
        int[] brr= Arrays.copyOf(arr,arr.length);
        System.out.println(brr[5]);
        }
    }
