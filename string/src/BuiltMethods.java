public class BuiltMethods {
    public static void main(String[] args) {
        //IndexOf and CompareTo
        String s="ABHAY";
        System.out.println(s.indexOf('A'));
        System.out.println(s.lastIndexOf('A'));
        String a="abc";
        String b="dbc";
        System.out.println(a.compareTo(b));

        // Contains and startsWith
        String c="Software Developer Abhay";
        System.out.println(c.contains("o"));
        System.out.println(c.startsWith("S"));

        //toLowerCase and toUpperCase and Concatenation
        String s1="ABHAY";
        String s2="Software Engineer";
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s1.concat(s2));

        // substring(i) & substring(i,j)
//        substring(i,j)--> this gets part from i to i-1

      String m="abcd";
        System.out.println(m.substring(1));
        System.out.println(m.substring(2,4));

    }
}
