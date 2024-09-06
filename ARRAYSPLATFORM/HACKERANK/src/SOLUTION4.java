import java.util.Scanner;



class SOLUTION4 {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            print(a, b, n);
        }
    }
    private static void print(int a , int b,int  n){
        int sum=a;
        for(int j=0;j<n;j++){
            sum+=Math.pow(j,2)*b;
            System.out.println(sum);
        }

    }

}