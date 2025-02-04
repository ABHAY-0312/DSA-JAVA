public class SmallestElement {
    public static void main(String[] args) {
        int arr[][] = {{10,9}, {7,5}, {6,1}};
        int n = arr.length;
        int m = arr[0].length;
        int mx = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mx = Math.min(mx, arr[i][j]);

            }

        }
        System.out.println(mx);
    }
}

