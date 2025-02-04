public class TwoSum {
    public static void main(String[] anrgs) {
        int[] arr={3,-1, 8 ,5,4,9,2};{
            int x=15;
            //solution
            for (int i = 0; i <arr.length; i++) {
for(int j=i+1;j<arr.length;j++){
    if(arr[i]+arr[j]==x){
        System.out.println(arr[i]+" "+arr[j]);
    }
}

            }
        }

    }
}


//class Solution {
//    public int[] twoSum(int[] ans, int target) {
//        int[] ans1=new int[2];
//        for(int i=0;i<ans.length;i++){
//            for(int j=0;j<ans.length;j++){
//                if(ans[i]+ans[j]==target){
//                    ans1[0]=i;
//                    ans1[1]=j;
//                    break;
//                }
//            }
//        }
//        return ans1;
//    }
//}
