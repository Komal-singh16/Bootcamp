import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            anagramMap.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(anagramMap.values());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        String[] strs = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }
        List<List<String>> groupedAnagrams = groupAnagrams(strs);
        System.out.println("Grouped Anagrams:");
        for (List<String> group : groupedAnagrams) {
            System.out.println(group);
        }
        sc.close();
    }
}
