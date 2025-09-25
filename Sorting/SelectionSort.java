public class SelectionSort {
    public static  void selectionSort(int[] arr){

        // Outer loop 
        for(int i = 0; i<arr.length-1; i++){
            int smallest = i;                             // assume the current element is the smallest

            // Inner loop - find the index of the smallest element in the remaining array
            for(int j = i+1; j<arr.length; j++){   
                if(arr[smallest] > arr[j]) {              // if a smaller element is found, update smallest
                    smallest = j;
            }
        }
        
            int temp = arr[smallest];                     // Swap the smallest found element with the element at index i
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args){
        int[] arr = {20, 22, 12, 9, 90, 5};
        selectionSort(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}

//time complexity of selection sort - O(n^2)