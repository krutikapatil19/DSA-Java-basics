import java.util.Arrays;
public class leftRightSumDifference {
    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int leftSum = 0;//sum of elements on the LEFT side
        int rightSum = 0;//sum of elements on the RIGHT side
        int totalSum = 0;//sum of ALL elements in the array
        int[] answer = new int[nums.length];//array to store the FINAL DIFFERENCES

        //To calculate total Sum
        for(int i =0;i<n; i++) {
            totalSum += nums[i];
        }

        //At the start , everything is on the RIGHT SIDE.
        rightSum = totalSum;

        for(int i = 0;i<n;i++) {

            //IMP:We do 3 things at every index 
            rightSum -= nums[i]; //remove the current number from the RIGHT SIDE. 
            answer[i] = Math.abs(leftSum - rightSum); //Find the difference between LEFT and RIGHT . And store it in answer[i]. 
            leftSum += nums[i];//Add the current number to the LEFT side. 
        }
        return answer;
    }
    public static void main(String[] args){
        int[] nums = {10,4,8,3};
        int[] result = leftRightDifference(nums);
        System.out.println(Arrays.toString(result));
    }
}
