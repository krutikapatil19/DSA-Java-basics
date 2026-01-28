import java.util.Arrays;
public class sortArrayByParityII {
    public static int[] sortByParityII(int[] nums){
        int even = 0;
        int odd = 1;

        while(even<nums.length && odd<nums.length) {
            if(nums[even] % 2 == 0) {
                even += 2;
            }
            else if (nums[odd]%2 == 1){
                odd += 2;
            }
            else {
                //swap
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
                even += 2;
                odd += 2;
            }
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {2,4,5,7};

        System.out.println(Arrays.toString(sortByParityII(nums)));
    }
    
}
