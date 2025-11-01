import java.util.Arrays;
public class NextPermutation {
    public static void nextPermutation(int[] nums){
        int n = nums.length;
        int i = n-2;
    //Step1:Find the dip point
    while(i>=0 && nums[i] >= nums[i+1]){
        i--;
    }
    //Step2: If dip point is found , then find element just larger than the nums[i] and swap
    if(i>=0){
        for(int j =n-1; j>i; j--){
            if(nums[j]>nums[i]){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                break;
            }
        }
    }
    //Step3:Reverse the part after i
    int start = i+1;
    int end = n-1;

    while(start<end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end]=temp;
        start++;
        end--;
    }
}
public static void main(String[] args){
    int[] nums = {1,3,2};
    System.out.println(Arrays.toString(nums));
}
}
