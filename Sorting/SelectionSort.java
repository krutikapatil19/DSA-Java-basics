public class SelectionSort {
    public static  void selectionSort(int[] arr){
        int n = arr.length;

        // Outer loop 
        for(int i = 0; i < n - 1; i++){
            int minIndex = i;                               // assume the current element is the smallest

            // Inner loop - find the index of the smallest element in the remaining array
            for(int j = i + 1; j < n; j++){   
                if(arr[j] < arr[minIndex])                  // if a smaller element is found, update minIndex
                    minIndex = j;
            }
        
            int temp = arr[minIndex];                       // Swap the smallest found element with the element at index i
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args){
        int[] arr = {20, 22, 12, 9, 90, 5};

        selectionSort(arr);                                 // calling the method to sort the array
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
