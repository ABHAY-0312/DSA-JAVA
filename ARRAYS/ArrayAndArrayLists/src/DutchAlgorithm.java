public class DutchAlgorithm {
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 2, 0, 1, 2, 1, 1, 0, 1, 0};
        int n = arr.length;
        int noofzeros = 0;
        int nofones = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) noofzeros++;
            if (arr[i] == 1) nofones++;
        }
//        for (int i = 0; i < n; i++) {
//        if(i<noofzeros) arr[i]=0;
//        else if (i<noofzeros+nofones) arr[i]=1;
//        else arr[i]=2;
        }
        for (int ele : arr) {
            System.out.print(ele + " , ");
            }
        }

}
