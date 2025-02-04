import java.io.*;
import java.util.*;

public class Practise {

//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a =sc.nextInt();
//        double b=sc.nextDouble();
//        String s =sc.nextLine();
//        System.out.println("String: " +s);
//        System.out.println("Double: " +b);
//        System.out.println("Int: " +a);

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(bufferedReader.readLine().trim());
            for(int i=1;i<=10;i++){
                System.out.println(""+N+" * "+i+" = " +(N*i));
            }
            bufferedReader.close();
        }

}


