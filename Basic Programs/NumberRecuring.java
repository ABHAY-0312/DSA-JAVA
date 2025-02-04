import java.util.Scanner;

public class NumberRecuring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
     int n=sc.nextInt();
        System.out.println("enter a no to check whether ho many times repested");
        int s=sc.nextInt();
     int count=0;
     int d;
     while(n>0){
         d=n%10;
         if(d==s){
             count++;
         }
         n/=10;
     }
        System.out.println(count);

    }
}
