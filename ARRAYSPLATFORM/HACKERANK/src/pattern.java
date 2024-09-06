import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no rows");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int k = n - 1; k >= 1; k--) {
            for (int j = 1; j <= k; j++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }
}
