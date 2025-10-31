public class SearchInRotatedSortedArray {
    public static int search(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                return mid;
            }
                //Case1 : Lest half is sorted
                if(nums[left] <= nums[mid]){
                    //check if target lies in this sorted half
                    if(target>=nums[left] && target<nums[mid]){
                        right = mid -1;//search left side
                    }else{
                        left = mid +1;//search right side
                    }
            }
            //Case2: Right half is sorted
            else {
                if(target>= nums[mid] && target <= nums[right]){
                    left = mid + 1;
                }
            }
        }
         return -1;
    }
    public static void main(String[] args){
        int[] nums = {3,4,5,6,0,1,2};
        int target = 0;
        System.out.println(search(nums,target));

    }
}


