public class sortedmatrix {
    public static boolean sortedMatrix(int matrix[][], int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {  // Traverse through each row and column
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        boolean result = sortedMatrix(matrix, 50);  // Searching for target 50
        System.out.println(result);  // Should print true
    }
}
