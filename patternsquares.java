import java.util.*;
class patternsquares {
public static void main(String[] args) {

        int num = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num * num + "\t");
                num++;
            }
            System.out.println();
        }
    }
}