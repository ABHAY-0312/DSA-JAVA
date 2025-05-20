import java. util.*;
public class getSetClear {
    static int getIthBit(int n , int i ){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;
        }
        else{
            return 1;
                }
    }
    static int setIthBit(int n , int i ){
        int bitmask=1<<i;
         return n| bitmask;
    }
    static int clearIthBit(int n , int i ){
        int bitmask =~(1<<i);
        return n|bitmask;
    }
    public static void main(String[] args) {
        System.out.println(setIthBit(10, 2));
    }
}
