 class Main {
    public static void main(String[] args) {
        int size = 5; // size of the square

        // print top border
        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
        System.out.println();

        // print middle rows
        for (int i = 1; i < size - 1; i++) {
            System.out.print("*"); // print left border
            for (int j = 1; j < size - 1; j++) {
                System.out.print(" "); // print hollow space
            }
            System.out.print("*"); // print right border
            System.out.println();
        }

        // print bottom border
        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}