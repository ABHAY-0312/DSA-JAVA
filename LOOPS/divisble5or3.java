public class divisble5or3 {
    public static void main(String[] args) {
        int n = 100;

        for (int i = 1; i <= n; i += 1) {
            if (i % 3 == 0 || i%5==0) {
                System.out.println(i);
            }
        }
    }
}
