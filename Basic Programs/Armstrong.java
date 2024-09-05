import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
//        int n= in.nextInt();
//        boolean ans = isArmstrong(n);
//        System.out.println(ans);
        for(int i=100;i<1000;i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
    static  boolean isArmstrong(int n){
        int orginalno=n;
        int d;
        int sum=0;
        while(orginalno>0){
            d=orginalno%10;
            sum+=(int)Math.pow(d,3);
            orginalno/=10;
        }
        if(n==sum){
            return true;
        }
        else{
            return false;
        }
    }
}
