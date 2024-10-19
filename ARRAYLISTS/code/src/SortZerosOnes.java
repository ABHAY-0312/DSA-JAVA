public class SortZerosOnes {
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 1, 0, 0};
        int noofzeros = 0;
        int noofones = 0;
int n=arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                noofzeros++;
            } else {
                noofones++;
            }
        }
        int i=0;int j=n-1;
        while(i<j){
            if(arr[i]==0) i++;
            if(arr[j]==1) j--;
            if(i>j){
                break;
            }
            if(arr[i]==1&&arr[j]==0) {
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
        }
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i]=0;
//        }
//        for(int j=noofzeros;j<arr.length;j++){
//            arr[j]=1;
//        }


        for (int ex : arr) {
            System.out.print(ex);
        }

    }
}