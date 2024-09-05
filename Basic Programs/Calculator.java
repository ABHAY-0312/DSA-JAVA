import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter first number:");
                int a = sc.nextInt();
                System.out.println("Enter the operand:");
                char ch = sc.next().charAt(0);

                if (ch == 'x' || ch == 'X') {
                    System.out.println("Exiting calculator. Goodbye!");
                    break;
                }

                System.out.println("Enter second number:");
                int b = sc.nextInt();

                if (ch == '+') {
                    System.out.println("The result is: " + (a + b));
                } else if (ch == '-') {
                    System.out.println("The result is: " + (a - b));
                } else if (ch == '*') {
                    System.out.println("The result is: " + (a * b));
                } else if (ch == '/') {
                    if (b != 0) {
                        System.out.println("The result is: " + ((double) a / b));
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                } else {
                    System.out.println("Invalid Input Entered");
                }

                System.out.println("Press 'x' or 'X' to stop calculation");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.next();  // Consume the invalid input to avoid an infinite loop
            }
        }
    }
}
