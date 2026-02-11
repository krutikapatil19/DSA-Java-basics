import java.util.Arrays;
public class MaxSumSubarrayOfSizeK {
    public static int maximumSumContageousArray(int[] nums,int k){
      
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0;i<k;i++){
            currSum += nums[i];
            maxSum = currSum;
        }
        
        for(int i = k;i<nums.length;i++){
            currSum = currSum - nums[i-k] + nums[i];
        }
        Math.max(currSum, maxSum);
        return maxSum;
    }
    public static void main(String[] args){
        int[] nums = {2,9,31,-4,21,7};
        int k = 3;
        System.out.println(maximumSumContageousArray(nums,k));
    }
}
