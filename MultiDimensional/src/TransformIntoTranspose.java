public class TransformIntoTranspose {
    public static void print(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][]={{10,11,12},{13,14,15},{16,17,18}};
        int m=arr.length;
        int n=arr[0].length;
        print(arr);
        System.out.println("Transposing");
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <=i; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
            }
        print(arr);
    }
}
