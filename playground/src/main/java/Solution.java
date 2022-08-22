import java.util.Arrays;

public class Solution {
    public int [] twoSum(int [] nums, int target) {
        for (int i = 0; i < nums.length; i++ ){
            System.out.println("in 1");
            for (int j = i+1; j < nums.length; j++) {
                System.out.println("in 2");
                System.out.println("i+j:"+ i+j);
                if (nums[i]+nums[j] == target) {
                    System.out.println("in 3");
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("Solution " + Arrays.toString(solution.twoSum(new int[]{5, 2, 4}, 6)));
    }
}

/*
{5, 2, 4}, 6
 */