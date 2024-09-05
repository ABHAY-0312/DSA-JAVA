import java.util.Scanner;
public class alphacheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an alphabet");
 char ch=sc.next().charAt(0);
if(ch>='A'&& ch<='Z')
{
    System.out.println("Character is in uppercase");
}
 if(ch>='a' && ch<='z'){
    System.out.println("Character is in lowercase");
}
 if(ch>='0' && ch<='9') {
     System.out.println("It is a digit");

 }
//{
//    String word="ABHAY";
//     System.out.println(word.charAt(4));
// }
    }
}
