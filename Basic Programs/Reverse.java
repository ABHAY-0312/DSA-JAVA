import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int d;
        int reverse=0;
        while(n>0){
            d=n%10;
            reverse=reverse*10+d;
            n/=10;
        }
        System.out.println(reverse);
    }
}
