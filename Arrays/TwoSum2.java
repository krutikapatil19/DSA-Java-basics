import java.util.Arrays;

public class TwoSum2 {
    public static int[] twoSum(int[] nums, int target) {

        int i = 0;
        int j = nums.length - 1;

        // run until both pointers meet
        while (i < j) {
            int sum = nums[i] + nums[j];

            if (sum == target) {
                return new int[] { i + 1, j + 1 };
            } else if (sum > target) { // if sum is greater than target , then right pointer towards left
                j--;
            } else { // if sum is lesser , then move left pointer forward
                i++;
            }
        }

        // if no pair found
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] nums = { 2, 5, 7, 8, 9 };
        int target = 12;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}

// This is Two-SumII Problem (Leetcode). The array given is sorted in this , and
// we have to return the two numbers index(1-based indexing).