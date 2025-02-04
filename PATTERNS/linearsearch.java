import java.util.*;
public class linearsearch {
    public static int linearSearch(int numbers[],int key){
for (int i = 0; i < numbers.length; i++) {
    if(numbers[i]==key){
        return i;
    }
    
    }
    return-1;
}
    public static void main(String[] args) {
int numbers[]={10,20,30,40,50,60};
int key=92;
System.out.println(linearSearch(numbers, key));
    }
}

