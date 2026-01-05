import java.util.*;
public class nextPermutation {
    public static void printNextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;

        //1.Find first index i from right such that nums[i] < nums[i+1]
        while(i>= 0 && nums[i] >= nums[i+1]) {
            i--;
        }

        //2.If such index exists, find element just larger than nums[i]
        if(i >= 0) {
            int j = n-1;
            while(nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        //3.Reverse the part after index i
        reverse(nums, i+1, n-1);
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int left, int right) {
        while(left<right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        printNextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}

/*
Complexities;
TIME: O(n)
Space: O(1) in-place 

Approach used:
- Find the first index from the right where nums[i] < nums[i+1] (pivot point)
- Swap the pivot with the smallest element greater than it on the right side.
- Reverse the elements after the pivot to get the next smallest permutation.
*/

