import java.util.* ;
import java.io.*;
class Fahreheit {

    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        int S= sc.nextInt();
        int E=sc.nextInt();
        int W=sc.nextInt();
        for(int i=S; i<=E;i=i+W){
            int c=(int)((i-32)*0.555);
            if(c>=0){
                System.out.println(i + "\t" + Math.round(Math.floor(c)));
            }
            else{
                System.out.println(i + "\t" + (int)(Math.ceil(c)));

            }

        }


    }
}