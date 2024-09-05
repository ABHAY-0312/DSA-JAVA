import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int num = sc.nextInt();
        int result = addDigits(num);
        System.out.println(result);
    }

    public static int addDigits(int num) {
        int sum = 0;
        int d;
        int x = num;
        while (x != 0) {
            d = x % 10;
            sum += d;
            x /= 10;

        }
        while (sum > 9) {
            int temp = sum;
            sum = 0;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
        }
        return sum;
    }
}


