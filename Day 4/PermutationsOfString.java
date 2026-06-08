import java.util.*;
public class PermutationsOfString {
    public static List<String> permute(String str) {
        List<String> result = new ArrayList<>();
        backtrack(str.toCharArray(), 0, result);
        return result;
    }
    private static void backtrack(char[] chars, int index, List<String> result) {
        if (index == chars.length) {
            result.add(new String(chars));
            return;
        }
        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);
            backtrack(chars, index + 1, result);
            swap(chars, index, i); // backtrack
        }
    }
    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        List<String> permutations=permute(str);
        System.out.println("Permutations of the string:");
        for(String perm: permutations){
            System.out.println(perm);
        }
        sc.close();
    }
}
