import java.util.Scanner;

public class arithmeticProgresion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NO OF TERMS YOU WAN TO PRINT");
        int n=sc.nextInt();
int l=1+(n-1)*3;
        for (int i = 4; i <= l; i += 3) {
            {
                System.out.print(i + " ");
            }
        }
    }
}
