import java.util.Arrays;
public class DutchFlagSortColors {
    public static int[] sortColors(int[] nums) {
        int low = 0,mid = 0, high = nums.length-1;

        while(mid <= high) {
            if(nums[mid] == 0) {
                //swap with low
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid]= temp;

                low++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else {
                //swap with high
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {0,1,2,0,2,1};
        System.out.println(Arrays.toString(sortColors(nums)));
    }
}