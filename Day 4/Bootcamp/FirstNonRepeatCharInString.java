package Bootcamp;
import java.util.*;

public class FirstNonRepeatCharInString {
    public static char findFirstUnique(String s) {
        if (s == null || s.isEmpty()) {
            return '_'; 
        }

        int[] counts = new int[256]; // Assuming standard ASCII

        // First pass: count frequencies
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i)]++;
        }

        // Second pass: find the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (counts[s.charAt(i)] == 1) {
                return s.charAt(i);
            }
        }

        return '_'; // Return placeholder if no unique char exists
    }

    // Alternative for Unicode/any character set using LinkedHashMap
    public static char findFirstUniqueUnicode(String s) {
        if (s == null || s.isEmpty()) return '_';

        Map<Character, Integer> counts = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '_';
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(findFirstUnique(str));   
        sc.close();
    }
}
