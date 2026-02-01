import java.util.Arrays;
public class SquaresOfSortedArray {
    public static int[] squaresOfArray(int[] nums){
        int i = 0;  //i starts from beginning 
        int j = nums.length -1; //j starts from end 

        int[] result = new int[nums.length];    //new array to store the sorted squares
        int k = result.length -1;               //k fills the array from the end 
        
        while(i<=j){                            //loop until both the pointers meet

            //Calculate squares of both ends
            int squareLeft = nums[i] * nums[i];
            int squareRight = nums[j] *nums[j];

            //Compare both the squares , and place the bigger one at the end of result 
            if(squareLeft < squareRight){
                result[k] = squareRight;    //put right square       
                j--;                        //move right pointer              
                k--;                        //decrease k (to the left side)
            } else {
                result[k] = squareLeft;     //if Left square is greater than right square , put it at kth position
                i++;                        //move left pointer
                k--;                        //move k 
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(squaresOfArray(nums)));
    }
}

//I solved this problem using the two-pointer approach , in which two pointers are used ,i and j , i will start from beginning,  j will start from end.
//Compare squares → put bigger at end → move pointer → decrease k

/*Time Complexity : O(n) - one pass 
Space Complexity : O(n) - result array */