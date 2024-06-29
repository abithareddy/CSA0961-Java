import java.util.Scanner;

 class RectangleSymbolPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the symbol from the user
        System.out.print("Enter a symbol: ");
        char symbol = scanner.next().charAt(0);

        // Get the dimensions of the rectangle from the user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Print the rectangle symbol pattern
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}