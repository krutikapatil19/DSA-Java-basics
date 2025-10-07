//Chocolate Distribution Problem(GOG)
import java.util.Arrays;

public class ChocolateDistribution {
    public static int[] ChocoDistribution(int[] arr, int k){
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        int startIndex = 0;
        int middleIndex =0;
        int endIndex = 0;
        //Slide the window
        for(int i = 0; i+k-1<arr.length; i++){
            int diff = arr[i+k-1]-arr[i];               //difference between max and min .

            if(diff<minDiff){                           //update minDiff
                minDiff = diff;                     
                startIndex = i;                         //track start index , middleIndex, EndIndex
                middleIndex = i + 1;
                endIndex = i+k -1;                        
            }
        }
        System.out.println("Minimum difference : " + minDiff);  //print the minDiff of max and min
        return new int[] {startIndex,middleIndex,endIndex};     //return indices
    }
    public static void main(String[] args){                //1,10,15,50,51,53
        int[] arr = {1,10,15,50,51,53};                   //50,51,53 = diff = 3
        int k = 3;
        int[] idx = ChocoDistribution(arr,k);
    
        System.out.println("Indices(startIndex, middleIndex, endIndex): " + Arrays.toString(idx));

        //to print the chosen packets
        System.out.print("Chosen packets : " );
        for(int i : idx){
            System.out.print(arr[i] + " ");
        }
    }
}
       