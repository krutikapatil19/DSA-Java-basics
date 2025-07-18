//Given a target sum , we have to find a subarray  with adjacent elements that adds up to the target 
public class SubarrayWithGivenSum {
    public static void main(String[] args){
        int[] arr = {3,5,7,8,9,10};
        int target = 24;

        int start=0;
        int currSum=0;                                  //This keeps track of the current window sum

        for(int end =0; end<arr.length; end++){         //traverse the array using 'end' as the window's end pointer
            currSum += arr[end];                        //add current element to the current Sum

            while(currSum>target){                      //Shrink window from the start , if limit exceeds than given target
                currSum -=arr[start];                   //subtract the element at start and move window forward
                start++;
            }
            if(currSum==target){                        //if current sum matches the target , print  theindices of the array 
                System.out.println("Subarray found from index " + start  + " to " + end);
                return;
            }
        }
        System.out.println("No Subarray Found");

    }
}
