import java.util.*;
 public class OddEven{
  public   static void check(int n ){
        int bitmask =1;
        if((n & bitmask)==0){
System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args){
check(8);
check(9);
    }
}