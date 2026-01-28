import java.util.Arrays;
public class sortArrayByParityII {
    public static int[] sortByParityII(int[] nums){
        int even = 0;//even points to even index (0, 2, 4, ...)
        int odd = 1;// odd points to odd index  (1, 3, 5, ...)


        while(even<nums.length && odd<nums.length) {

         // if even index has even number, then its in correct place

            if(nums[even] % 2 == 0) {
                even += 2;//// move to next even index
            }
            // if odd index has odd number,then its in correct place
            else if (nums[odd]%2 == 1){
                odd += 2;
            }
            else {
            // both positions are wrong -> swap them

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
