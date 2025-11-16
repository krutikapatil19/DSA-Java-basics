import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class MergeOverlappingIntervals {
    public static int[][] mergingOverlappingIntervals(int[][] intervals){

        //sort all intervals by their start value
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        
        //Take the first interval as the"current" interval . We will compare other intervals with this  , and merge if needed.
        int[] current = intervals[0];

        //Create a list to store final merged intervals
        List<int[]> result = new ArrayList<>();

        for(int i = 1;i<intervals.length;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];

            if(start<= current[1]) {
                //if they overlap -> then merge them
                current[1] = Math.max(current[1],end);
            } else {
                //if they don't overlap -> store current interval
                result.add(current);
                current = intervals[i];
            }
        }
        result.add(current);
    return result.toArray(new int[result.size()][]);
    }
    public static void main(String[] args){
        int[][] intervals = {{2,6},{1,3},{8,10}};
        System.out.println(Arrays.deepToString(mergingOverlappingIntervals(intervals)));
    }
}
