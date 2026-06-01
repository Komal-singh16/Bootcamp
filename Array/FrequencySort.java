import java.util.*;
public class FrequencySort {
    public String frequencySort(String s) {
        if (s == null || s.length() == 0) return "";
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        List<Character> characters = new ArrayList<>(freqMap.keySet());
        characters.sort((a, b) -> freqMap.get(b) - freqMap.get(a));
        StringBuilder sb = new StringBuilder();
        for (char c : characters) {
            int count = freqMap.get(c);
            for (int i = 0; i < count; i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        FrequencySort fs = new FrequencySort();
        System.out.println(fs.frequencySort(s));
        sc.close();
    }
}
