import java.util.Scanner;

public class TotalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
//        String s="";
//        s+=n;
        String s = Integer.toString(n);
        System.out.println(s);
        System.out.println(s.length());

    }
}
