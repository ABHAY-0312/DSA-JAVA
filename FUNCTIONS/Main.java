import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE IST VALUE");
        int x=sc.nextInt();
        System.out.println("ENTER THE 2ND VALUE");
        int y=sc.nextInt();
        System.out.println("ENTER THE 3RD VALUE");
        int z=sc.nextInt();
        Triangles(x,y,z);
    }

     static void Triangles(int x, int y, int z) {
    {
    System.out.println("EQUILATERAL TRIANGLE");
}
         else if (x == y || x == z || y == z) {
             System.out.println("ISOCELES TRIANGLE");

         } else {
             System.out.println("SCALENE TRIANGLE");
         }

         }

     }