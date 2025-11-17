public class MinimumMergeOperations {
    public static int minimumMergeOperationsToMakeAnArrayPalindrome(int[]arr){
        int left = 0;
        int right = arr.length-1;
        int count = 0;

        while(left<right){
            if(arr[left] == arr[right]){
                left++;
                right--;
            }
            else if(arr[left]<arr[right]){
                arr[left+1]=arr[left]+arr[left+1];//merge 
                left++;
                count++;
            }else {
                arr[right]=arr[right]+arr[right-1];
                right--;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {1,8,6,1};
        System.out.println(minimumMergeOperationsToMakeAnArrayPalindrome(arr));
    }
}
