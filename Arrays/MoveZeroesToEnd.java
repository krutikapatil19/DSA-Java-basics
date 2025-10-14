public class MoveZeroesToEnd {
   public static void movingZeroesToEnd(int[] arr) {
      int j = 0;
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] != 0) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
         }
      }
   }

   public static void main(String[] args) {
      int[] arr = { 0, 3, 10, 0, 5, 0, 2 };
      movingZeroesToEnd(arr);
      for (int num : arr) {
         System.out.print(num + " ");
      }
   }
}
