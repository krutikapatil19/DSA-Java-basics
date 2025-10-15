public class RepeatAndMissing {
   public static int[] findRepeatAndMissing(int[] arr) {
      int n = arr.length;

      long sumN = (long) n * (n+1)/2;
      long sumSqN = (long)n * (n+1)*(2*n +1)/6;

      long sumArr = 0, sumSqArr = 0;

      for(int num: arr){
         sumArr += num;
         sumSqArr += (long) num * num;
      }
      long X = sumArr - sumN;
      long Y = sumSqArr - sumSqN;
      long AplusB = Y/X;

      long repeated = (X+AplusB)/2;
      long missing = repeated - X;

      return new int[]{(int) repeated , (int) missing};
   }
   public static void main(String[] args) {
      int[] arr = {3,1,2,5,3};

      int[] result = findRepeatAndMissing(arr);

      System.out.println("Repeated Number: " + result[0]);
      System.out.println("Missing Number: " + result[1]);
   }
}
