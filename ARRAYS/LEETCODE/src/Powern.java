import java.util.Scanner;

public class Powern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        double n = sc.nextInt();
        System.out.println("Enter power");
        int x = sc.nextInt();
        double result = myPow(n, x);
        System.out.println(result);
    }


    private static double myPow(double n, int x) {
        return Math.pow(n, x);
    }

}
