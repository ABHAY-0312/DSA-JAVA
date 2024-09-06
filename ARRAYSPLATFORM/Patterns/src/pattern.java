package PATTERNS;


import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term you want to print first");
        int m=sc.nextInt();
        System.out.println("Enter a number of rows");
        int n = sc.nextInt();
//        pattern1(n);
      pattern2(m,n);
//        pattern3(m,n);
    }
        static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int m,int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(m+" ");
            }
            System.out.println();
            m++;
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(m-1 + " ");
            }
            System.out.println();
            m--;
        }
    }
}