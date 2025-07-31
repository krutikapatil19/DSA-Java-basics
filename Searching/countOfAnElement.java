public class countOfAnElement {

    //Find First Occurence
    public static int firstOccurrence(int[] arr , int key){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(key == arr[mid] && (mid == 0 || arr[mid -1] != key)){
                return mid;
            }
            else if(key <= arr[mid]){
                end = mid-1 ;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
    

    //Find Last Occurence
    public static int lastOccurrence(int[] arr, int key){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = (start+end)/2;

            if(key == arr[mid] && (mid == arr.length - 1 || arr[mid+1] != key)){
                return mid;
            }
            else if (key < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
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
