import java.util.*;
import java.io.*;

class Solution {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int bs = sc.nextInt();
        char ch = sc.next().charAt(0);
        int hr =(20*bs)/100;
        int da =(50 * bs)/100;
        int pf = (11 * bs)/100;
        int allow, totalSalary;
        if (ch == 'A') {
            allow = 1700;
            totalSalary = bs+hr + da + allow - pf;
            int total=Math.round(totalSalary);
            System.out.print(total);
        } else if (ch == 'B') {
            allow = 1500;
            totalSalary = bs+hr + da + allow - pf;
            System.out.print(totalSalary);
        } else {
            allow = 1300;
            totalSalary = bs+hr + da + allow - pf;
            System.out.print(totalSalary);
        }

    }
}