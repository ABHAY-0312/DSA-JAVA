import java.util.Scanner;

public class stringBuilder {
    public static void main(String[] args) {
//        String s = new String("Abhay");
//        StringBuilder sb = new StringBuilder("abhay");
//        System.out.println(sb);
//Taking Input from the user
        Scanner sc=new Scanner(System.in);

        StringBuilder sb=new StringBuilder(sc.nextLine());
//setCharAt
        sb.setCharAt(1,'a');
        System.out.println(sb);
    }
}
