public class RepeatAndMissing {
   public static int[] findRepeatAndMissing(int[] arr) {
      int n = arr.length;

      //Calculate what the "sum" and "sum of sqaures" should be , if no number was missing or repeated (basically ,it calculates the expected values)
      long sumN = (long) n * (n+1)/2;
      long sumSqN = (long)n * (n+1)*(2*n +1)/6;

      //Calculate what the array actually gives
      long sumArr = 0, sumSqArr = 0;

      for(int num: arr){
         sumArr += num;                            //total of elements
         sumSqArr += (long) num * num;             //sum of squares
      }

      //Calculating the difference between actual and expected sums
      long X = sumArr - sumN;                      //A-B
      long Y = sumSqArr - sumSqN;                  //A² - B²
      long AplusB = Y/X;                           //Simplify A² - B² = (A+B)(A-B)

      //Solve two simple equations , to get A and B 
      long repeated = (X+AplusB)/2;
      long missing = repeated - X;

      //Return the result
      return new int[]{(int) repeated , (int) missing};
   }
   public static void main(String[] args) {
      int[] arr = {3,1,2,5,3};

      int[] result = findRepeatAndMissing(arr);

      System.out.println("Repeated Number: " + result[0]);
      System.out.println("Missing Number: " + result[1]);
   }
}
