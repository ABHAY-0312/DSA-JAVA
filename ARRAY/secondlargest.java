import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max=Math.max(max,arr[i]);

        }
        int smax=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]!=max){
               smax=Math.max(smax,arr[i]);
            }

        }
        System.out.println(max);
        System.out.println(smax);
    }
}
