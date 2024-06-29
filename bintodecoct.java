import java.util.Scanner;

 class binary_to_dec_oct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Given Number: ");
        String binaryNum = scanner.next();

        int decimalNum = Integer.parseInt(binaryNum, 2);
        System.out.println("Decimal: " + decimalNum);

        String octalNum = Integer.toOctalString(decimalNum);
        System.out.println("Octal: " + octalNum);
    }
}