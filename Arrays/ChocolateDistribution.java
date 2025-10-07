//Chocolate Distribution Problem
import java.util.Arrays;

public class ChocolateDistribution {
    public static int ChocoDistribution(int[] arr, int k){
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        int startIndex = 0;

        //Slide the window
        for(int i = 0; i+k-1<arr.length; i++){
            int diff = arr[i+k-1]-arr[i];               //difference between max and min .

            if(diff<minDiff){                           //update minDiff
                minDiff = diff;
                startIndex = i;                         //track start index
            }
        }

        //for(int i = 0;i<arr.length;i++){
            //indices[i] = startIndex +1;
        
        return minDiff;
    }
    public static void main(String[] args){
        int[] arr = {3,10,19,7,8,12};                   //7,8,10 = diff = 3
        int k = 3;
        System.out.println(ChocoDistribution(arr,k));
        
    }
}
       