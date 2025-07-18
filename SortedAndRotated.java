//Leetcode 1752 : Checks if a given array is sorted and rotated 
//this method checks whether the given array is rotated version of a sorted array(non-decreasing array )
public class SortedAndRotated {
    public static boolean check(int[] nums){
        int count = 0;                              //number of times the array breaks the order
        int n=nums.length;

        for(int i=0;i<nums.length;i++){
            if(nums[i] > nums[(i+1) % n]){          //if current element is greater than next (wrap using % for circular check)
                count++;                            //found one break in sorted order 
            }
            
            if(count>1)return false;                //if more than one break occured , the array is not sorted+rotated
        }
        return true ;
    }

    public static void main(String[ ] args){
        int[ ] nums ={7,8,9,3,4,5};                     //original array : 3,4,5,7,8(non-decreasing, or sorted in ascending order in which duplicates are allowed)
        System.out.println(check(nums));
    }
}
