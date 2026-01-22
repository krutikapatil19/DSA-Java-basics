public class TwoSum2 {
    public static int[] twoSum(int[]nums, int target){

        int n = nums.length;
        int i = 0;
        int j = nums.length-1;
        while(i<j){
            int sum = nums[i]+nums[j];
            if(sum==target){
                return new int[]{i,j};
            }else if (sum> target){
                j--;
            } else {
                i++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        int[] nums = {2,5,7,8,9};
        int target = 12;
        System.out.println(twoSum(nums,target));
    }
}
