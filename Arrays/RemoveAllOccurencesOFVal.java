public class RemoveAllOccurencesOFVal {
    public static int removeOccurencesOfNumber(int[] nums, int val){

        int i = 0;
        int j = 0;
        
        for( i = 0;i<nums.length; i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            } else {
            }
        }
        return j;
    }
    public static void main(String[] args){
        int[] nums = {0,1,2,2,0,4,2};
        int val = 2;
        System.out.println(removeOccurencesOfNumber(nums,val));
    }
}
