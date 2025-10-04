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