public class GreatestNumber {
    public static void main(String[] args) {
        int arr[][] = {{1, 2}, {3, 9}, {10, 11}};
        int n = arr.length;
        int m = arr[0].length;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mx = Math.max(mx, arr[i][j]);

            }
            System.out.println(mx);
        }
    }
}

