import java.util.Scanner;

public class basics {
    public static void printLetters(String str){
        for (int i = 0; i <str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String firstname="Abhay";
        String lastname="Abh";
        String fullname= firstname+lastname;
        printLetters(fullname);
//        ABHAY
//        char arr[]={'A','B','H','A','Y'};
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]);
//        }
//String x="ABHAY";
//        System.out.println(x);
//Take input
//        Scanner sc=new Scanner(System.in);
//        System.out.println("ENTER YOUR NAME");
//        String str=sc.next();
//        System.out.println(str);

// Strings are immutable 
    }
}