public class stringbuild {
    public static void main(String[] args) {
    StringBuilder sb= new StringBuilder("");
    for(char ch ='a';ch<='z';ch++){
sb.append(ch);
    }
    //time complexity ( 26)
    System.out.println(sb);
    }
    
}
