import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        boolean ans=isPrime( x);
        System.out.println(ans);
    }
    static boolean isPrime(int x){
      if(x<=1){
          return false; // since x is less than or equal to 1 is not a prime no;
      }
      int c=2;
      while(c*c<=x){
          if(x%c==0){
              return false;
          }
          c++;
      }
       return c*c>x; //return true value

    }
}
