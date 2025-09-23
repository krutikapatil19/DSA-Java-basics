public class CheckSortedArray {
    public static boolean isSorted(int[] arr){
        for(int i = 1;i<arr.length;i++){
            if(arr[i] < arr[i-1]){
            return false;
            } 
        }
            return true;
            
        }
    
    public static void main(String[] args){
        int[] arr = {2,3,17,10,12,15};
        if(isSorted(arr)){
            System.out.println("The array is sorted.");
        }else {
            System.out.println("The array is not sorted.");
        }
    }
}