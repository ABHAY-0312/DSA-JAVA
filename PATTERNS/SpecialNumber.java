package PATTERNS;

import java.util.Scanner;

public class  SpecialNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int m=sc.nextInt();
        //printSpecialNumber(m);
//        printSpecialNumber2( m);
        printSpecialNumber3(m);
    }
    static void printSpecialNumber(int m) {
//        1
//        A B
//        1 2 3
//        A B C D

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0) {
                    System.out.print(j);
                } else {
                    System.out.print((char) (j + 64));
                }
            }
            System.out.println(" ");

        }

        }
        static void printSpecialNumber2(int m){
//            1
//            1 3
//            1 3 5
//            1 3 5 7
            for (int i=1;i<=m;i++){                             // for(int i= 1;i<=m;i+=2)
          for(int j=1;j<=i;j++){                                // for(int j= 1;j<=m;j+=2)
                System.out.print((2*j-1)+ " ");
            }
            System.out.println(" ");
        }
        }
        static void printSpecialNumber3(int m){
//            1
//            2 3
//            4 5 6
//            7 8 9 10
//            11 12 13 14 15
        int a=1;
        for(int i=1;i<=m;i++){
            for (int j = 1; j <=i; j++) {
                System.out.print(a++ + " ");

            }
            System.out.println(" ");
        }
        }
}
