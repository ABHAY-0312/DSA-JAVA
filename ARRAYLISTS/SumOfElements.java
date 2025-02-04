import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        int arr[]={10,23,52,60};
        int sum=0;
        int multiply=1;
        for(int i=0;i<arr.length;i++) {

            sum += arr[i];
            multiply*=arr[i];

        }
            System.out.println(sum+ " ");
        System.out.println(multiply+" ");
        }

}
