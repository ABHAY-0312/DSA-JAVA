public class InsertAndDelete {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abcdef");
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);
        System.out.println(sb.charAt(3));
        sb.insert(2,'g');
        System.out.println(sb);
    }
}

// insert() ----> inserts a char,int,string at a particular index and shifts the rest of the element .
// deleteCharAt() ---> You give index, that particular character is removed from the string.