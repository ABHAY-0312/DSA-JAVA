//public class SingleNumber {
//    public static void main(String[] args) {
//        int arr[] = {5, 6,6, 5,8,9};
//        System.out.println(singleNumber(arr));
//    }
//
//    public static int singleNumber(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            int count = 0;
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    count++;
//                }
//            }
//            if (count == 1) {
//                return nums[i];
//            }
//        }
//        return -1; // If no single number found, return -1 or handle the case as per your requirement
//    }
//}















public class SingleNumber {
    public static void main(String[] args) {
        int arr[]={10,10,20,30,30,40,40};
       int result=singleNumber(arr);
        System.out.println(result);

    }
    public static int singleNumber(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                return nums[i];
            }
        }
        return -1;
    }
}







