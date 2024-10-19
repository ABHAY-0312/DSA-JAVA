import java.util.Scanner;

public class UnlockKey {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER THE VALUE ");
        int n=in.nextInt();
        int rev=0;

        while(n>0){
            int d=n%10;
             rev=rev*10+d;
            n/=10;
        }
        int arr[]={rev};
        for(int i=0;i<arr.length-1;i++){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.println(temp);
        }
    }
}
