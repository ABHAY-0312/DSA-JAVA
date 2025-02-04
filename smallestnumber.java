import java.util.*;
public class smallestnumber {
public static int getLargest(int numbers[]){
    int smallest=Integer.MIN_VALUE; //-INFINITY
    for (int i = 0; i < numbers.length; i++) {
       if(smallest<numbers[i]){
smallest=numbers[i];
       } 
    }
    return smallest;
}
public static void main(String[] args) {
  int numbers[]={1,9,10,15,22,5};  
  System.out.println("SMALLEST Number:"+getLargest(numbers));
}
}
    

  