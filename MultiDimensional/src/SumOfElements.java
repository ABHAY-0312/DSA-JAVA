public class SumOfElements {
    public static void main(String[] args) {
        int arr[][] = {{10, 9}, {7, 5}, {6, 1}};
        int n = arr.length;
        int m = arr[0].length;
       int sum=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum+=arr[i][j];

            }

        }
        System.out.println(sum);
    }
}



