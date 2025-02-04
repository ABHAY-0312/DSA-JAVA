public class MultiplicationOfElements {
    public static void main(String[] args) {
        int arr[][] = {{10, 9}, {7, 5}, {6, 1}};
        int n = arr.length;
        int m = arr[0].length;
        int product=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                product*=arr[i][j];

            }

        }
        System.out.println(product);
    }
}
