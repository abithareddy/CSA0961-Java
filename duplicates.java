import java.util.*;
class removeduplicates {
public static void main(String[] args) {
        int[] array = {10, 20, 20, 30, 40, 40, 50};

        
        int[] nonDuplicateArray = Arrays.stream(array).distinct().toArray();

        System.out.println("Non-duplicate items:");
        System.out.println(Arrays.toString(nonDuplicateArray));
    }
}