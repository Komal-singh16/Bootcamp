import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        // Essential check to prevent NullPointerException
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;
        for (int i : set) {
            if (!set.contains(i - 1)) {
                int currentNum = i;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                longest = Math.max(longest, currentStreak);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LongestConsecutiveSequence solution = new LongestConsecutiveSequence();
        
        int n = sc.nextInt(); 
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt(); 
        }
        System.out.println("Longest consecutive sequence length: " + solution.longestConsecutive(nums)); 
        sc.close(); 
    }
}
