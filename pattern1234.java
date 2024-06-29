 class PatternPrinter {
    public static void main(String[] args) {
        int n = 4; // number of rows

        // print the upper half of the pattern
        for (int i = 1; i <= n; i++) {
            // print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // print the numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // print the lower half of the pattern
        for (int i = n - 1; i >= 1; i--) {
            // print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // print the numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}