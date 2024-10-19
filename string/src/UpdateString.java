import java.util.Scanner;

public class UpdateString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
String str="";
        for (int i = 0; i < s.length(); i++) {
            if(i%2==0){
                str+='a';
            }
            else{
                str+=s.charAt(i);
            }
            System.out.println(str);
        }
    }
}
