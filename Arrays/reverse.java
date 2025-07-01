public class reverse{                     // Line 1
    public static void main(String [] args){
        int[] arr={2,4,8,10,15};

        int i = 0;
        int j = arr.length-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        System.out.println("The reversed array is:" );
        for(int num : arr)
        System.out.print(num + " ");
    }                                     
}                                         
