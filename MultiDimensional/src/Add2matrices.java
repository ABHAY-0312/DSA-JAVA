public class Add2matrices {
    public static void main(String[] args) {
        int arr[][] = {{10, 9}, {7, 5}, {6, 1}};
        int brr[][] = {{11, 9}, {10, 15}, {13, 9}};
        int m = arr.length;
        int n = arr[0].length;
        int res[][] = new int[m][n];
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
//                sum += arr[i][j] + brr[i][j];
                res[i][j] = arr[i][j] + brr[i][j];
            }

        }
//        System.out.println(sum);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");

            }
            System.out.println();
        }
    }
}
