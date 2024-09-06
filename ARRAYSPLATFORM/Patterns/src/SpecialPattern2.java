package PATTERNS;

import java.util.Scanner;

public class SpecialPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int m = sc.nextInt();
  //      StarPlus( m);
   //    StarMultiply(m);
    //    BinaryTriangle(m);
   //     printTriangle(m);
 //      printTriangle2(m);
  //     printTriangle3(m);
       StarPyramid(m);

    }

    static void StarPlus(int m) {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                if ((m / 2 +1) == i || (m / 2+1 ) == j) {

                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }

            }
            System.out.println(" ");


        }
    }

    static void StarMultiply(int m) {

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == j || i + j == m + 1) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }

            }
            System.out.println(" ");


        }
    }

    static void BinaryTriangle(int m) {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }

            }
            System.out.println(" ");
        }
    }

    static void printTriangle(int m) {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                if ((i + j) > m) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }

    static void printTriangle2(int m) {

        for (int i = 1; i < m; i++) {
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" " + " ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    static void printTriangle3(int m) {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m - i + 1; j++) {
                System.out.print(" " + " ");
            }
            for (int k = 1; k <= m; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void StarPyramid(int m) {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}



