
public class maxsubarraybrute {
    public static void printSubarray(int numbers[]) {
int currentsum=0;
int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {

            for (int j = i; j < numbers.length; j++) {
               currentsum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                    currentsum += numbers[k];
                }
                System.out.println("SUM is " + currentsum);
                if(maxSum<currentsum){
                    maxSum=currentsum;
                }
                System.out.println();
               System.out.println("Max sum is : " +maxSum);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubarray(numbers);
    }
}
