import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class RemoveDuplicateCharacters {
    public static String removeDuplicates(String str) {
        Set<Character> ans = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!ans.contains(c)) {
                ans.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = removeDuplicates(str);
        System.out.println(result);
        sc.close();
    }            
}                
