import java.util.Scanner;

public class StoreRollNo {
    public static void main(String[] args) {
//        Mannual Approach
//        int[][] ar={{76,92},{88,87},{82,98},{13,94} };
//        for(int i=0;i<ar.length;i++){
//            for(int j=0;j<ar[0].length;j++){
//                System.out.print(ar[i][j]+" ");
//            }
//            System.out.println();
//        }

//        INPUT APPROACH
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[4][2];
       for(int i=0;i<4;i++){
           for (int j=0;j<2;j++){
           arr[i][j]=sc.nextInt();
           }
       }
        for(int i=0;i<4;i++){
            for (int j=0;j<2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
