import java.util.Scanner;

public class MergeSorted {
    public static void main(String[] args) {

        int[] a = {1, 3, 7, 9};
        int[] b = {2, 8, 11, 15};
        int m = a.length;
        int n = b.length;
        int[] c = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = b[j];
                k++;
                j++;

            }

        }
        if(i==a.length){
            while(j<b.length){
                c[k++]=b[j++];
            }
        }
        if(j==b.length){
            while(i<a.length){
                c[k++]=a[i++];
            }
        }
        for(int ele:c){
            System.out.println(ele);
        }

    }
}

