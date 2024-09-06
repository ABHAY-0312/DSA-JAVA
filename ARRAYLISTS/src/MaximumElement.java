import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements ");
        for (int i = 0; i <n ; i++) {
           arr[i]=sc.nextInt();
        }
//        int max=arr[0];
//        for (int i = 0; i <n ; i++) {
//         if(arr[i]>max) {
//             max=arr[i];
//         }
//        }
        int max=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++)


        {
            max=Math.min(max,arr[i]);
        }
        System.out.println(max);
    }
}