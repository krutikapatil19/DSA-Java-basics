public class FirstAndLastOccurence{
    public static int FirstAndLastOccuringElement(int[] arr, int key){
        
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = (start+end) / 2;
        
            if(key == arr[mid] && (mid == 0 ||arr[mid - 1] != key)){
                return mid;                                             //first occurence found
            }
            else if( key <  arr[mid]) {
                end = mid - 1;                                          //search in left half
            }    
            else{
                start = mid + 1;                                        //search in right half
            }
        }
        return -1;                                                      //element not found
    }
    public static int lastOccurrence(int[] arr, int key){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = (start+end)/ 2;
            
            if(key == arr[mid] && (mid == arr.length-1 || arr[mid+1] != key)){
                return mid;                                             //last occurence found
            }
            else{
                start = mid + 1;                                        //element not found
            }
        }

        public static void main(String[] args) {
            int[] arr = {2,4,4,6,9,6,9};
            int key = 4;

            int first = firstOccurence(arr, key);
            int last = lastOccurence(arr, key);

            if(first != -1 && last != -1){
            System.out.println("The First Occurence of " + key + "is at index : " + first);
            System.out.println("The Last Occurence of " + key + "is at index : " + last);
            }
            else {
                System.out.println("Element not found in the array.");
            }
        }

}