public class SearchInRotatedArray {

    //method to check whether the first half of array is sorted or not 
    public static int search(int [] arr, int key){

        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end){
            int mid = (start + end) / 2;

            //if element found
            if(arr[mid] == key){
            return mid;
            }

            //check if the first half is sorted.
            if(arr[start] <= arr[mid]){

                //if key lies in the first half
                if(key >= arr[start] && key < arr[mid]){
                    end = mid-1;                                                //search left
                } else {
                    start = mid + 1;                                            //search right
                }
            }
            //Otherwise the second half is sorted 
            else {
                if(key >= arr[mid] && key <= arr[end]){
                    start = mid+1;                                              //search right
                } else {
                    end = mid -1;                                               //search left
                }
            }
        }
        return -1;                                                              //element not found
    }
    public static void main(String [] args){
        int[] arr = {5,6,8,2,3,4};
        int key = 4;

        int index = search (arr, key);

        if(index != -1) {
            System.out.println("Element found at index : " + index);
        }else {
            System.out.println("Element not found.");
        }
    }
    
}
