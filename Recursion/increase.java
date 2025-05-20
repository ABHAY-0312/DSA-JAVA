package Recursion;

public class increase {
    public static void IncreaseNumber(int n){
        if(n==1){
            System.out.print(n+" ");
            return ;
        }
        IncreaseNumber(n-1);
      System.out.print(n+" ");
   
        
    }
    public static void main(String[] args) {
        int n =10;
IncreaseNumber(10);
    }
    
}
