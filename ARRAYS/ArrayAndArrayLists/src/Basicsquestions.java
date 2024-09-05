import java.util.Scanner;

public class Basicsquestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of students");
        int x = sc.nextInt();

        int[] arr = new int[x];
        System.out.println("ENTER THE MARKS OF STUDENTS ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Marks of students who scored below 35:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 35) {
                System.out.println(arr[i]);
            }
        }
        System.out.println("Indices of students who scored 35 or above:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 35) {
                System.out.println(i);
            }
        }
    }
}
