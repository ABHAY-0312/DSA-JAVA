import java.util.*;
public class array {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[]=new int[n];
        scan.close();
        int b[];
        for(int i=0;i<a.length;i++){
          b[i]=scan.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(b[i]);
        }
    }
}
