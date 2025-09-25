public class BubbleSort {
    public static void bubbleSort(int[] arr){
       
        for(int i =0; i< arr.length-1 ; i++){               //outer loop (iterating through the array)

        for(int j = 0; j < arr.length-i-1; j++) {           //inner loop (checks for the adjacent elements)
            if(arr[j] > arr[j+1]){                          //Swap if the elements are in wrong order
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
      }            
    }
}
public static void main(String [] args){
    int[] arr = {4,5,7,9,10,3,12};

    bubbleSort(arr);                                        //calling the method 
    for(int i = 0; i<arr.length; i++){
        System.out.print(arr[i] + " ");                     //print sorted array 
    }                                         
  }
}

