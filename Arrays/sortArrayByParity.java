import java.util.Arrays;
public class sortArrayByParity {
    public static int[] ArraySortByParity(int[] nums){
        int left = 0;
        int right = nums.length - 1;

        while(left<right){

            //if left is already even, then its in correct place
            if(nums[left]%2 ==0){
            left++;
            }
            //if right is already odd, its in correct place
            else if (nums[right] % 2 == 1){
                right --;
            }
            //if left is odd, and right is even , swap them
            else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {3,8,7,9,4,2};
        System.out.println(Arrays.toString(ArraySortByParity(nums)));
    }
}
