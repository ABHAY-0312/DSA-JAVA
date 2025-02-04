import java.util.Scanner;

public class PassingString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        String greet=myGreet(name);
        System.out.println(greet);
    }

     static String myGreet( String name) {
        String name1=" Hello " + name;
        return name1;
    }
}
