import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
      int ans=sum();
        System.out.println(ans);
    }
    static int sum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int n1=sc.nextInt();
        System.out.println("Enter 2nd number");
        int n2=sc.nextInt();
        int sum=n1+n2;
        return sum;

}
}


//    static void sum(){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter 1st number");
//        int n1=sc.nextInt();
//        System.out.println("Enter 2nd number");
//        int n2=sc.nextInt();
//        int sum=n1+n2;
//        System.out.println("The sum is :"+sum);
//    }

