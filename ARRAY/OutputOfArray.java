import java.util.Scanner;

public class OutputOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        {
            for (int i = 0; i <n ; i++) {
                arr[i]=sc.nextInt();

            }
            System.out.println("Elemnts are : ");{
            for (int i = 0; i <n ; i++) {
                System.out.println(arr[i]+ " ");

            }
        }
        }
    }
}