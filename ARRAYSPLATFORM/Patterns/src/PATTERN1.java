package PATTERNS;

import java.util.Scanner;

public class PATTERN1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int m = sc.nextInt();
        System.out.println("Enter the columns");
        int n = sc.nextInt();
//        patternRectangle(m,n);
//        patternSquare(n);// can also be input m
//       patternNumber(m,n);
//       patternCharacter(m,n);
//        patternCharacter2(m,n);
    }

    static void patternRectangle(int m, int n) {
//*******
//*******
//*******

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static void patternSquare(int n) {
// *  *  *  *  *
// *  *  *  *  *
// *  *  *  *  *
// *  *  *  *  *
// *  *  *  *  *
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

    static void patternNumber(int m,int n) {
//1234
//1234
//1234
//1234
        for(int i=1;i<=m;i++)
{
    for(int j=1;j<=m;j++){
        System.out.print(j);
    }
    System.out.println(" ");
}
    }
    static void patternCharacter(int m,int n) {
//ABCD
//ABCD
//ABCD
//ABCD
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++){
                System.out.print((char)(j+64) +" ");
            }
            System.out.println(" ");
        }
    }
    static void patternCharacter2(int m,int n) {
//        A A A A A
//        B B B B B
//        C C C C C
//        D D D D D
//        E E E E E

        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++){
                System.out.print((char)(i+96) +" ");
            }
            System.out.println(" ");
        }
    }
}




