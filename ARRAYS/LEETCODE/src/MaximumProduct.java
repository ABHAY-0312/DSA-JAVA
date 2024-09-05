import java.sql.SQLOutput;
import java.util.Scanner;

class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        int multiply=1;
        for(int i=0;i<n;i++){
            multiply*=i;
        }

        return multiply;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of elemnts");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
       arr[i]=sc.nextInt();

        }

    }
}