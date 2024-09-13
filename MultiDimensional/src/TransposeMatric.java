

public class TransposeMatric {
    public static void main(String[] args) {
        int arr[][]={{10, 9}, {7, 5}, {6, 1}};

        System.out.println("ORIGINAL ARRAY : ");
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("TRANSPOSE ARRAY : ");
        for (int i = 0; i <arr[0].length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
