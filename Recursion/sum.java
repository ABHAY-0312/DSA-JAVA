package Recursion;

public class sum {
    public static int  sumofnaturalnumber(int n ){
      if(n==1){
        return 1;
      }
      int  sn=sumofnaturalnumber(n-1);
      int sn1=n+sn;
      return sn1 ;
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(sumofnaturalnumber(n));
    }
}
