public class MaxAndMin {
    public static void main(String[] args){
        int [] arr = {3,6,10,9,45,68,72};

        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i]>arr[0]){
                max = arr[i];
            }
            if(arr[i]<arr[0]){
                min = arr[i];
            }
        }
        System.out.println("The maximum number in the array is :" + max);
        System.out.println("The minimum number in the array is :" +min);
    }
    
}
