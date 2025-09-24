public class MoveZeroesToEnd {

   public static void movingZeroesToEnd(int[] arr){
      int index = 0 ;

      for(int i =0; i<arr.length; i++){
         if(arr[i]!=0){
            arr[index++] = arr[i];                    //Move non-zero numbers forward.
         }
      }
      //Fill the rest with zeroes
      while(index<arr.length) {
         arr[index++] =0;
      }
   }
      public static void main(String[] args){
         int[] arr = {3,8,0,5,18,0,9};
         movingZeroesToEnd(arr);
         System.out.println("Array after moving zeroes to the end : ");

         for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");

         }
      }
   }
