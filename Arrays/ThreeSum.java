import java.util.*;
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums){                                  //defined a method threeSum that , takes an integer array nums as input //And returns list of triplets (List<List<Integer>>), where each triplet sum equals to 0.
        List<List<Integer>> result = new ArrayList<>();                                   //creates an empty list res to store the answer triplets (each triplet is a List<Integer>).
        if (nums == null || nums.length <3) {
            //If fewer than 3 numbers, can't form a triplet
            return result;
        }

        Arrays.sort(nums);                                                             //Sorts array for two pointer technique.

        int n = nums.length;
        for(int i =0; i<n-2; i++){                                                     //loops through all the elements of array , till n - 2. because we need atleast 2 more elements after the i .
            if(i > 0 && nums[i] == nums[i-1]) continue;                                //skip duplicate values for the first element of the triplet , 
            if(nums[i] > 0) break;                                                     //if the first element in sorted array is greater than 0 ,no triplets possible , so break.
            int left = i +1, right = nums.length - 1;                                  //we keep two pointer over here , left starts just after i, right starts at the end of the array 
            while ( left < right){                                                    //move right and left inward , to find pairs with nums[i] sum to zero.  // while two pointer haven't crossed , keep searching for valid pairs.
                int sum = nums[i] + nums[left] + nums [right];                         //we check the sum of the three numbers , present at the pointers i , left and right .
                if(sum == 0){                                                         //we check if the sum above is equal to 0
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));          //whenever we find a new triplet , whose sum is equal to 0 , store that triplet in res , res acts as a basket .
                    while(left < right && nums[left] == nums[left+1])left++;           //we check if the left pointer element is same as element at left pointer+1 , if its same , then we skip it , i.e. we do left++ , as we want unique triplets , not two same triplets
                                                
                        while(left<right && nums[right] == nums[right - 1])right--;    //same as above case
                    
                    left++;                                                            //if we found a valid triplet , then we move left and right inward , i.e left++ and right --
                    right--;
                } else if (sum < 0){                                                  //if the sum is lesser than 0 , then we need bigger elements , so we do left++ , as the array is sorted .
                    left++;
                } else{                                                               //if the sum is greater than 0 , then we do right-- , as we want a smaller element .
                    right--;
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        ThreeSum ts = new ThreeSum();
        int[] nums = {-1,-2,9,-8,3,1,};
        System.out.println(ts.threeSum(nums));
    }
} 