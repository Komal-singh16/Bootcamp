import java.util.*;
public class StringCompression {
    public static String compressString(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        
        // Append the last character and its count
        compressed.append(str.charAt(str.length() - 1)).append(count);
        
        // Return the compressed string only if it's shorter than the original
        return compressed.length() < str.length() ? compressed.toString() : str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read input from console
        String input = sc.nextLine();
        String compressed = compressString(input);
        sc.close();
        System.out.println("Original: " + input);
        System.out.println("Compressed: " + compressed);
    }
}
