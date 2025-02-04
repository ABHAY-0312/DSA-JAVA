import java.util.Scanner;

public class geometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NO OF TERMS YOU WAN TO PRINT");
        int n=sc.nextInt();
        int a =3;
        for (int i = 1; i <= n; i++) {
            {

                System.out.print(a + " ");
                a=a*4;

            }
        }
    }
    }

