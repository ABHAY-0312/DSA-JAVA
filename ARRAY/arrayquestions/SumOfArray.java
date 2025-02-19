public class SumOfArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,50,60};
        int sum=0;
        int pro=1;
        for (int i = 0; i <arr.length; i++) {
            sum+=arr[i];
            pro*=arr[i];

        }
        System.out.println("SUM :" +sum);
        System.out.println("PRODUCT :" +pro);
    }
}
