package PATTERNS;

import javax.swing.*;
import java.util.Scanner;

public class TrianglePatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int m = sc.nextInt();

//    printTriangle(m);
//   printReverseTriangle(m);
//    printNumber(m);
//    printCharacter(m);
//    printNumber2(m);
  printReverseNumber2( m);
 //       printCharacterReverse( m);


    }

    static void printTriangle(int m) {
// *
//* *
//* * *
//* * * *
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");

            }
            System.out.println(" ");
        }
    }


    static void printNumber(int m){
//        1
//        12
//        123
//        1234
//        12345
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
    static void printCharacter(int m){
// A
//AB
//ABC
//ABCD
//ABCDE
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)(j+64));
            }
            System.out.println(" ");
        }
    }
    static void printNumber2(int m){
//        1
//        22
//        333
//        4444
//        55555
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
    static void printReverseTriangle(int m) {
//  * * * * *
//  * * * *
//  * * *
//  * *
//  *
//        for (int i = m; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*" + " ");
//
//            }
//            System.out.println(" ");
//        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i+1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    static void printReverseNumber2(int m){
//        1 2 3 4
//        1 2 3
//        1 2
//        1
        for (int i = 1; i <=m ; i++) {
            for (int j=1;j<=m+1-i;j++){
                System.out.print(j + "  ");
            }
            System.out.println(" ");

        }
    }
    static void printCharacterReverse(int m) {
//        A A A A A
//        B B B B
//        C C C
//        D D
//        E
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m - i + 1; j++) {
                System.out.print((char) (i + 64) + "  ");
            }
            System.out.println(" ");
        }
    }

    }





