import java.util.*;
public class MOsAlgorithm {
    
    static class Query {    //it stores Left index , right index and idx(original position) of the query
        int L, R, idx;
        Query(int L, int R, int idx) {
            this.L = L;
            this.R = R;
            this.idx = idx;
        }
    }

    static int currentSum = 0;  //stores the sum of current range 

    //Add element at index i ->  its called when we include a new element into the current range .We simple add that element's value to currentSum
    static void add (int i , int[] arr) {
        currentSum += arr[i];
    }

    //Remove element at index i -> Called when we remove an eleemnt from the current range . We subtract that element's value from currentSum
    static void remove(int i , int[] arr){
        currentSum -= arr[i];
    }
    //MO's Algorithm implementation
    static int[] solveQueries(int[] arr, Query[] queries){

        int n = arr.length;
        int q = queries.length;//no. of queries

        int block = (int) Math.sqrt(n);//Block size is sqrt of array length

        //Sort queries using MO's ordering 
        //(First by block number of L, If same block then by R)
        Arrays.sort(queries, (a,b) -> {
            int blockA = a.L/block;
            int blockB = b.L/block;

            if(blockA != blockB)
                return blockA - blockB;

            return a.R - b.R;
        });

        int[] ans = new int[q];//to store final answers

        //current range pointers
        int currL = 0;
        int currR = -1;

        //Process queries in sorted order ,one by one . We move currL and currR slowly to mactch query range 
        for (Query qu: queries) {
            int L = qu.L;
            int R = qu.R;

            //Move currR -> R (expand range to the right)
            while(currR < R){
                currR ++;
                add(currR, arr);
            }
            //Shrink range from the right
            while(currR > R) {
                remove(currR, arr);
                currR--;
            }
            //Move currL -> L (shrink range from the left)
            while(currL < L) {
                remove(currL,arr);
                currL++;
            }
            while(currL>L) {
                currL--;
                add(currL,arr);
            }
            //store result for this query at original index
            ans[qu.idx]= currentSum;
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {2,5,3,1};

        Query[] queries = {
            new Query(0,2,0),
            new Query(0,3,1),
            new Query(1,3,2)
        };

        int[] result = solveQueries(arr, queries);
        System.out.println("Output : ");
        for(int x : result) {
            System.out.println(x);
        }
    }
}



