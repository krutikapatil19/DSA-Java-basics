public class countOfAnElement {

    //Find First Occurence
    public static int firstOccurrence(int[] arr , int key){

        int start = 0;                                                  //starting index
        int end = arr.length - 1;                                       //ending index

        while(start <= end){
            int mid = (start + end) / 2;                                //calculate mid index

            if(key == arr[mid] && (mid == 0 || arr[mid -1] != key)){    //check if the mid is the first occurence of the key
                return mid;                                             //return index , if the first occurence found
            }
            else if(key <= arr[mid]){                                   //if key is smaller or equal , move left
                end = mid-1 ;
            }
            else {
                start = mid + 1;                                        //if key is greater , move right
            }
        }
        return -1;                                                      //key not found.
    }
    

    //Find Last Occurence
    public static int lastOccurrence(int[] arr, int key){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){                                            //binary search loop 
            int mid = (start+end)/2;                                    //calculate mid index

            if(key == arr[mid] && (mid == arr.length - 1 || arr[mid+1] != key)){
                return mid;                                            //return index , if the last occurence found
            }
            else if (key < arr[mid]){                                  //if key is smaller , search left
                end = mid - 1;
            }
            else{
                start = mid + 1;                                       //if key is greater , search right
            }
        }
        return -1;                                                    //element not found
    }
public static void main(String[] args){
    int [] arr = {2, 4, 4, 4, 5, 7, 9, 11};
    int key = 4;

    int firstIndex = firstOccurrence(arr , key);
    int lastIndex = lastOccurrence(arr, key);

    if(firstIndex == -1 || lastIndex == -1) {
        System.out.println("Element not Found");
    }else {
        int count = (lastIndex - firstIndex) + 1;
        System.out.println("Count of " + key + " = " + count);
    }
}
}
