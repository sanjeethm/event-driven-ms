import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public int [] twoSum(int [] nums, int target) {
      Map<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = complements.get(nums[i]);
            if (complementIndex != null) {
                return new int[]{i, complementIndex};
            }
            complements.put(target - nums[i], i);
        }

        return nums;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println("output::" + Arrays.toString(solution2.twoSum(new int[]{5, 2, 4}, 6)));
    }
}
/*

{5, 2, 4}  6
K -> V
1 -> 0
4 -> 1
 */