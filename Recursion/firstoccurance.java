package Recursion;

public class firstoccurance {
    public static int  first(int arr[], int i , int  key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i ;
        }
        return first(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,80};
        System.out.println(first(arr, 0, 40));
    }
}
