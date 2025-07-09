public class MaxSubarraySum {                       //Kadane's Algorithm
    public static void main(String[] args){
        int[] arr = {3,5,30,2,-6,10,20};
        int currSum = 0;
        int maxSum = arr[0];

        for(int i = 0 ; i<arr.length ; i++){
            currSum += arr[i];              //to add current value of the element to currSum
            if (currSum > maxSum){
                maxSum = currSum;          //updating maxSum

            }
            //resetting currSum if it becomes 0
            if(currSum<0){
                currSum = 0;
            }
         }
         System.out.println("Maximum Subarray sum is: " + maxSum);
    }
    
}
