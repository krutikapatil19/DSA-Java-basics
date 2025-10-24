public class MinInRotated {
    public static int findMin(int[] nums){
        int left = 0;
        int right = nums.length - 1;

        //If the array is already sorted(no rotation) then the first element is min
        if(nums[left] <= nums[right]) {
            return nums[left];
        }
        //Binary search
        while(left<right) {
            int mid = left + (right-left)/2;

            //If mid element > right element, min must be to the right of mid
            if(nums[mid] > nums[right]) {
                left = mid +1;
            }else {
                //Otherwise, minimum is at mid or to the left of mid
                right = mid;
            }
        }
        return nums[left];
    }
    public static void main(String[] args) {
        int []nums = {4,5,6,7,1,2};
        System.out.println(findMin(nums));
    }
}
