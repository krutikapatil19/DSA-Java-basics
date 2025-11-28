import java.util.*;
public class LongestSubarrayDivisibleByK {
    public static int longestSubarray(int[] arr, int k){
        int sum = 0;//Running prefix sum
        int maxLen = 0;//Store the longest valid subarray length

        //Map to store FIRST occurence of each remainder

        HashMap <Integer, Integer> map = new HashMap<>();

        //we assume that the remainder 0 was seen at index -1
        map.put (0,-1);

        for(int i = 0;i<arr.length;i++){
            sum += arr[i];              //prefix sum 

            //compute remainder
            int rem = ((sum%k)+k)%k;//the extra (+k %k) handles negative numbers safely 

            //If this remainder is seen first time ->then store it
            if (!map.containsKey(rem)){
                map.put(rem,i);
            }

            //If remainder seen before -> we found the subarray
            int length = i - map.get(rem);
            maxLen = Math.max(maxLen, length);//update maxLen with larger of the two 

        }return maxLen;
        }
        public static void main(String[] args){
            int[] arr = {2,7,6,1,4,5};
            int k = 3;
            System.out.println(longestSubarray(arr,k));
        }
    }


