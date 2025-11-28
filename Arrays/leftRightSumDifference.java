import java.util.Arrays;
public class leftRightSumDifference {
    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int leftSum = 0;
        int rightSum = 0;
        int totalSum = 0;
        int[] answer = new int[nums.length];

        //To calculate total Sum
        for(int i =0;i<n; i++) {
            totalSum += nums[i];
        }

        //Step2: Now rightSum will follow totalSum
        rightSum = totalSum;

        for(int i = 0;i<n;i++) {
            rightSum -= nums[i];
            answer[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }
        return answer;
    }
    public static void main(String[] args){
        int[] nums = {10,4,8,3};
        int[] result = leftRightDifference(nums);
        System.out.println(Arrays.toString(result));
    }
}
