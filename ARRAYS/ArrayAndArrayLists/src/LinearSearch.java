import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] ;

        System.out.println("Enter the element you want to search");
        int element = sc.nextInt();
        System.out.println("Enter the size of elements : ");
        int n=sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag=false;//false means not found
        for(int i=0;i<n;i++) {
            if (arr[i] == element) {
                flag = true;//element t found
                break;

            }

        }
        if(flag==true){
            System.out.println("Element Found");
        }
        else{
System.out.println("Element Not Found");
}
}
}