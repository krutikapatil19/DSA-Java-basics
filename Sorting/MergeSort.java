public class MergeSort {
    public static void merge(int arr[], int start, int mid, int end){
        int[] temp = new int[end - start + 1];                               //temp is used to hold the merged result.
        int i = start, j = mid+1, k = 0;

        //Compare and store in temp
        while (i <= mid && j <= end) {                                      //we pick the smaller number from both halves and put it into the temp.
            temp[k++] = (arr[i] <= arr[j] ? arr[i++] : arr[j++]);
        }

        //copy remaining elements
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= end) temp[k++] = arr[j++];

        //Copy sorted temp back into original array 
        System.arraycopy(temp, 0, arr, start, temp.length);
        }

        //Main function
        public static void mergeSort(int[] arr, int start, int end) {
            if ( start >= end) return;                                      //If only 1 number is left , stop.
            int mid = (start + end) / 2;                                    //Otherwise , find the middle point of the array to split in into 2 parts.

            mergeSort(arr, start, mid);                                     //First,sort the left side of the array.
            mergeSort(arr, mid+1, end);                                     //Then sort the right side of the array.
            merge(arr, start , mid, end);                                   //Once both sides are sorted , merge them together in order. 
        }

        public static void main(String[] args){
            int[] arr ={5, 2, 4, 9, 13, 15};
            mergeSort(arr, 0, arr.length - 1);                  // sorting the arrray from start(0) to end(last element , i.e array.length - 1).

            System.out.print("Sorted Array : ");
            for(int num : arr) System.out.print(num + " ");
        }
    }
