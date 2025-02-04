package PATTERNS;

import java.util.Scanner;

public class SpecialPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int m = sc.nextInt();
     PalindromePyramidPattern(m);
//     StarBridgePattern(m);
//     StarBridgeNumberPattern(m);
  //  StarDiamondPattern(m);
      NumberSpiralPattern(m);
    }

    static void PalindromePyramidPattern(int m) {
//          1
//        1 2 1
//      1 2 3 2  1
//    1 2 3 4 3  2  1


        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }

    static void StarBridgePattern(int m)
//           * * * * * * *
//           * * *   * * *
//           * *       * *
//           *           *
    {
        for (int i = 1; i <= 2 * m - 1; i++) {
            System.out.print("*" + " ");
        }

        System.out.println();
        m--;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m + 1 - i; j++) {
                System.out.print("*" + " ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= m + 1 - i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void StarBridgeNumberPattern(int m)
//       1 2 3 4 5 6 7
//       1 2 3   5 6  7
//       1 2        6 7
//       1            7
    {
        for (int i = 1; i <= 2 * m - 1; i++) {
            System.out.print(i + "  ");
        }

        System.out.println();
        m--;
        int nbsp = 1;
        for (int i = 1; i <= m; i++) { //rows
            int a = 1;
            for (int j = 1; j <= m + 1 - i; j++) {  //number
                System.out.print(a++ + "  ");
            }
            for (int j = 1; j <= nbsp; j++)  //spaces
            {
                System.out.print(" " + "  ");
                a++;
            }
            nbsp += 2;
            for (int j = 5; j <= m + 5 - i; j++) {  //numbers
                System.out.print(a++ + "  ");
            }
            System.out.println();
        }
    }

    static void StarDiamondPattern(int m) {

//        *
//      * * *
//    * * * * *
//  * * * * * * *
//* * * * * * * * *
//  * * * * * * *
//    * * * * *
//      * * *
//        *
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        //Lower Half
        for (int i = m - 1; i >= 1; i--) {
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void NumberSpiralPattern(int m)
//            4 4 4 4 4 4 4
//            4 3 3 3 3 3 4
//            4 3 2 2 2 3 4
//            4 3 2 1 2 3 4
//            4 3 2 2 2 3 4
//            4 3 3 3 3 3 4
//            4 4 4 4 4 4 4

    {
        for (int i = 1; i <= 2*m-1; i++) {
            for (int j = 1; j <= 2*m-1; j++) {
                int a=i,b=j;
                if(i>m) a=2*m-i;
                if(j>m) b=2*m-j;
                System.out.print(m+1-Math.min(a,b)+" ");
//                System.out.print(Math.min(a,b)+" ");
            }

            System.out.println();
        }
    }
}