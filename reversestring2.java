import java.util.Arrays;

class revstring {
    public static void main(String[] args) {
        String s1="MOSQUE";
        char[] charArray = s1.toCharArray();
        Arrays.sort(charArray);

        String reverseds1 = new StringBuilder(new String(charArray)).reverse().toString();

        System.out.println("Alphabetical Order: " + reverseds1);
    }
} 
  
