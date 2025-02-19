public class twice {

    public static void main(String[] args) {
        int arr[]={1,2,3,1};
       boolean result=printtwice(arr);
       System.out.println(result);
       
    }
    public static boolean printtwice(int arr[]){
        int n =arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    return true;
                }

                
            }
        }
       return false;
    }
}
