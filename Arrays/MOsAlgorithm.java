import java.util.*;
public class MOsAlgorithm {
    
    static class Query {
        int L, R, idx;

        Query(int L, int R, int idx) {
            this.L = L;
            this.R = R;
            this.idx = idx;
        }
    }

    static int currentSum = 0;

    //Add element at index i
    static void add (int i , int[] arr) {
        currentSum += arr[i];
    }

    //Remove element at index i 
    static void remove(int i , int[] arr){
        currentSum -= arr[i];
    }
    //MO's Algorithm implementation
    static int[] solveQueries(int[] arr, Query[] queries){

        int n = arr.length;
        int q = queries.length;

        int block = (int) Math.sqrt(n);

        //Sort queries using MO's ordering
        Arrays.sort(queries, (a,b) -> {
            int blockA = a.L/block;
            int blockB = b.L/block;

            if(blockA != blockB)
                return blockA - blockB;

            return a.R - b.R;
        });

        int[] ans = new int[q];
        int currL = 0, currR = -1;

        //Process queries in sorted order
        for (Query qu: queries) {
            int L = qu.L;
            int R = qu.R;

            //Move currR -> R
            while(currR < R){
                currR ++;
                add(currR, arr);
            }
            while(currR > R) {
                remove(currR, arr);
                currR--;
            }
            //Move currL -> L
            while(currL < L) {
                remove(currL,arr);
                currL++;
            }
            while(currL>L) {
                currL--;
                add(currL,arr);
            }
            //final answer for this query 
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



