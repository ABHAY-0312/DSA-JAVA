import java.util.Scanner;

public class countVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string");
        String str=sc.nextLine();
        String str1=str.toLowerCase();
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
      char ch=str1.charAt(i);
      if(isVowel(ch)==true)count++;
        }
        System.out.println(count);
    }

    private static boolean isVowel(char ch) {
        if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u') return true;
        return false;
    }
}
