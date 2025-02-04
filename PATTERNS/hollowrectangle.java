public class hollowrectangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows
        int cols = 5; // Number of columns

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Print '*' for the border, spaces otherwise
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
