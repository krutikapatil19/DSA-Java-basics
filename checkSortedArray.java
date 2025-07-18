public class checkSortedArray {
    public static void main(String [] args){
         int[] arr = {1,4,7,8,9,16,100,2789};

         boolean isSorted = false;

         int i;
         for(i =0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                break; //found unsorted pair
                }
            }
            if(i == arr.length-1){
                isSorted = true; //loop is completed , array is sorted
            }
            if(isSorted){
                System.out.println("The array is sorted in ascending order");
            }else{
                System.out.println("The array is not sorted ");
            }

    }
    
}
