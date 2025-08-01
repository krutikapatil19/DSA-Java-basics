public class Bubble{
    public static void bubbleSortt(int [] arr){
       
        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }

        }
    }
    public static void main(String[] args){
        int[] arr = {4,5,9,10,3,2};

        bubbleSortt(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    
}
