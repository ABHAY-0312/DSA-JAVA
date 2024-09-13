public class TransposeMatricInNewMatric {
    public static void main(String[] args) {
        int arr[][] = {{10, 9}, {7, 5}, {6, 1}};
     int m=arr.length;
     int n=arr[0].length;
     int transpose[][]=new int[n][m];
//        System.out.println("ORIGINAL ARRAY : ");
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = 0; j <arr[0].length ; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
        System.out.println("TRANSPOSE ARRAY : ");
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m ; j++) {
             transpose[i][j]=arr[j][i];
                System.out.print(transpose[i][j] +" ");
            }
            System.out.println();
        }
    }
}
