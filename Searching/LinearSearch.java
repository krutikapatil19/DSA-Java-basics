public class LinearSearch {
    
    public static int LinearSearching(int[] arr, int key) {

        for(int i =0; i<arr.length; i++){
            if(arr[i] == key){
                return i;                                       //returns the index of the element found
            }
        }
        return -1;                                             //return -1 if the element not found                     
    }
    public static void main (String[] args){
        int [] arr = {2, 4, 6, 10, 3};
        int key = 6;

        int result = LinearSearching(arr,key);

        if(result != -1){
            System.out.println("The element found at : " + result);
        }else {
            System.out.println("Element not Found!");
        }
    }
}
