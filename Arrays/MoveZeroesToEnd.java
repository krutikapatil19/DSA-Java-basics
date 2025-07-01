public class MoveZeroesToEnd {
    public static void main(String[] args){

        int [] arr = {0,1,0,3,0,12};

        int index = 0 ;             //this index will tell , where to put the next non-zero number

        //going through the array and pick out all non-zero numbers
        for(int i = 0; i<arr.length; i++){
            if (arr[i] != 0){
                arr[index] = arr[i];             //place the non-zero at the current'index'position
                index++;
            }
         }

         //now from the 'index' position to the end , fill with 0s

         while(index < arr.length) {
            arr[index] = 0;
            index++;
         }

         //printing the final array 
         System.out.println("Array after moving zeroes to the end: ");
         for(int num : arr ){
            System.out.print(num + " ");
         }
}
}