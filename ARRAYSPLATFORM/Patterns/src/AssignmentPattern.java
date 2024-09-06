package PATTERNS;

import java.util.Scanner;

public class AssignmentPattern {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.println("Enter the rows");
        int m = y.nextInt();
//        Pattern1(m);
//        Pattern2(m);
//        Pattern3(m);
//        Pattern4(m);
//        Pattern5(m);
//        Pattern6(m);
//        Pattern7(m);
//        Pattern8(m);
//        Pattern9(m);
//        Pattern10(m);
//        Pattern11(m);
//        Pattern12(m);
//        Pattern13(m);
//       Pattern14(m);
//        Pattern15();
    }


    static void Pattern1(int m) {
//        1 1 1 1
//        2 2 2 2
//        3 3 3 3
//        4 4 4 4
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void Pattern2(int m)
//        1 2 3 4
//        1 2 3
//        1 2
//        1
    {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m - i + 1; j++) {

                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void Pattern3(int m)
//    A
//    A B
//    A B C
//    A B C D
    {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }
    }

    static void Pattern4(int m)
//          1
//          A B
//          1 2 3
//          A B C D
//          1 2 3 4 5
    {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print((char) (j + 64) + " ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();

        }
    }

    static void Pattern5(int m)
//            *
//            **
//            ***
//            ****
//            ***
//            **
//            *
    { //  Upper triangle
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        // Lower triangle
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m - i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void Pattern6(int m)
//                    ******
//                    * *
//                    * *
//                    ******

    {
        for (int i = 0; i < m; i++) {
            // Inner loop for printing asterisks based on the line number
            int numAsterisks;
            if (i % 3 == 0) {
                numAsterisks = 6;
            } else {
                numAsterisks = 2;
            }
            for (int j = 0; j < numAsterisks; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each line of asterisks
        }
    }

    static void Pattern7(int m)
//                        ****
//                        ****
//                        ****
    {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void Pattern8(int m)
//             1
//             1 2
//             1 2 3
//             1 2 3 4
    {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void Pattern9(int m)
//    A
//    A B
//    A B C
//    A B C D
    {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }
    }

    static void Pattern10(int m)
//                1
//                2 1
//                3 2 1
//                4 3 2 1
    {
        for (int i = 1; i <= m; i++) {
            int a = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a--;
            }
            System.out.println();
        }
    }

    static void Pattern11(int m)
//            *
//            **
//            ***
//            ****
//            ***
//            **
//            *
    {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        // Lower triangle
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m - i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }

    static void Pattern12(int m)
//          1
//        1 2 3
//      1 2 3 4 5
//    1 2 3 4 5 6 7
    {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" " + " ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    static void Pattern13(int m)
//      A

//    A B C
//
//    A B C D E
//
//    A B C D E F G
    {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" " + " ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print((char) (k + 64) + " ");
            }
            System.out.println();
        }
    }

    static void Pattern14(int m)
//      A
//
//    B A B
//
//    C B A B C
//
//    D C B A B C

    {
for(int i=0;i<=10;i++){
    for (int j = 0; j <10 ; j++) {
        
    }
}
    }
}



