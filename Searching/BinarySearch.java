//Binary search only works on Sorted Array
package Searching;

public class BinarySearch {
    public static int binarySearch(int[] arr , int key){

        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end){
            int mid = (start + end) / 2;

            if(key == arr[mid]){
                return mid;                             //element found in the middle
                }

                else if (key > arr[mid]){
                        start = mid+1;                  //searches in the right half
                }
                else if (key < arr[mid]){
                        end = mid-1;                    //searches key in left half
                }
                }
                return -1;                              //element not found
        }
        public static void main(String[] args) {
            int [] arr = {3,5,7,9,20,12,15};
            int key = 9;

            int result = binarySearch(arr, key);       //storing the index at which key found , in result
            if(result != -1)
            System.out.println("The Key element found at :" + result);
            else{
                System.out.println("Element not Found");
            }
    }
}