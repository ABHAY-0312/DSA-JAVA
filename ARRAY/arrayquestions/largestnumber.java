import java.util.*;
public class largestnumber {
public static int getLargest(int numbers[]){
    int largest=Integer.MIN_VALUE; //-INFINITY
    for (int i = 0; i < numbers.length; i++) {
       if(largest<numbers[i]){
largest=numbers[i];
       } 
    }
    return largest;
}
public static void main(String[] args) {
  int numbers[]={1,9,10,15,22,5};  
  System.out.println("Largest Number:"+getLargest(numbers));
}
}
    

  