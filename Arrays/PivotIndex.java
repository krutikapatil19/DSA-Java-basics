//Leetcode 724:
//Given an array of integers nums, calculate the pivot index of this array.The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
public class PivotIndex {
    public static int pivotIndex(int[] arr ){
        int total = 0;
        for(int i = 0; i<arr.length; i++){
            total += arr[i];
        }
        int leftSum = 0;
        for(int i = 0; i<arr.length; i++){
        if (leftSum == total - leftSum - arr[i]){
            return i;
        }
        leftSum += arr[i];
    }
    return -1;
    }
    public static void main(String[] args){
        int[] arr = {2,3,4,6,1,8};
        System.out.println(pivotIndex(arr));
    }
}