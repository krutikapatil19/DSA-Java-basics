import java.util.*;
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {                                   //defined a method threeSum that , takes an integer array nums as input  //And returns list of triplets(List<List<Integer>>), where each triplet equals to 0.
        List<List<Integer>> res = new ArrayList<>();                                    //creates an empty list res to store the answer triplets(each triplet is a List<Integer>).
        Arrays.sort(nums);                                                              //sorts the array , Sorting helps use two pointer technique , easily skip duplicate triplets.


        for(int i =0; i< nums.length - 2; i++) {                                        //loops through all the elements of array , till nums.length - 2 .  because we need atleast 2 more elmenets after the i .
            if (i > 0 && nums[i] == nums[i-1]) continue;                                //skip duplicate values for the first element of the triplet ,
            

            int left = i + 1, right = nums.length - 1;                                  //we keep two pointer over here , left starts just after i , right starts at the end of the array
            while(left < right) {                                                       //move right and left inward , to find pairs with nums[i] sum to zero.   //while two pointers haven't crossed , keep searching for valid pairs.
                int sum = nums[i] + nums[left] + nums [right];

                if(sum == 0) {                                                              //if sum is zero , we found a valid triplet .
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left < right && nums[left] == nums[left+1]) left++;
                    while(left < right && nums[right] == nums[right-1]) right --;
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right --;
                }
            }



        }
        return res;
    }
    
    public static void main(String[] args) {
        ThreeSum ts = new ThreeSum();
        int[] nums = {-1,0,1,3,2,-3,1};
        System.out.println(ts.threeSum(nums));
    }
    
}