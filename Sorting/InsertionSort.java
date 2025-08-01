public class InsertionSort {
    public static void insertionSort(int[] arr){
        
        for(int i = 1; i< arr.length; i++){                 //starts from index 1, as the 0th index element is already sorted.
            int current = arr[i];
           int j = i-1;

           //shift elements to the right until correct position is found
           while(j >= 0 && current < arr[j]){
            arr[j+1] = arr[j];
            j--;
           }
           //placement
           arr[j+1] = current;
        }
    }
    public static void main(String[] args) {
        int [] arr = {5,3,8,4,2};
        insertionSort(arr);
        System.out.println("The sorted array is : " );
        for(int num: arr){
            System.out.print(num + " ");
        }
}
}