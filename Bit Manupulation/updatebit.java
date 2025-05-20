import java. util.*;
public class updatebit {
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
    public static int updatebit(int n , int i, int newBit){
        // if(newBit ==0){
        //     return clearIthBit(n, i);
        // }
        // else{
        //     return setIthBit(n, i);
        // }
         n=clearIthBit(n, i);
        int bitmask =newBit<<i;
        return n |bitmask;
    }
    public static void main(String[] args) {
        System.out.println(updatebit(10, 2 , 4));
    }
}
