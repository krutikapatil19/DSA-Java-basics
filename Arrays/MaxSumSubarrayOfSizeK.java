public class MaxSumSubarrayOfSizeK {
    public static int maximumSumContageousArray(int[] nums,int k){
      
        if(nums== null|| nums.length<k ) return -1;

        int currSum = 0;    //stores sum of current window
        int maxSum = Integer.MIN_VALUE; //stores best (maximum) sum found

        //step 1: build the first window of size k
        for(int i = 0;i<k;i++){
            currSum += nums[i];
        }

            //first window itsel
            maxSum = currSum;
        
        for(int i = k;i<nums.length;i++){
            currSum = currSum - nums[i-k] + nums[i];
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args){
        int[] nums = {2,9,3,-4,21,7}; 
        int k = 3;
        System.out.println(maximumSumContageousArray(nums,k));
    }
}
