import java.util.Arrays;
public class DutchFlagSortColors {
    public static int[] sortColors(int[] nums) {
        int low = 0,mid = 0, high = nums.length-1; //low -> wherenext 0 should go , mid -> current element we are checking , high -> where next 2 should come

        while(mid <= high) {    //checking until mid crosses high
            if(nums[mid] == 0) {    //if current is 0 -> send it to left side
                //swap nums[low] nad nums[mid]
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid]= temp;

                //move both pointers forward
                low++;
                mid++;
            }
            //if current is 1 -> it is already in correct middle position
            else if (nums[mid] == 1) {
                mid++;
            }
            //if current is 2 -> send it to right side
            else {
                //swap nums[mid] and nums[high]
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--; //move high backward ,mid will not move
            }
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {0,1,2,0,2,1};
        System.out.println(Arrays.toString(sortColors(nums)));
    }
}

/* I used 3 pointers in this 
 low - where the next 0 should go.
 mid - current element we are checking
 high - where the next 2 should go.

 In this , mid moves through the array , and puts 0 to the left side, 2 to the right side , 1 stays in the middle.
 */