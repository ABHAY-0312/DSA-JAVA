

public class doublet {
    public static void main(String[] args) {
        int arr[]={10,30,40,50,60};
        int target=50;
        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[i]+arr[j]==target){
                        System.out.println("Elements  found :" +arr[i] +" ," + arr[j]);
                    }
                }


            }
        }
    }
}
