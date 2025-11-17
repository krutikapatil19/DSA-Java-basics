public class MinimumMergeOperations {
    public static int minimumMergeOperationsToMakeAnArrayPalindrome(int[]arr){
        int left = 0;
        int right = arr.length-1;
        int count = 0;//no. of merge operations done 

        while(left<right){
            //CASE 1: Both elements are equal -> already matching pair
            if(arr[left] == arr[right]){ 
                left++;
                right--;
            }
            //CASE 2: left element < right element -> merge on left side 
            else if(arr[left]<arr[right]){

                //merge arr[left] with arr[left+1] 

                arr[left+1]=arr[left]+arr[left+1];
                left++;//move pointer 
                count++;//merged 
            }else {

                //CASE 3: Right value is smaller , merge arr[right] with arr[right-1]
                arr[right-1]=arr[right]+arr[right-1];
                right--;//move pointer
                count++;//merged
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {1,8,6,1};
        System.out.println(minimumMergeOperationsToMakeAnArrayPalindrome(arr));
    }
}
