public class patterns2 {
    // public static void inverted_rotated_half_pyramid(int n) {
    //     for (int i = n; i >= 1; i--) { // Outer loop for rows, starting from n down to 1
    //         for (int j = 1; j <= n - i; j++) { // Inner loop for spaces
    //             System.out.print(" ");
    //         }
    //         for (int j = 1; j <= i; j++) { // Inner loop for stars
    //             System.out.print("*");
    //         }
    //         System.out.println(); // Move to the next line
    //     }
    // }

      public static void inverted_rotated_half_pyramid(int n) {
        for (int i = 1; i <= n; i++) { // Outer loop for rows, starting from n down to 1
            for (int j = 1; j <= n; j++) { // Inner loop for spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) { // Inner loop for stars
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void main(String args[]) {
        inverted_rotated_half_pyramid(4); // Pass the value of n
    }
}