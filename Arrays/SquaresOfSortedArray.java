import java.util.Arrays;
public class SquaresOfSortedArray {
    public static int[] squaresOfArray(int[] nums){
        int i = 0;
        int j = nums.length -1;
        int[] result = new int[nums.length];
        int k = result.length -1;
        
        while(i<=j){
            int squareLeft = nums[i] * nums[i];
            int squareRight = nums[j] *nums[j];
            if(squareLeft < squareRight){
                result[k] = squareRight;
                j--;
                k--;
            } else {
                result[k] = squareLeft;
                i++;
                k--;
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(squaresOfArray(nums)));
    }
}

//I solved this problem using the two-pointer approach , in which two pointers are used ,i and j , i will start from 0 ,iterate through the loop ,and j will start from last element.

/*Time Complexity : O(n)
Space Complexity : O(n)*/