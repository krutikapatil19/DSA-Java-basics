public class LeftRotateByD{
    public static void main(String[] args){

        int[] arr={2,5,10,26,30,95};

        int i;
        int D=2;
        int n=arr.length;

        //step1:to store D elements in new array i.e temp array 
        int[] temp = new int[D];
        for(i=0;i<D;i++){
            temp[i]= arr[i];
         }

         //shift the rest elements to left

         for (i =D;i<n;i++)
         arr[i- D] = arr[i];

         //copy the temp elements to the end 

         for(i=0;i<D;i++){
            arr[n-D+i]= temp[i]; //arr[arr.length-D + 1] = temp array elements //6-2+1=5 ,means at 5th position we store the temp[i]
         }

         //printing the array 
         System.out.println("The left rotated array is:" );
         for(int val : arr) {
            System.out.print(val + " ");
         }
    }
}