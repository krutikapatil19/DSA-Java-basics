public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int start = 0;
        int n = arr.length ;
        
        for(int i =0; i< n ; i++){                             //outer loop (iterating through the array)

        for(int j = 0; j < n - i - 1; j++) {                   //inner loop (checks for the adjacent elements)

            if(arr[j] > arr[j+1]){                             //Swap if the elements are in wrong order
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j + 1] = temp;
        }
      }            
    }
}
public static void main(String [] args){
    int[] arr = {4,5,7,9,10,3,12};

    bubbleSort(arr);                                            //calling the method 
    
for(int num : arr){                                             //print sorted array 
    System.out.print(num + " " );
}
}
}
