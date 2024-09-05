public class OnePlus {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        int[] result = plusOne(arr);
        // Print the result array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1; // Start with carry as 1 to add 1 to the last digit
        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10; // Update the current digit
            carry = sum / 10; // Update the carry for the next iteration
        }

        // If carry is still 1 after iterating through all digits, we need to add an extra digit
        if (carry == 1) {
            int[] result = new int[n + 1];
            result[0] = 1;
            for (int i = 1; i < n + 1; i++) {
                result[i] = digits[i - 1];
            }
            return result;
        } else {
            return digits;
        }
    }
}
