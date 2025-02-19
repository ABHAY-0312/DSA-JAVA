public class subarrayprefix {
    public static void prefixsubarray(int numbers[]) {
        int currentsum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        
        prefix[0] = numbers[0];
        // Calculate prefix sum
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        // Find the maximum subarray sum
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currentsum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
                
                if (maxSum < currentsum) {
                    maxSum = currentsum;
                }
            }
        }

        // Print the maximum sum after all comparisons
        System.out.println("Max sum is : " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        prefixsubarray(numbers);
    }
}
