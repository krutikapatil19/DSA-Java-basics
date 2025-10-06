public class prac2{
    public static int Min(int[] arr ){

        int Min = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length; i++){
            if(Min>arr[i]){
                Min = arr[i];
            }
        }
        return Min;
    }
    public static int Max(int[] arr){
    int Max = Integer.MIN_VALUE;
    for(int i = 0;i<arr.length;i++){
        if(Max<arr[i]){
            Max = arr[i];
        }
    }
    return Max;
}    
    public static void main(String[] args){
        int[] arr = {3,9,10,29,100,34};
        System.out.println("The Maximum value and Minimum value in the array is respectively :" + Max(arr) + " and " + Min(arr));
        //System.out.println("The Minimum value in the array is :" + Min(arr));
    }

}