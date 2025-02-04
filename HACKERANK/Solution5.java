import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of string");
        int n=sc.nextInt();
        String ch="";
        for(int i=1;i<=n;i++){
            ch=sc.nextLine();

        }
        for (int i = 1; i <=n ; i++) {
            System.out.println(""+i+" " +ch);
        }
        System.out.println();
    }
}
