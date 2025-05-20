package Recursion;

public class decrease {
    public static void DecreaseNumber(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }
      System.out.print(n+" ");
   DecreaseNumber(n-1);
        
    }
    public static void main(String[] args) {
        int n =10;
DecreaseNumber(10);
    }
    
}
